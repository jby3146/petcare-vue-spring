<template>
    <v-container>
        <v-layout>
            <v-flex>
                <h1 style="text-align:center">방문펫시터 예약</h1>
                <br/>
                <div style="text-align:center;width:100%; margin:15px; padding:20px;">
                    <div style="text-align:center;width:50%; background:#F2F2F2; display:inline-block;">
                        <v-text-field label="start date" type="date" value="2019-12-02" v-model="start"></v-text-field>
                        <v-text-field label="start time" type="time" suffix="PST" value="09:00" v-model="starttime"></v-text-field>
                        <v-text-field label="end date" hint="year-month-day" type="date" value="2019.12.02" v-model="end"></v-text-field>
                        <v-text-field label="end time" type="time" suffix="PST" value="10:00" v-model="endtime"></v-text-field>
                        <v-btn v-on:click="reservation">예약하기</v-btn>
                    </div>
                </div>
                
           </v-flex>
        </v-layout>
    </v-container>
</template>
<script>
import axios from "axios"
import api from '../../api'
import router from "../../router";
import swal from 'sweetalert';

export default {
  data: () => ({
      start:"2019-11-22",
      end:"2019-11-22",
      params:{
          petsize : "",
          pettype : "",
          petname : "",
          petage : 0,
          user_email : "test" ,
          useraddress :" ",
          detail_adress : "",
          reservationtype : "visit",
          start :"",
          end : "",
      },
      starttime:"09:00",
      endtime:"10:00"
  }),
  components:{
      swal,
  },
  methods:{
      async reservation(){
      
         swal({
            title: "예약이 완료되었습니다.",
            text: "담장자가 배정되면 연락드릴게요\(^_^)/",
            icon: "success",
            button: "확인"
          });
          let petdata = JSON.parse(sessionStorage.getItem("userpetlist"))
          let addressdata = JSON.parse(sessionStorage.getItem("useraddress"))

        //   this.params.useraddress = sessionStorage.getItem("useraddress");
          this.params.petsize = petdata[0].weight;
          this.params.pettype = petdata[0].pettype;
          this.params.petname = petdata[0].petname;
          this.params.petage = petdata[0].petage;
          this.params.user_email = "test@naver.com" 
          this.params.useraddress = addressdata.address;
          this.params.detail_adress = addressdata.addressdetail
          this.params.reservationtype = "visit"
          this.params.start =this.start+" " +this.starttime+":00"
          this.params.end = this.end + " " + this.endtime
          console.log(this.params)

          let result = await api.VisitReservation(this.params);
          console.log(result.state);
          this.$router.push("/");
     }
  }
};

</script>