<template>
  <v-container fluid>
    <v-row no-gutters>

      <v-col cols=12>
        <v-img
          src="https://cdn.imweb.me/thumbnail/20180114/5a5b43ad6a0d7.jpg"
        >
          <p style="color: #B1A4CD; font-size: 300%; font-weight: 600;" class="text-center">'도담도담'이란<br/>(어린아이 등이) 별탈없이 잘 자라는 모습의<br />순우리말 입니다.</p>
        </v-img>
      </v-col>

    </v-row>

    <v-row no-gutters style="margin-top: 80px;">
      <v-col cols=2.5></v-col>

      <v-col
        cols=3
      >
        <router-link to="/applicate" style="text-decoration: none;">
          <v-img
            src="./btnPhoto1.png"
            to="/applicate"
          >
            <v-row align="end" class="fill-height">
              <v-col>
                <p style="font-weight: 500; font-size: 150%; color: #0C90AD;">도담도담의<br />펫시터가 되어보세요!</p>
              </v-col>
            </v-row>
          </v-img>
      </router-link>
      </v-col>

      <v-col cols=1></v-col>

      <v-col
        cols=3
      >
        <v-dialog

          width="800"
        >
          <template v-slot:activator="{ on }">
            <v-img
              v-on="on"
              src="http://i.imgur.com/p9fSztu.jpg"
              :aspect-ratio="16/6"
              align="end"
              style="vertical-align: mid;"
            >
              <v-row align="end" class="fill-height">
                <v-col>
                  <p style="font-weight: 500; font-size: 150%; color: #0C90AD;">방문펫시터<br />돌봄일지 체험하기</p>
                </v-col>
              </v-row>
            </v-img>
          </template>

          <CareDiary />
        </v-dialog>
      </v-col>

      <v-col cols=2.5></v-col>
    </v-row>

    <v-row no-gutters style="margin-top: 80px;">
      <v-col
        align="center" justify="center"
      >
        <span style="font-size: 300%;">─</span>
      </v-col>
    </v-row>

    <v-layout column justify-center align-center style="margin-top: 80px;">
       <p style="font-weigh: 600; font-size: 125%; color: gray;">혼자 남겨진 반려동물을 위해 펫시터 서비스를 경험해보세요.</p>
    </v-layout>

    <v-row no-gutters style="margin-top: 80px;">
      <v-col cols=2.5></v-col>
        <v-col
          align="center"
          justify="center"
          cols=4
        >
          <v-img
           src="https://static.dogmate.co.kr/img/jpg/desktop/index/d_1440_index_02_v3.jpg"
           width="100%"
           height="100%"
          >
          </v-img>
        </v-col>

        <v-col
          cols=3
          style="padding: 40px;"
        >
          <p style="color: #0C90AD; font-weight: 700; font-size: 125%;">펫시터 집으로 부르기</p>
          <p>도그메이트 펫시터가 집으로 찾아와<br />반려동물을 돌봐드려요.</p>
          <p style="color: gray; font-weight: 700">#방문펫시터 #도그워커 #배변처리</p>
        </v-col>
        <v-col cols=2.5></v-col>
    </v-row>

    <v-row no-gutters style="margin-top: 80px;">
      <v-col cols=2.5></v-col>
        <v-col
          cols=3
          style="padding: 40px;"
        >
          <p style="color: #0C90AD; font-weight: 700; font-size: 125%;">펫시터 집에 맡기기</p>
          <p>펫시터의 가정집에서 편안하게<br />지낼 수 있어요.</p>
          <p style="color: gray; font-weight: 700">#가정집펫시터 #1:1케어 #실시간공유</p>
        </v-col>

        <v-col
          align="center"
          justify="center"
          cols=4
        >
          <v-img
           src="https://static.dogmate.co.kr/img/jpg/desktop/index/d_1440_index_03_v2.jpg"
           width="100%"
           height="100%"
          >
          </v-img>
        </v-col>
        <v-col cols=2.5></v-col>
    </v-row>

    <v-row no-gutters style="margin-top: 80px;">
      <v-col
        align="center"
        justify="center"
      >
        <span style="font-size: 300%;">─</span>
      </v-col>
    </v-row>

    <v-row no-gutters style="margin-top: 80px;">
      <v-col
        align="center"
        justify="center"
      >
        <v-rating
          readonly
          size=60
          v-model="rating"
          half-increments
          empty-icon="mdi-heart-outline"
          full-icon="mdi-heart"
          half-icon="mdi-heart-half-full"
          color="red lighten-3"
          background-color="grey lighten-1"
        >
        </v-rating>
      </v-col>
    </v-row>

    <v-row no-gutters style="margin-top: 30px;">
      <v-col
        align="center"
        justify="center"
      >
        <span style="color: grey; font-size: 125%;">별 5개 만점에 {{rating}}개의 만족스런 펫시터 후기를 확인하세요</span>
      </v-col>
    </v-row>

    <v-item-group mandatory style="margin-top: 40px;">
      <v-container>
        <v-row>
          <v-col
            v-for="img in imginfo"
            cols=3
          >
            <v-item v-slot:default="{ active, toggle }">
              <v-card
                @click="toggle"
                :color="active ? 'white' : ''"
                dark
                height="320"
                class="d-flex align-center"
              >
                <v-img
                  v-if="!active"
                  :src="img.src"
                >
                </v-img>
                <v-scroll-y-transition>
                  <div
                    v-if="active"
                    style="padding: 15px;"
                  >
                    <v-rating
                      readonly
                      v-model="rating"
                      color="yellow"
                      style="margin-bottom: 10px;"
                    >
                    </v-rating>
                    <p style="color: black;">{{ img.txt }}</p>
                    <p style="color: black;">{{ img.name }}</p>
                  </div>
                </v-scroll-y-transition>
              </v-card>
            </v-item>
          </v-col>
        </v-row>
      </v-container>
    </v-item-group>

    <v-layout column justify-center align-center style="border-top: 1px solid black; margin-top: 80px; padding-top: 40px;">
      <h4>궁금하신 사항은 아래의 고객센터로</h4>
      <h4>문의해주세요!</h4>

      <br />

      <v-flex><v-icon>fas fa-phone-alt</v-icon><span style="color: gray; margin-left: 10px;">010-0000-0000</span></v-flex>

      <br />
      <br />

      <p style="color:gray;">
        매일 오전 10시 ~ 오후 5시 (점심시간 12시 ~ 1시)
      </p>
    </v-layout>
  </v-container>
</template>
<script>
  import CareDiary from "../CareDiary/CareDiary"

  export default {
    components : {
      CareDiary
    },
    data() {
      return {
        flag: false,
        imginfo: [
          {src: 'http://img.hani.co.kr/imgdb/resize/2018/0907/00502739_20180907.JPG', txt: '저번에도 한번 저희 강아지를 너무너무 잘 돌봐주셨던 돌보미님이셔서 이번에도 안심하고 맡길 수 있었어요!! 실시간으로 사진도 많이 보내주시고, 저희 강아지를 너무 아껴주시는게 보여서 마음이 정말 놓였네요 ㅠㅠ', name: '- 정선열님'},
          {src: 'http://img.hani.co.kr/imgdb/resize/2019/0121/00501111_20190121.JPG', txt: '정말 최고입니다.!! 19살인 노견이라 걱정이 너무나도 많았는데 4박5일동안 내 자식처럼 꼼꼼히 봐주셨어요. 죽도쒀서 먹여주시고. 황태와 닭가슴살까지.. 사진도 계속 찍어보내주셨고요.동영상까지..고생 진짜 많으셨고 감사합니다', name: '- 이민우님'},
          {src: 'https://t1.daumcdn.net/thumb/R720x0/?fname=http://t1.daumcdn.net/brunch/service/user/QsT/image/NSTeOeMe0MddpqlJ23FZV7hJGvg', txt: '완벽한 돌봄이었어요. 도담도담 처음 이용해보는 거였는데 완전 대만족이었네요. 다음에도 망설임없이 부탁드릴수 있을 것 같아요.', name: '- 서은지님'},
          {src: 'https://www.olchiolchi.com/wp-content/uploads/2017/06/14.jpg', txt: '해피 잘돌봐주어서 감사합니다. 2박3일의 여행동안 걱정 많이 했는데 돌봄 사진도 중간 중간 보내주시고 편안하게 놀고, 자는 모습 보면서 안심하고 여행할 수 있었습니다. 감사합니다.', name: '- 이현주님'}
        ],
        rating:5,
      }
    }
  }
</script>

<style>
  #btnfont {
      color:#0C90AD;
      font-family: 'Nanum Gothic Coding', monospace;
      font-weight:700;
  }
</style>
