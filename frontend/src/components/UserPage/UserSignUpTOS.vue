<template>
<v-card ref="form">
  <v-card-title class="title font-weight-regular">
    <span style="color:#0C90AD; margin-right: 10px;">{{ currentTitle }}</span>
    <v-avatar color="#0C90AD" class="subheading white--text" size="24" v-text="step"></v-avatar>
    <v-spacer></v-spacer>
    <v-icon color="#0C90AD" size="30" @click="$emit('cancel')">{{ 'mdi-close-circle' }}</v-icon>
  </v-card-title>
  <v-window v-model="step">
    <v-window-item :value="1">
      <v-card-text>
        <v-checkbox v-model="all" label="아래 항목에 전체 동의합니다." color="#0C90AD" hide-details></v-checkbox>
        <v-divider class="mt-4"></v-divider>
        <v-checkbox v-model="ex[0]" label="본인은 만 14세 이상입니다 (필수)" color="#0C90AD" hide-details></v-checkbox>
        <v-checkbox v-model="ex[1]" color="#0C90AD" hide-details>
          <template v-slot:label>
            <div>
              서비스 이용약관 동의
              <v-tooltip bottom>
                <template v-slot:activator="{ on }">
                  <router-link to='/tos' id="linkToTos">(보기)</router-link>
                </template>
                약관 보기
              </v-tooltip>
              (필수)
            </div>
          </template>
        </v-checkbox>
        <v-checkbox v-model="ex[2]" color="#0C90AD" hide-details>
          <template v-slot:label>
            <div>
              개인정보 수집 이용 동의
              <v-tooltip bottom>
                <template v-slot:activator="{ on }">
                  <router-link to='/tos' id="linkToTos">(보기)</router-link>
                </template>
                약관 보기
              </v-tooltip>
              (필수)
            </div>
          </template>
        </v-checkbox>
        <v-checkbox v-model="ex[3]" color="#0C90AD" hide-details>
          <template v-slot:label>
            <div>
              안전보상지원 프로그램약관 동의
              <v-tooltip bottom>
                <template v-slot:activator="{ on }">
                  <router-link to='/tos' id="linkToTos">(보기)</router-link>
                </template>
                약관 보기
              </v-tooltip>
              (필수)
            </div>
          </template>
        </v-checkbox>
        <v-checkbox v-model="ex[4]" label="이벤트 및 마케팅 정보 수신 동의 (선택)" color="#0C90AD" hide-details></v-checkbox>
      </v-card-text>
    </v-window-item>

    <v-window-item :value="2">
      <v-card-text>
        <form class="gform" method="POST" :data-email="email" action="https://script.google.com/macros/s/AKfycbxC4jc4OGfj7u_LzuM2hNA8kT-NdVYHnTululXHU0Sl99JCNWVn/exec">
          <v-text-field name="email" ref="email" v-model="email" :rules="emailRules" :error-messages="errorMessages" label="Email" required></v-text-field>
          <input type="submit" value="submit" />
          <div style="display:none;" id="thankyou_message">
            <h2>
              <em>Thanks</em> for contacting us!!
            </h2>
          </div>
        </form>

        <v-text-field ref="pw" v-model="pw" :rules="passwordRules" :type="'password'" :error-messages="errorMessages" label="비밀번호" required></v-text-field>
        <v-text-field ref="repw" v-model="repw" :rules="[pw === repw || '비밀번호가 다릅니다.']" :type="'password'" :error-messages="errorMessages" label="비밀번호 확인" required></v-text-field>
        <v-row>
          <v-col cols="12" sm="6" md="4">
            <v-text-field ref="name" v-model="name" :rules="nameRules" :error-messages="errorMessages" label="이름" required></v-text-field>
          </v-col>
          <v-col cols="12" sm="6" md="4">
            성별
            <v-radio-group v-model="gender" row>
              <v-radio label="남" value="Man"></v-radio>
              <v-radio label="여" value="Women"></v-radio>
            </v-radio-group>
          </v-col>
        </v-row>

        <v-text-field ref="birth" v-model="birth" :rules="birthdayRules" :error-messages="errorMessages" label="생년월일" required></v-text-field>
        <v-text-field ref="address" v-model="address" label="주소" placeholder="클릭하세요" v-on:click="onoff" required></v-text-field>
        <v-dialog v-model="dialogstatus" width="600px">
          <DaumPostcode :on-complete="handleAddress" />
        </v-dialog>
        <v-text-field ref="nickname" v-model="nickname" :rules="nicknameRules" :error-messages="errorMessages" label="닉네임" required></v-text-field>
        <v-btn @click="submit">
          가입
        </v-btn>
      </v-card-text>
    </v-window-item>
  </v-window>
  <v-divider></v-divider>

  <v-card-actions>
    <v-btn :disabled="step === 1" color="#0C90AD" text @click="step--">
      Back
    </v-btn>
    <v-spacer></v-spacer>
    <v-btn :disabled="step === 2" color="#0C90AD" text @click="tosChk">
      Next
    </v-btn>
  </v-card-actions>
</v-card>
</template>

<script>
import api from '../../api'
import router from "../../router";
import DaumPostcode from 'vuejs-daum-postcode'
import VModal from 'vue-js-modal'
import axios from 'axios'
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
  data: () => ({
    step: 1,
    all: false,
    ex: [false, false, false, false, false],
    errorMessages: '',
    name: null,
    address: null,
    email: null,
    state: null,
    pw: null,
    birth: null,
    nickname: null,
    repw: null,
    formHasErrors: false,
    dialogstatus: false,
    x: 0.0,
    y: 0.0,
    emailRules: [
      v => {
        const pattern = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/
        return pattern.test(v) || '이메일 형식이 아닙니다.'
      },
      v => !!v || 'Required.'
    ],
    passwordRules: [
      v => v.length > 4 || '5글자 이상 입력해주세요.'
    ],
    nicknameRules: [
      v => v.length >= 2 || '2글자 이상 입력해주세요.'
    ],
    birthdayRules: [
      v => {
        const pattern = /([0-9]{2}(0[1-9]|1[0-2])(0[1-9]|[1,2][0-9]|3[0,1]))/
        return pattern.test(v) || '주민등록번호 앞자리 6자리를 입력해주세요'
      }
    ],
    nameRules: [
      v => !!v || '이름을 입력하세요.'
    ]
  }),
  components: {
    DaumPostcode,
    VModal,
    swal
  },
  watch: {
    all: function() {
      for (var i = 0; i < this.ex.length; i++)
        this.ex[i] = this.all;
    },
    name() {
      this.errorMessages = ''
    },
    address: function() {
      this.dialogstatus = !this.dialogstatus
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
    },


  },

  computed: {
    form() {
      return {
        name: this.name,
        address: this.address,
        email: this.email,
        pass: this.pw,
        birth: this.birth,
        nickname: this.nickname,
        name: this.name,
        gender: this.gender,
        user_type: 1,
        x: this.x,
        y: this.y
      }
    },
    currentTitle() {
      switch (this.step) {
        case 1:
          return '필수 약관'
        default:
          return '회원가입'
      }
    },
  },
  methods: {
    submit() {
      for (var i = 0; i < this.ex.length - 1; i++)
        if (this.ex[i] != true) {
          swal({
            title: "오류",
            text: "필수 약관에 동의해주세요",
            icon: "warning",
            button: "확인"
          });
          return;
        }
      this.signUp();
      this.dialog = false
    },
    tosChk() {
      for (var i = 0; i < this.ex.length - 1; i++)
        if (this.ex[i] != true) {
          swal({
            title: "오류",
            text: "필수 약관에 동의해주새요",
            icon: "warning",
            button: "확인"
          });
          return;
        }
        this.step++;
    },
    async signUp() {
      let a = await api.signUp(this.form);
      console.log(a.data);
      if (a.data == '1') {
        swal({
            title: "회원가입 성공",
            icon: "success",
            button: "확인"
          });
        location.href = '/'
      } else {
        swal({
            title: "회원가입 실패",
            icon: "fail",
            button: "확인"
          });
        location.href = '/'
      }
    },
    resetForm() {
      this.errorMessages = []
      this.formHasErrors = false

      Object.keys(this.form).forEach(f => {
        this.$refs[f].reset()
      })
    },
    handleAddress,
    onoff() {
      thistemp = this;
      this.dialogstatus = !this.dialogstatus
    }
  }
}
</script>

<style scoped>
#linkToTos {
  text-decoration: none;
  color: #B1AFCD;
}

.form_field {}
</style>
