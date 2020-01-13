<template>
  <v-container style="padding:40px">
    <v-layout style="padding:40px">
      <v-flex>
        <v-row justify="center" dense>
          <v-card
            class="mx-auto"
            max-width="350"
            color="#F8F1E9"
          >
            <v-img
              class="white--text align-end"
              height="300px"
              src='../../assets/image/강아지3.png'
            >
            </v-img>

            <v-card-text class="text--primary" style="padding-bottom:0px">

              <v-list style="background-color:#F8F1E9">
                <v-list-item-group v-model="model">
                  <v-list-item
                    v-for="(item, i) in items1"
                    :key="i"
                  >
                    <v-list-item-icon>
                      <v-icon v-text="item.icon"></v-icon>
                    </v-list-item-icon>
                    <v-list-item-content p-0>
                      <v-list-item-title id="font" style="font-size:13px" v-text="item.text"></v-list-item-title>
                    </v-list-item-content>
                  </v-list-item>
                </v-list-item-group>
              </v-list>
            </v-card-text>

            <v-card-actions class="justify-center" style="padding-bottom:16px;padding-top:0px">
              <v-dialog v-model="dialog1" max-width="600px">
                <template v-slot:activator="{ on }">
                  <v-btn
                    color="#B1AFCD"
                    id="font"
                    style="font-size:15px"
                    v-on="on"
                  >
                    <strong>방문펫시터 지원하기<v-icon>mdi-gesture-tap</v-icon></strong>
                  </v-btn>
                </template>
                <v-card>
                  <v-card-title>
                    <span class="headline">방문펫시터 지원하기</span>
                  </v-card-title>
                  <v-card-text>
                    <v-container>
                      <v-row>
                        <v-col cols="12" sm="6" md="4">
                          이름
                          <v-text-field required></v-text-field>
                        </v-col>
                        <v-col cols="12" sm="6" md="4">
                          성별
                          <v-radio-group v-model="row" row>
                            <v-radio label="남" value="Men"></v-radio>
                            <v-radio label="여" value="Women"></v-radio>
                          </v-radio-group>
                        </v-col>
                        <v-col cols="12" sm="6" md="4">
                          생년월일(ex. 901004)
                          <v-text-field required></v-text-field>
                        </v-col>
                        <v-col cols="12" sm="8">
                          핸드폰번호(ex. 01012345678)
                          <v-text-field required></v-text-field>
                        </v-col>
                        <v-col cols="12">
                          주소(도로명주소)
                          <v-text-field required></v-text-field>
                        </v-col>
                        <v-col cols="12" sm="6" md="4">
                          운전면허 소지 여부
                          <v-radio-group v-model="row" row>
                            <v-radio label="소지" value="true"></v-radio>
                            <v-radio label="미소지" value="false"></v-radio>
                          </v-radio-group>
                        </v-col>
                        <v-col cols="12" sm="6">
                          반려견을 얼마나 키워보셨나요?
                          <v-select
                            :items="['무경험', '~3년이하', '3년이상~6년이하', '6년이상~']"
                            required
                          ></v-select>
                        </v-col>
                        <v-col cols="12">
                          어느정도 크기의 강아지까지 케어 가능하세요?(중복가능)
                          <v-autocomplete
                            :items="['소형견(5kg이하)','중형견(15kg이하)','대형견(15kg이상)']"
                            multiple
                          ></v-autocomplete>
                        </v-col>
                      </v-row>
                    </v-container>
                    <small>*indicates required field</small>
                  </v-card-text>
                  <v-card-actions>
                    <v-spacer></v-spacer>
                    <v-btn color="blue darken-1" text @click="dialog1 = false">Close</v-btn>
                    <v-btn color="blue darken-1" text @click="dialog1 = false">Save</v-btn>
                  </v-card-actions>
                </v-card>
              </v-dialog>

            </v-card-actions>
          </v-card>
          <v-card
            class="mx-auto"
            max-width="350"
            color="#F8F1E9"
          >
            <v-img
              class="white--text align-end"
              height="300px"
              src='../../assets/image/강아지4.png'
            >
            </v-img>

            <v-card-text class="text--primary" style="padding-bottom:0px">
              <v-list style="background-color:#F8F1E9">
                <v-list-item-group>
                  <v-list-item
                    v-for="(item, i) in items2"
                    :key="i"
                  >
                    <v-list-item-icon>
                      <v-icon v-text="item.icon"></v-icon>
                    </v-list-item-icon>
                    <v-list-item-content p-0>
                      <v-list-item-title id="font" style="font-size:13px" v-text="item.text"></v-list-item-title>
                    </v-list-item-content>
                  </v-list-item>
                </v-list-item-group>
              </v-list>
            </v-card-text>

            <v-card-actions class="justify-center" style="padding-bottom:16px;padding-top:0px">
              <v-dialog v-model="dialog2" max-width="600px">
                <template v-slot:activator="{ on }">
                  <v-btn
                    color="#B1AFCD"
                    id="font"
                    style="font-size:15px"
                    v-on="on"
                  >
                    <strong>가정집펫시터 지원하기<v-icon>mdi-gesture-tap</v-icon></strong>
                  </v-btn>
                </template>
                <v-card>
                  <v-card-title>
                    <span class="headline">가정집펫시터 지원하기</span>
                  </v-card-title>
                  <v-card-text>
                    <v-container>
                      <v-row>
                        <v-col cols="12" sm="6" md="4">
                          이름
                          <v-text-field required v-model="name"></v-text-field>
                        </v-col>
                        <v-col cols="12" sm="8">
                          핸드폰번호(ex. 01012345678)
                          <v-text-field required v-model="phone"></v-text-field>
                        </v-col>
                        <v-col cols="12">
                          글제목
                          <v-text-field required v-model="subject"></v-text-field>
                        </v-col>
                        <v-col cols="12" sm="6" md="4">
                          거주지 유형
                          <v-radio-group v-model="home_type" row>
                            <v-radio label="주택" value="1"></v-radio>
                            <v-radio label="아파트" value="2"></v-radio>
                            <v-radio label="다세대주택" value="3"></v-radio>
                          </v-radio-group>
                        </v-col>
                        <v-col cols="12" sm="6">
                          반려견을 얼마나 키워보셨나요?
                          <v-select
                            item-text="text"
                            item-value="value"
                            v-model="period"
                            :items="period_items"
                            required
                          ></v-select>
                        </v-col>
                        <v-col cols="12">
                          어느정도 크기의 강아지까지 케어 가능하세요?
                          <v-autocomplete
                            item-text="text"
                            item-value="value"
                            v-model="size"
                            :items="size_items"
                          ></v-autocomplete>
                        </v-col>
                        <v-col cols="12" sm="6" md="4">
                          DayCare 요금
                          <v-text-field required v-model="daycare" suffix="원"></v-text-field>
                        </v-col>                        
                        <v-col cols="12" sm="6" md="4">
                          1박 요금
                        <v-text-field required v-model="staycare" suffix="원"></v-text-field>
                        </v-col>
                      </v-row>
                      <imgur/>
                    </v-container>
                  </v-card-text>
                  <v-card-actions>
                    <v-spacer></v-spacer>
                    <v-btn color="blue darken-1" text @click="dialog2 = false">Close</v-btn>
                    <v-btn color="blue darken-1" text @click="home_submit">Save</v-btn>
                  </v-card-actions>
                </v-card>
              </v-dialog>
            </v-card-actions>
          </v-card>
        </v-row>
      </v-flex>
    </v-layout>
  </v-container>


</template>

<script>
  import api from '../../api'
  import imgur from "../UserPage/ImgurUpload"
  export default {
    components:{
      imgur
    },
    data: () => ({
      dialog1: false,
      dialog2: false,
      model: null,
      row:null,
      user : {},
      phone : "",
      subject : "",
      home_type : "",
      period : "",
      size : "",
      name : "",
      email : "",
      imgurl:"",
      linkurl:"",
      daycare:"",
      staycare:"",
      items1: [
        {
          icon: 'mdi-numeric-1-circle',
          text: '성별/학력/경력 무관 만 25세 이상',
        },
        {
          icon: 'mdi-numeric-2-circle',
          text: '반려 경험 3년 이상',
        },
        {
          icon: 'mdi-numeric-3-circle',
          text: '대형견 핸들러 우대',
        },
        {
          icon: 'mdi-numeric-4-circle',
          text: '운전면허 보유자 우대',
        },
      ],
      items2: [
        {
          icon: 'mdi-numeric-1-circle',
          text: '성별/학력/경력 무관 만 25세 이상',
        },
        {
          icon: 'mdi-numeric-2-circle',
          text: '반려 경험 3년 이상',
        },
        {
          icon: 'mdi-numeric-3-circle',
          text: '대형견 핸들러 우대',
        },
        {
          icon: 'mdi-numeric-4-circle',
          text: '주택 가구 우대',
        },
      ],
      period_items: [ 
        {
          text: "무경험", value: "1"
        },
        {
          text: "~3년이하", value: "2"
        },
        {
          text: "3년이상~6년이하", value: "3"
        },
        {
          text: "6년이상~", value : "4"
        },
      ],
      size_items: [ 
        {
          text: "소형견(5kg이하)", value: "1"
        },
        {
          text: "중형견(15kg이하)", value: "2"
        },
        {
          text: "대형견(15kg이상)", value: "3"
        },
      ],
    }),
  computed: {
    form () {
      return {
        name : this.name,
        phone : this.phone,
        subject : this.subject,
        home_type : this.home_type,
        period : this.period,
        size : this.size,
        email : this.email,
        sitter_type : '1',
        linkurl:this.linkurl,
        daycare:this.daycare,
        staycare:this.staycare,
        imgurl: this.linkurl,
      }
    },
  },
  methods: {
    home_submit () {
        this.form.sitter_type = '1';
        this.sitterApply();
        this.dialog1 = false;
        this.dialog2 = false;
    },
    visit_submit () {
        this.form.sitter_type = '2';
        this.sitterApply();
        this.dialog1 = false;
        this.dialog2 = false;
    },
    async sitterApply(){
      this.linkurl = sessionStorage.getItem("linkurl")
      let a = await api.SitterApply(this.form);
      console.log(a.data);
      sessionStorage.removeItem("linkurl")
      if(a.data == '1'){
        alert('등록 되었습니다.')
        location.href='/'
      }
      else{
        alert('등록에 실패했습니다.')
        location.href='/'
      }
    },
  },
    mounted(){
      this.user = JSON.parse(sessionStorage.getItem("user"));
      this.name = this.user.name;
      this.email = this.user.email;
    },
  }
</script>

<style>
  #font {
    font-family: 'Nanum Gothic Coding', monospace;
  }
</style>
