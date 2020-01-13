<template>
    <v-container>
        <v-layout column>
            <v-flex v-on:click="onoff" cursor="pointer">
                <v-btn icon >
                    <v-icon>fas fa-search</v-icon>
                </v-btn>주소 검색
            </v-flex>
            <v-flex xs12>
                <v-text-field disabled label="address" :value="address" type="text" ></v-text-field>
            </v-flex>
            
            <v-flex>
                <v-dialog v-model="dialogstatus" width="600px">
                    <DaumPostcode :on-complete="handleAddress"/>
                </v-dialog>
            </v-flex>
            <br/>
            <v-text-field label="상세주소" hint="Ex. xx아파트 x동 xxx호" type="text" v-model:value="detail" ></v-text-field>
            <v-btn v-on:click="sessionon">Next</v-btn>
        </v-layout>
    </v-container>
    
</template>
<script>
import axios from "axios"
import DaumPostcode from 'vuejs-daum-postcode'
import api from '../../api'
import router from "../../router";
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
    console.log(fullAddress) // e.g. '서울 성동구 왕십리로2길 20 (성수동1가)'
    console.log(extraAddress)
    console.log(data.center)
    console.log(thistemp==this)
}

export default {
  data: () => ({
    title: "",
    dialogstatus:false,
    address:"",
    appKey: '173a22b275c412d228aeb30b954d1217', // 테스트용 appkey
    x:0.0,
    y:0.0,
    searchdata:"광진공작아파트 2동",
    temper:[],
    useraddress:{},
    detail:""
  }),
  components: {
    DaumPostcode
  },
  methods: {
        // 지도가 로드 완료되면 load 이벤트 발생
        searchingMap () {
            let SplitStr = this.address.split('(');
            // console.log(SplitStr[0] + "   dfdf   ")
            let call_location = "https://dapi.kakao.com/v2/local/search/address.json?query="+SplitStr[0]
            console.log(call_location)
            axios.get(call_location, {
              headers :{Authorization:"KakaoAK 173a22b275c412d228aeb30b954d1217"}
            })
            .then(function (response) {
              console.log(response)
              thistemp.x = response.data.documents[0].x;
              thistemp.y = response.data.documents[0].y;
              thistemp.temp = response;
            })
            .catch(function (error) {
            });
        },
        handleAddress,
        onoff() {
            thistemp = this;
            console.log(this.dialogstatus)
            this.dialogstatus=!this.dialogstatus
        },
        sessionon(){
            this.useraddress.address = this.address
            this.useraddress.addressdetail = this.detail
            sessionStorage.setItem("useraddress",JSON.stringify(this.useraddress));
            this.$router.push("/visitreservationpet");
        }
    },
    watch:{
      address:function () {
          this.dialogstatus=!this.dialogstatus
          console.log(this.address + " ---data 제대로 오나요?")
          this.searchingMap();
          console.log(this.temper.data);
          console.log(this==thistemp)
      }
    }
};

</script>