<template>
<v-container fluid>
  <v-layout column justify-center align-center>
    <v-img src="https://img.seoul.co.kr/img/upload/2018/02/21/SSI_20180221112024.jpg" width="1400" height="600">
      <h1 style="color: #0C90AD">산책이 어려울 때</h1>
      <h1 style="color: #0C90AD; margin-bottom: 30px;">방문펫시터 실내놀이</h1>

      <h5 style="color: gray">비가 오거나 미세먼지가 심한 날, 산책이 어려울 때</h5>
      <h5 style="color: gray">방문펫시터 '실내놀이'를 요청해보세요</h5>
    </v-img>
  </v-layout>

  <v-layout column justify-center align-center style="margin-top: 50px;">
    <h2 style="color: gray">정해진 시간표에 맞춰서 체계적으로</h2>
    <h1 style="color: gray">실내돌봄 놀이를 진행합니다.</h1>

    <v-img src="https://static.dogmate.co.kr/img/indoor-play/indoorPlay-graph-img-pc.png" style="margin: 80px;"></v-img>
  </v-layout>

  <v-layout column justify-center style="background: #DAEFF5; height: 400px; margin-top: 50px; padding: 50px;">
    <v-layout>
      <v-flex></v-flex>
      <v-flex class="text-right indoortitle">친화시간</v-flex>
      <v-flex class="text-center indoorcontent" align-end>경계심을 늦추기 위한 친화과정 타임</v-flex>
      <v-flex></v-flex>
    </v-layout>
    <v-divider color="#0C90AD" />

    <v-layout>
      <v-flex></v-flex>
      <v-flex class="text-right indoortitle">실내놀이</v-flex>
      <v-flex class="text-center indoorcontent" align-end>
        정서활동(마사지, 아로마테라피) or
        <br />
        신체활동(터그놀이, 공놀이, 장난감)
      </v-flex>
      <v-flex></v-flex>
    </v-layout>
    <v-divider color="#0C90AD" />

    <v-layout>
      <v-flex></v-flex>
      <v-flex class="text-right indoortitle">음악듣기</v-flex>
      <v-flex class="text-center indoorcontent" align-end>
        진정을 위한 반려견 전용 음악 재생
        <br />
        (자연소리 / 바람소리 / 물소리 / 풀소리)
      </v-flex>
      <v-flex></v-flex>
    </v-layout>
    <v-divider color="#0C90AD" />

    <v-layout>
      <v-flex></v-flex>
      <v-flex class="text-right indoortitle">노즈워크</v-flex>
      <v-flex class="text-center indoorcontent" align-end>
        굿바이 노즈워크(콩놀이, 노즈워크)
        <br />
        (자연소리 / 바람소리 / 물소리 / 풀소리)
      </v-flex>
      <v-flex></v-flex>
    </v-layout>
  </v-layout>

  <v-layout column justify-center align-center style="margin-top: 150px; margin-bottom: 150PX;">
    <p style="color: #0C90AD; margin-bottom: 50px; font-size: 50px;">실내놀이가 왜 필요한가요?</p>
    <p style="font-size: 18px; color: gray;">비가오거나 미세먼지가 심할 때,</p>
    <p style="font-size: 18px; color: gray;">또는 강아지가 컨디션이 좋지 않은 날 등 ···</p>
    <p style="margin-bottom: 30px; font-size: 18px; color: gray;">때때로 산책이 어려운 날들이 있죠.</p>
    <p style="font-size: 25px; color: #f5a953;">이런 날에 왜 산책 대신 실내놀이가 필요할까요?</p>
  </v-layout>

  <v-layout align-center justify-center style="margin-top: 150px; margin-bottom: 150PX;">
    <v-timeline>
      <v-timeline-item icon="mdi-numeric-1" fill-dot>
        <template v-slot:opposite>
          <v-img src="https://static.dogmate.co.kr/img/indoor-play/indoorPlay-img1-pc.png" style="max-width: 300px; max-height: 300px;"></v-img>
        </template>

        <v-card class="elevation-2">
          <v-card-title class="headline">에너지 해소</v-card-title>
          <v-card-text>
            <p style="font-size: 15px; color: gray; margin-top: 30px;"><span style="color: #0C90AD;">놀이를 통해 활동량을 해소</span>하여, 활동량 부족으로</p>
            <p style="font-size: 15px; color: gray;">발생할 수 있는 문제 행동을 최소화합니다.</p>
          </v-card-text>
        </v-card>
      </v-timeline-item>

      <v-timeline-item icon="mdi-numeric-2" fill-dot>
          <template v-slot:opposite>
            <v-img src="https://static.dogmate.co.kr/img/indoor-play/indoorPlay-img2-pc.png" style="max-width: 300px; max-height: 300px;"></v-img>
          </template>

          <v-card class="elevation-2">
            <v-card-title class="headline">스트레스 완화</v-card-title>
            <v-card-text>
              <p style="font-size: 15px; color: gray; margin-top: 30px;">정기적인 놀이 활동을 통해 <span style="color: #0C90AD;">두뇌 활동량이</span></p>
              <p style="font-size: 15px; color: gray;"><span style="color: #0C90AD;">높아짐과 동시에 스트레스 완화</span>에 도움을 줍니다.</p>
            </v-card-text>
          </v-card>
      </v-timeline-item>

      <v-timeline-item icon="mdi-numeric-3" fill-dot>
        <template v-slot:opposite>
          <v-img src="https://static.dogmate.co.kr/img/indoor-play/indoorPlay-img3-pc.png" style="max-width: 300px; max-height: 300px;"></v-img>
        </template>

        <v-card class="elevation-2">
          <v-card-title class="headline">신뢰감 형성</v-card-title>
          <v-card-text>
            <p style="font-size: 15px; color: gray; margin-top: 30px;">전문가와의 다양한 놀이와 함께 <span style="color: #0C90AD;">타인에 대한</span></p>
            <p style="font-size: 15px; color: gray;"><span style="color: #0C90AD;">신뢰와 유대감을 형성</span>하며 사회성이 개선됩니다.</p>
          </v-card-text>
        </v-card>
      </v-timeline-item>

      <v-timeline-item icon="mdi-numeric-4" fill-dot>
        <template v-slot:opposite>
          <v-img src="https://static.dogmate.co.kr/img/indoor-play/indoorPlay-img4-pc.png" style="max-width: 300px; max-height: 300px;"></v-img>
        </template>

        <v-card class="elevation-2">
          <v-card-title class="headline">충동 제어력 향상</v-card-title>
          <v-card-text>
            <p style="font-size: 15px; color: gray; margin-top: 30px;">터그놀이 및 공놀이 학습 방법을 활용하여 물건에 대한</p>
            <p style="font-size: 15px; color: gray;">역심이나 <span style="color: #0C90AD;">충동을 제어할 수 있는 능력이 향상</span>됩니다.</p>
          </v-card-text>
        </v-card>
      </v-timeline-item>
    </v-timeline>
  </v-layout>

</v-container>
</template>

<script>
export default {

}
</script>

<style>
.indoortitle {
  color: #0C90AD;
  font-weight: bolder;
}

.indoorcontent {
  color: gray;
  font-weight: bolder
}
</style>
