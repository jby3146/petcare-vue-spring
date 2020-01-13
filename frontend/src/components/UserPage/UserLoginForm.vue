<template>
  <v-card ref="form">
    <v-card-title class="title font-weight-regular justify-space-between">
        <span style="color: #0C90AD">로그인 정보 입력</span>
      </v-card-title>
    <v-card-text>
      <v-text-field
        ref="user.email"
        v-model="user.email"
        :rules="[() => !!user.email || '아이디를 입력하세요']"
        :error-messages="errorMessages"
        label="EMAIL"
        placeholder="email"
        required3
      ></v-text-field>
      <v-text-field
        ref="user.password"
        v-model="user.pass"
        :rules="passwordRules"
        label="PASSWORD"
        type="password"
        placeholder="password"
        counter="25"
        required
      ></v-text-field>
    </v-card-text>
    <v-divider class="mt-12"></v-divider>
    <v-card-actions>
      <v-spacer></v-spacer>
      <v-btn color="#0C90AD" text @click="submit">LOGIN</v-btn>
      <v-btn color="#0C90AD" text @click="$emit('cancel')">취소</v-btn>
    </v-card-actions>
  </v-card>

</template>

<script>
import api from '../../api'
import swal from 'sweetalert';
  export default {
    data: () => ({
    dialog: true,
    errorMessages: '',
    Loginstatus: "login",
    passwordRules: [
        v => !!v || 'password is required',
    ],
    user : {
      email:null,
      pass:null,
    }
  }),
  components:{
    swal,
  },
  watch: {
    email () {
      this.errorMessages = ''
    },
  },

  methods: {
    submit () {

        if(this.Loginstatus=="login")
          this.login();
        else if(this.Loginstatus=="logout")
          this.logout();
      },
      async login(){
        var dat =await api.login(this.user);
        console.log(dat);
        if(dat.data.email){
          this.dialog = false;
          this.Loginstatus = "logout"
          this.instatus=!this.instatus
          this.outstatus=!this.outstatus
          sessionStorage.setItem("user", JSON.stringify(dat.data));
          sessionStorage.setItem("name", dat.data.name);
          sessionStorage.setItem("email", dat.data.email);
          swal({
            title: "로그인 되셨습니다.",
            icon: "success",
            button: "확인"
          });
          location.href='/'
        }
        else{
          swal({
            title: "로그인 실패",
            icon: "fail",
            button: "확인"
          });
        }
      }
  },
  }
</script>
