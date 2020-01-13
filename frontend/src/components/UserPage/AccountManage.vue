<template>
  <v-container fluid style="border: 1px solid #E6E6E6; background: #F2F2F2; color: #848484;">
    <v-row>
      <v-col>이메일</v-col>
      <v-col class="text-right">{{email}}</v-col>
    </v-row>

    <v-divider></v-divider>

    <v-row>
      <v-col>이름</v-col>
      <v-col class="text-right">{{name}}</v-col>
    </v-row>

    <v-divider></v-divider>


    <v-row>
      <v-col>성별</v-col>
      <v-col class="text-right">{{gender}}</v-col>
    </v-row>

    <v-divider></v-divider>

    <v-row>
      <v-col>가입일<br />{{ date }}</v-col>
      <v-col class="text-right">
        <v-dialog persistent v-model="dialog" width="400">
          
        </v-dialog>
      </v-col>
    </v-row>

    <v-divider></v-divider>

    <v-row>
      <v-col>주소<br />{{ address }}</v-col>
      <v-col class="text-right">
        <a @click="onoff" style="color: #848484;" icon>수정하기<v-icon>{{ 'mdi-chevron-double-right' }}</v-icon></a>
        <v-dialog v-model="dialogstatus" width="600px">
          <DaumPostcode :on-complete="handleAddress" />
        </v-dialog>
      </v-col>
    </v-row>
    
    <v-divider/>

    <v-btn @click="updateUser">수정내역 저장</v-btn>
  </v-container>
</template>

<script>
import DaumPostcode from 'vuejs-daum-postcode'
import axios from 'axios'
import api from '../../api'
import router from "../../router";
import swal from 'sweetalert';

let thistemp;
var handleAddress = (data) => {
  let fullAddress = data.address
  let extraAddress = ''
  if (data.addressType === 'R') {
    if (data.bname !== '') {
      extraAddress += data.bname
    }
    if (data.buildingName !== '') {
      extraAddress += (extraAddress !== '' ? `, ${data.buildingName}` : data.buildingName)
    }
    fullAddress += (extraAddress !== '' ? ` (${extraAddress})` : '')
  }
  thistemp.address = fullAddress;
}

export default {
  components: {
    DaumPostcode,
    swal
  },
  data() {
    return {
      dialog: false,
      dialogstatus: false,
      address: "",
      email:"",
      cnt:0,
      date:"",
      gender:"",
      name:"",
      params:{
        email:"",
        address:"",
        x:0,
        y:0
      }
    }
  },
  created:function(){
    this.cnt = 0;
    this.searchUser();
    
  },
  mounted(){
  },
  watch: {
    address: function() {
      if(this.cnt>0){
        this.dialogstatus = !this.dialogstatus
      }
      this.cnt++;
      let SplitStr = this.address.split('(');
      console.log(SplitStr)
      let call_location = 'https://dapi.kakao.com/v2/local/search/address.json?query='+SplitStr[0] +''
      console.log(call_location)
      axios.get(call_location, {
          headers: {
            Authorization: "KakaoAK 173a22b275c412d228aeb30b954d1217"
          }
        })
        .then(function(response) {
          thistemp.x = response.data.documents[0].x;
          thistemp.y = response.data.documents[0].y;
        })
        .catch(function(error) {});
    }
  },
  methods: {
    handleAddress,
    onoff() {
      thistemp = this;
      this.dialogstatus = !this.dialogstatus
    },
    updatebtn(){
      this.updateUser(); 
    },
    async searchUser(){
      console.log(1)
      this.email = sessionStorage.getItem("email")
      let datas = await api.SearchOnceUser(this.email)
      this.email=datas.data.email;
      this.address = datas.data.address
      this.name = datas.data.name;
      this.gender = datas.data.gender;
      this.date = datas.data.timestamp;
      console.log(datas)
    },
    async updateUser(){
      this.params.email = this.email;
      this.params.address = this.address;
      this.params.x = this.x;
      this.params.y = this.y;

      let result = await api.UpdateUser(this.params);
      if(result.data.state==1){
        swal({
            title: "업데이트 완료!",
            icon: "success",
            button: "확인"
          });
          console.log("옴?")
      }
      else {
        swal({
            title: "업데이트 실패ㅜㅠ",
            icon: "fail",
            button: "확인"
          });
          console.log("옴?2");
      }
    }
  }
}
</script>

<style lang="css" scoped>
</style>
