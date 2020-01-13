<template>
    <v-app-bar app fixed class="grey lighten-3" style="opacity:0.8">
      <v-toolbar-title id="title" @mouseover="mouseover = true" @mouseout="mouseover = false" v-show="!mouseover"><router-link to="/" id="linkToHome"><b>도담도담</b></router-link></v-toolbar-title>
      <v-toolbar-title id="title" @mouseover="mouseover = true" @mouseout="mouseover = false" v-show="mouseover"><router-link to="/" id="linkToHome"><b>1등 펫시터</b></router-link></v-toolbar-title>
        <!-- #B1AFCD
        #OC90AD -->
      <v-spacer></v-spacer>

      <v-toolbar-items id="items">
        <v-btn to='/visitreservation' text>방문펫시터</v-btn>
        <v-btn to='/reservation' text>가정집펫시터</v-btn>
        <v-btn to='/applicate' text>펫시터 지원</v-btn>
        <v-btn to='/notice' text>공지사항</v-btn>
        <v-btn to='/qna' text>Q&A</v-btn>
        <v-spacer></v-spacer>
        <v-spacer></v-spacer>
        <v-dialog persistent v-model="dialoglogin" width="600px">
          <template v-slot:activator="{ on }">
            <v-btn text v-if="name" @click="logout">로그아웃</v-btn>
            <v-btn text v-on="on" v-else >로그인</v-btn>
          </template>
          <UserLoginForm v-on:cancel="dialoglogin=false"/>
        </v-dialog>
        <v-dialog persistent v-model="dialogsign" width="600px">
          <template v-slot:activator="{ on }">
            <v-btn to='/userpage' text v-if="name">{{name}}님 환영합니다.</v-btn>
            <v-btn text v-on="on" v-else>회원가입</v-btn>
          </template>
          <UserSignUpTOS v-on:cancel="dialogsign=false"/>
        </v-dialog>
      </v-toolbar-items>
    </v-app-bar>
</template>

<script>
import UserLoginForm from '../UserPage/UserLoginForm';
import UserSignUpTOS from '../UserPage/UserSignUpTOS';
export default {
  data () {
    return {
      dialoglogin: false,
      dialogsign: false,
      drawer:null,
      Loginstatus:false,
      name:null,
      email:null,
      items:[
        {title:"Home", icon:'dashboard'},
        {title:"About", icon:'question_answer'}
      ],
      mouseover: false
    }
  },
   components: {
    UserSignUpTOS,
    UserLoginForm,
  },
  created: function(){
    if(sessionStorage.getItem("name")!=null){
      this.Loginstatus="true";
      this.status=false;
      this.name = sessionStorage.getItem("name");
    }
    else{
      this.Loginstatus="login";
      this.status=true;
    }
  },
  methods: {
      logout(){
        this.Loginstatus ="false"
        sessionStorage.removeItem("name")
        sessionStorage.removeItem("email")
        sessionStorage.removeItem("user")
        alert("로그아웃 되셨습니다.")
        location.href='/'
      },
  }

}
</script>

<style scoped>
    #title {
        color:#0C90AD;
        font-family: 'Nanum Gothic Coding', monospace;
        font-weight:700;
    }
    #items {
        font-family: 'Nanum Gothic Coding', monospace;
        font-weight:900;
    }
    #linkToSign {
        text-decoration: none;
        color: black;
    }
    #linkToHome {
        text-decoration: none;
        color: #0C90AD;
    }
</style>
