<template>
<v-sheet height="600">
  <v-calendar type="month" v-model="now" today="now" month="2019-11" :events="events" color="#91E0F4">
  </v-calendar>

</v-sheet>
</template>

<script>
import api from '../../api'
import router from "../../router";
import axios from 'axios'
import swal from 'sweetalert';

export default {
  data() {
    return {
      events: [{
          name: '가정집펫시터',
          start: '2019-11-03',
          end: '2019-11-04',
        }
      ],
      now:"2019-11-04"
    }
  },
  created(){
    let date = new Date();
    let year = date.getFullYear();
    let month = date.getMonth();
    let day = date.getDate();
    this.now=year+"-"+month+"-"+day;
    this.searchoncereservation();
    this.searchoncereservationM();
    console.log(this.now);
  },
  mounted(){
    
  },
  methods:{
    async searchoncereservation(){
      let search = await api.searchoncereservation(sessionStorage.getItem("email"));
      for(var i = 0 ; i< search.data.length ; i++){
        if(i==0){
          this.events[0].start=search.data[i].start.split(" ")[0];
          this.events[0].end=search.data[i].end.split(" ")[0];;
          this.events[0].name=search.data[i].reservation_type;
        }
        else{
          let temp = {
            start:search.data[i].start.split(" ")[0],
            end:search.data[i].end.split(" ")[0],
            name:search.data[i].reservation_type
          }
          this.events.push(temp);
        }
      }
      console.log(this.events)
    },
    async searchoncereservationM(){
      let search = await api.searchoncereservationM(sessionStorage.getItem("email"));
      for(var i = 0 ; i< search.data.length ; i++){
        if(i==0&&events.length==1){
          this.events[0].start=search.data[i].start.split(" ")[0];
          this.events[0].end=search.data[i].end.split(" ")[0];;
          this.events[0].name=search.data[i].reservation_type+"matchingOK";

        }
        else{
          let temp = {
            start:search.data[i].start.split(" ")[0],
            end:search.data[i].end.split(" ")[0],
            name:search.data[i].reservation_type
          }
          this.events.push(temp);
        }
      }
    },

  }

}
</script>

<style lang="css" scoped>
</style>
