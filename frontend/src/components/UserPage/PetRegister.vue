<template>
    <v-card
      ref="form"
    >  
      <v-window >
        <v-window-item :value="1">
          <v-card-text>
            <v-radio-group v-model="radios1">
                <template v-slot:label>
                <div><strong>Q. 현재 반려동물을 키우고 있습니까?</strong></div>
                </template>
                <v-radio value="q1y">
                <template v-slot:label>
                    <div>현재 키우고 있음</div>
                </template>
                </v-radio>
                <v-radio value="q1n">
                <template v-slot:label>
                    <div>현재 키우고 있지 않지만 키운적이 있음</strong></div>
                </template>
                </v-radio>
            </v-radio-group>
            <hr>
            <br/>
            <v-row>
                <v-col cols="12" sm="6">
                    <v-text-field
                    label="이름"
                    single-line
                    outlined
                    ></v-text-field>
                </v-col>
        
                <v-col class="d-flex" cols="12" sm="6">
                <v-select
                    :items="items"
                    label="성별"
                    single-line
                    outlined
                ></v-select>
                </v-col>
        
                <v-col cols="12" sm="6">
                    <v-text-field
                    label="품종"
                    single-line
                    outlined
                    ></v-text-field>
                </v-col>
        
                <v-col class="d-flex" cols="12" sm="6">
                <v-select
                    :items="weight"
                    label="무게"
                    single-line
                    outlined
                ></v-select>
               
                </v-col>
        
                </v-row>
                 <v-textarea
                    solo
                    label="관리 지침 및 요청사항이 있다면 적어주세요"
                ></v-textarea>

            <v-radio-group v-model="radios2">
                <template v-slot:label>
                <div><strong>Q. 현재 반려동물을 등록을 하였습니까?</strong></div>
                </template>
                <v-radio value="q21">
                <template v-slot:label>
                    <div>내장형 무선식별장치 개체삽입</div>
                </template>
                </v-radio>
                <v-radio value="q22">
                <template v-slot:label>
                    <div>외장형 무선식별장치 부착</strong></div>
                </template>
                </v-radio>
                <v-radio value="q23">
                <template v-slot:label>
                    <div>등록인식표 부착</strong></div>
                </template>
                </v-radio>
                <v-radio value="q24">
                <template v-slot:label>
                    <div>하지 않음</strong></div>
                </template>
                </v-radio>
            </v-radio-group>
            <v-radio-group v-model="radios3">
                <template v-slot:label>
                <div><strong>Q. 중성화 수술 여부</strong></div>
                </template>
                <v-radio value="q3y">
                <template v-slot:label>
                    <div>YES</div>
                </template>
                </v-radio>
                <v-radio value="q3n">
                <template v-slot:label>
                    <div>NO</strong></div>
                </template>
                </v-radio>
            </v-radio-group>
            <v-radio-group v-model="radios4">
                <template v-slot:label>
                <div><strong>Q. 잘 짖습니까?</strong></div>
                </template>
                <v-radio value="q4y" v-on:change="radiochk4 = true">
                <template v-slot:label>
                    <div>YES</div>
                </template>
                </v-radio>
                <v-radio value="q4n" v-on:change="radiochk4 = false">
                <template v-slot:label>
                    <div>NO</div>
                </template>
                </v-radio>
                <!-- <br/> -->
            </v-radio-group>
             
            <v-textarea
                solo 
                v-if="radiochk4"
            ><template v-slot:label>
                    <div>짖는다면 어떤 상황에서 짖나요? 짖을 경우 따로 주의를 주는 행동이 있나요?</div>
                </template></v-textarea>
           
            <v-radio-group v-model="radios5">
                <template v-slot:label>
                <div><strong>Q. 앓고 있는 지병이나 이전에 다쳤던 적이 있나요?</strong></div>
                </template>
                <v-radio value="q5y" v-on:change="radiochk5 = true">
                <template v-slot:label>
                    <div>Yes</div>
                </template>
                </v-radio>
                <v-radio value="q5n" v-on:change="radiochk5 = false">
                <template v-slot:label>
                    <div>NO</div>
                </template>
                </v-radio>
            </v-radio-group>
             <v-textarea
                    solo
                    v-if="radiochk5"
                    label="아프거나 아팠던 적이 있다면 자세히 적어주세요. 또한 관련해서 주의해야 할 행동도 적어주세요"
                ></v-textarea>
            <v-radio-group v-model="radios6" >
                <template v-slot:label>
                <div><strong>Q. 당신의 반려견은 대소변을 잘 가리는 편입니까?</strong></div>
                </template>
                <v-radio value="q6y" v-on:change="radiochk6 = true">
                <template v-slot:label>
                    <div>Yes</div>
                </template>
                </v-radio>
                <v-radio value="q6n" v-on:change="radiochk6 = false">
                <template v-slot:label>
                    <div>NO</div>
                </template>
                </v-radio>
            </v-radio-group>
             <v-textarea
                    solo
                    v-if="radiochk6"
                    label="주로 어느곳에 대소변을 하는지 알려주세요."
                ></v-textarea>
            <v-radio-group v-model="radios7">
                <template v-slot:label>
                <div><strong>Q. 반려견은 실내에서 마킹(영역표시)를 하나요?</strong></div>
                </template>
                <v-radio value="q7y" v-on:change="radiochk7 = true">
                 <template v-slot:label>
                    <div>Yes</div>
                </template>
                </v-radio>
                <v-radio value="q7n" v-on:change="radiochk7 = false">
                <template v-slot:label>
                    <div>NO</div>
                </template>
                </v-radio>
            </v-radio-group>
             <v-textarea
                    solo
                    v-if="radiochk7"
                    label="마킹을 한다면 주로 어느곳에 마킹을 하는지 알려주세요."
                ></v-textarea>
            <v-radio-group v-model="radios8">
                <template v-slot:label>
                <div><strong>Q. 평소 분리불안증이 있는 편인가요? 있다면 이에 대처할 수 있는 방법은 무엇인가요?</strong></div>
                </template>
                <v-radio value="q8y" v-on:change="radiochk8 = true">
                <template v-slot:label>
                    <div>Yes</div>
                </template>
                </v-radio>
                <v-radio value="q8n" v-on:change="radiochk8 = false">
                <template v-slot:label>
                    <div>NO</div>
                </template>
                </v-radio>
            </v-radio-group>
             <v-textarea
                    solo
                    v-if="radiochk8"
                    label="분리불안 증상을 보일 경우 어떻게 하면 좋은지 알려주세요."
                ></v-textarea>
            <v-radio-group v-model="radios9">
                <template v-slot:label>
                <div><strong>Q. (심장사상충)약을 복용하였습니까?(월 1회/ 미 복용시 산책 금지)</strong></div>
                </template>
                <v-radio value="q9y">
                <template v-slot:label>
                    <div>Yes</div>
                </template>
                </v-radio>
                <v-radio value="q9n">
                <template v-slot:label>
                    <div>NO</div>
                </template>
                </v-radio>
            </v-radio-group>
            <v-radio-group v-model="radios10">
                <template v-slot:label>
                <div><strong>Q. (종합 7종 백신)접종을 하였습니까?(연 1회)</strong></div>
                </template>
                <v-radio value="q10y">
                <template v-slot:label>
                    <div>Yes</div>
                </template>
                </v-radio>
                <v-radio value="q10n">
                <template v-slot:label>
                    <div>NO</div>
                </template>
                </v-radio>
            </v-radio-group>
            <v-radio-group v-model="radios11">
                <template v-slot:label>
                <div><strong>Q. (코로나 장염)접종을 하였습니까?(연 1회)</strong></div>
                </template>
                <v-radio value="q11y">
                <template v-slot:label>
                    <div>Yes</div>
                </template>
                </v-radio>
                <v-radio value="q11n">
                <template v-slot:label>
                    <div>NO</div>
                </template>
                </v-radio>
            </v-radio-group>
            <v-radio-group v-model="radios12">
                <template v-slot:label>
                <div><strong>Q. (켄넬코프)접종을 하였습니까?(연 1회)</strong></div>
                </template>
                <v-radio value="q12y">
                <template v-slot:label>
                    <div>Yes</div>
                </template>
                </v-radio>
                <v-radio value="q12n">
                <template v-slot:label>
                    <div>NO</div>
                </template>
                </v-radio>
            </v-radio-group>
            <hr/>
            <br/>
            
            <!-- <div><strong>반려동물이 자주 다니는 동물병원을 입력해주세요.</strong></div>
            <div><strong>위급시 사용될 수 있는 중요한 정보입니다.</strong></div> -->

            
          </v-card-text>
        </v-window-item>
  
      </v-window>
  
      <v-divider></v-divider>
  
      <v-card-actions>
        <v-spacer></v-spacer>
        <v-btn
          color="#0C90AD"
          text
        >
          저장
        </v-btn>
      </v-card-actions>
    </v-card>
</template>

<script>
import api from '../../api'
import router from "../../router";
  export default {
    data: () => ({
    items: ['수컷', '암컷'],
    weight: ['0~5Kg 미만', '5~10Kg 미만', '10~15Kg 미만', '15Kg 이상'],
    radiochk4: false,
    radiochk5: false,
    radiochk6: false,
    radiochk7: false,
    radiochk8: false,
    radios1: '',
    radios2: '',
    radios3: '',
    radios4: '',
    radios5: '',
    radios6: '',
    radios7: '',
    radios8: '',
    radios9: '',
    radios10: '',
    radios11: '',
    radios12: '',
  }),
  watch: {
    all: function () {
      for(var i = 0; i < this.ex.length; i++)
        this.ex[i] = this.all;
    },
    name () {
      this.errorMessages = ''
    },
    radiochk() {
        console.log(this.radiochk);
    }
  },

  computed: {
    form () {
      return {
        name: this.name,
        address: this.address,
        city: this.city,
        state: this.state,
        zip: this.zip,
        country: this.country,
      }
    },
    currentTitle () {
      switch (this.step) {
        case 1: return '필수 약관'
        default: return '회원가입'
      }
    },
  },
  methods: {
    submit () {
      for(var i = 0; i < this.ex.length-1; i++)
        if(this.ex[i] != true){
          alert('다시확인부탁');
          return;
        }

      router.push({ name: 'signup' });
    },
    resetForm () {
      this.errorMessages = []
      this.formHasErrors = false

      Object.keys(this.form).forEach(f => {
        this.$refs[f].reset()
      })
    },
    addressCheck () {
      this.errorMessages = this.address && !this.name
        ? 'Hey! I\'m required'
        : ''

      return true
    },
  },
  }
</script>

<style scoped>
#linkToTos {
        text-decoration: none;
        color: #B1AFCD;
    }
</style>