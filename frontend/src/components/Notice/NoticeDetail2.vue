<template>
  <v-expansion-panels focusable inset>
    <v-expansion-panel>
      <v-expansion-panel-header>가정집펫시터 서비스란?</v-expansion-panel-header>
      <v-expansion-panel-content>
        <h4>
          출장이나 여행갈 때, 혼자 남겨진 강아지를 위해 우리집과 비슷한 환경의 가정집에 강아지를 맡기는 서비스입니다.
        </h4>

        <br />
        <ul>
          <li><span>사전만남</span>을 통해 펫시터와 미리 만나보기</li>
          <li>무조건 한 가정의 강아지만 <span>단독 돌봄</span></li>
          <li><span>산책은 하루에 한 번씩</span></li>
          <li>사진과 영상 <span>실시간으로 공유</span></li>
          <li>매일 받아보는 우리 강아지 <spaN>돌봄일지</spaN></li>
        </ul>
      </v-expansion-panel-content>
    </v-expansion-panel>

    <v-expansion-panel>
      <v-expansion-panel-header>가정집펫시터 이용요금</v-expansion-panel-header>
      <v-expansion-panel-content>
        <v-layout>
          <v-flex>데이케어(8시간 이내 돌봄)</v-flex>
          <v-flex class="text-right"><span>20,000원~</span></v-flex>
        </v-layout>
        <v-divider />

        <v-layout>
          <v-flex>스테이(24시간 기준)</v-flex>
          <v-flex class="text-right"><span>30,000원~</span></v-flex>
        </v-layout>
        <v-divider />

        펫시터의 활동 등급에 따라 금액은 조금씩 차이가 있습니다.
      </v-expansion-panel-content>
    </v-expansion-panel>

    <v-expansion-panel>
      <v-expansion-panel-header>왜 도담도담 펫시터는 믿을 수 있나요?</v-expansion-panel-header>
      <v-expansion-panel-content>
        <ul>
          <li>3단계의 까다로운 <span>신원 검증</span> 통과</li>
          <li>최소 3년 이상 <span>반려 경험</span> 보유</li>
          <li>도그메이트 <span>전문 펫시터 교육과정</span> 이수</li>
          <li>수의사, 훈련사 등의 <span>전문가 이론 및 실습 교육</span> 이수</li>
        </ul>
      </v-expansion-panel-content>
    </v-expansion-panel>

    <v-expansion-panel>
      <v-expansion-panel-header>사전만남이란?</v-expansion-panel-header>
      <v-expansion-panel-content>
        돌봄 전 반려견과 함께 펫시터의 집에 미리 방문하여 아래의 내용을 진행합니다.
        <br />

        <ul>
          <li>펫시터의 <span>집안 환경</span> 미리 확인</li>
          <li>펫시터와 펫시터의 반려견과의 <span>친화 과정</span></li>
          <li>원활한 돌봄을 위한 <span>체크리스트 작성</span></li>
        </ul>

        <br />
        펫시터와 사전만남을 진행하는 경우 돌봄 당일 강아지가 더욱 빠르게 안정을 찾을 수 있습니다.
      </v-expansion-panel-content>
    </v-expansion-panel>

    <v-expansion-panel>
      <v-expansion-panel-header>펫시터의 집에 맡기기 전 준비물</v-expansion-panel-header>
      <v-expansion-panel-content>
        <ul>
          <li>배변패드, 방석, 장난감, 주인의 냄새가 배어있는 옷</li>
          <li>평소 먹던 사료나 간식 또는 약</li>
        </ul>
      </v-expansion-panel-content>
    </v-expansion-panel>

    <v-expansion-panel>
      <v-expansion-panel-header>후기 작성 방법</v-expansion-panel-header>
      <v-expansion-panel-content>
        후기는 돌봄이 완료된 후 5일 내에 ‘로그인 ▶︎ 예약내역' 에서 작성하실 수 있습니다.
        서비스가 만족스러우셨다면 후기를 통해 감사한 마음을 남겨보세요!
      </v-expansion-panel-content>
    </v-expansion-panel>

    <v-expansion-panel>
      <v-expansion-panel-header>가정집펫시터 예약변경 및 취소</v-expansion-panel-header>
      <v-expansion-panel-content>
        <ul>
          <li>돌봄일 기준 3일 전 까지 <span>100%</span> 환불</li>
          <li>1~2일 전 까지 <span>50%</span> 환불</li>
          <li>돌봄 당일 취소시 <span>20%</span> 환불</li>
        </ul>
      </v-expansion-panel-content>
    </v-expansion-panel>
  </v-expansion-panels>
</template>

<script>
export default {
}
</script>
