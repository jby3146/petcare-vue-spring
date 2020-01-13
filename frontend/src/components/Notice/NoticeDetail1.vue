<template>
  <v-expansion-panels focusable inset>
    <v-expansion-panel>
      <v-expansion-panel-header>방문펫시터 서비스란?</v-expansion-panel-header>
      <v-expansion-panel-content>
        <h4 style="color: #0C90AD">
          믿을 수 있는 전문가가 직접 고객의 집으로 찾아가 반려견을 케어해드립니다.
        </h4>
        <br />
        <ul>
          <li>산책, 배변정리, 배식</li>
          <li>산책이 어려운 날에는 실내놀이 프로그램</li>
        </ul>
        <v-btn to="/indoorplay" small outlined color="#0C90AD" style="margin-left: 40px; margin-top: 10px; margin-bottom: 10px;">실내놀이 프로그램 자세히보기></v-btn>
        <ul>
          <li>돌봄 시작부터 종료까지 액션캠으로 돌봄 영상 녹화</li>
          <li>서비스 종료 후, 앱에서 직접 액션캠 영상 확인</li>
        </ul>
      </v-expansion-panel-content>
    </v-expansion-panel>

    <v-expansion-panel>
      <v-expansion-panel-header>방문펫시터 이용요금</v-expansion-panel-header>
      <v-expansion-panel-content>
        <v-layout>
          <v-flex>1회(1시간)</v-flex>
          <v-flex class="text-right" align-end><span>28,000원</span></v-flex>
        </v-layout>
        <v-divider />

        <v-layout>
          <v-flex>시간 당 추가 금액</v-flex>
          <v-flex class="text-right"><span>15,000원</span></v-flex>
        </v-layout>
        <v-divider />

        <v-layout>
          <v-flex>마리 추가 금액 (15kg 미만)</v-flex>
          <v-flex class="text-right"><span>5,000원</span></v-flex>
        </v-layout>
        <v-divider />

        <v-layout>
          <v-flex>마리 추가 금액 (15kg 이상)</v-flex>
          <v-flex class="text-right"><span>10,000원</span></v-flex>
        </v-layout>
        <v-divider />

        <v-layout>
          <v-flex>주말 추가 금액</v-flex>
          <v-flex class="text-right"><span>5,000원</span></v-flex>
        </v-layout>
        <v-divider />

        <v-layout>
          <v-flex>명절 추가 금액</v-flex>
          <v-flex class="text-right"><span>14,000원</span></v-flex>
        </v-layout>
        <v-divider />

        정기적으로 이용하는 경우 <strong>회당 최대 5,000원 할인</strong>됩니다.
      </v-expansion-panel-content>
    </v-expansion-panel>

    <v-expansion-panel>
      <v-expansion-panel-header>왜 도그메이트 방문펫시터는 믿을 수 있나요?</v-expansion-panel-header>
      <v-expansion-panel-content>
        <ul>
          <li>3단계의 까다로운 <span>신원 검증</span> 통과</li>
          <li>최소 3년 이상 <span>반려 경험</span> 보유</li>
          <li>수의사, 훈련사 등의 <span>전문가 이론 및 실습 교육</span> 이수</li>
          <li>액션캠을 통해 방문 <span>돌봄 전체 내용 녹화 후 공유</span></li>
        </ul>
      </v-expansion-panel-content>
    </v-expansion-panel>

    <v-expansion-panel>
      <v-expansion-panel-header>방문펫시터 정기 서비스란?</v-expansion-panel-header>
      <v-expansion-panel-content>
        <v-flex>
          방문펫시터를 정기적으로 이용하는 경우 서비스 이용 요금을 할인해드리고 있습니다.
        </v-flex>

        <v-layout>
          <v-flex>주 1~2회</v-flex>
          <v-flex class="text-right"><span>25,000원</span></v-flex>
        </v-layout>
        <v-divider />

        <v-layout>
          <v-flex>주 3~4회</v-flex>
          <v-flex class="text-right"><span>24,000원</span></v-flex>
        </v-layout>
        <v-divider />

        <v-layout>
          <v-flex>주 5회 이상</v-flex>
          <v-flex class="text-right"><span>23,000원</span></v-flex>
        </v-layout>
        <v-divider />
        정기 서비스 이용시, <strong>우리 강아지만을 위한 전담 매니저 배정</strong>이 가능합니다.
      </v-expansion-panel-content>
    </v-expansion-panel>

      <v-expansion-panel>
        <v-expansion-panel-header>출입비밀번호 등 정보 유출이 걱정될 때</v-expansion-panel-header>
        <v-expansion-panel-content>
          <ul>
            <li>현관비밀번호는 돌봄 종료 즉시 폐기</li>
            <li>출입문을 열기 전부터 돌봄 종료까지 돌봄 영상 모두 녹화 후 공유</li>
          </ul>
        </v-expansion-panel-content>
      </v-expansion-panel>

        <v-expansion-panel>
          <v-expansion-panel-header>방문펫시터 이용 가능 지역</v-expansion-panel-header>
          <v-expansion-panel-content>
            <ul>
              <li>광주, 부산, 전라도(일부) 지역</li>
              <li>그 외 지역의 경우 <span>'방문펫시터 예약하기'</span> 버튼 클릭 ▶ 미지원 지역 알림 신청</li>
            </ul>
            <br />
            미지원 지역 알림을 신청하시면, 해당 지역 서비스 오픈 시 안내를 드립니다. 전국의 모든 지역에서
            <br />
            도담도담을 이용하실 수 있도록 최선을 다하겠습니다!
          </v-expansion-panel-content>
        </v-expansion-panel>

        <v-expansion-panel>
          <v-expansion-panel-header>방문펫시터 당일 예약</v-expansion-panel-header>
          <v-expansion-panel-content>
            네, 당일 예약도 가능합니다! 그러나 예약을 더욱 안전하게 확정하기 위해서는 <span>최소 1주일 전에 미리 예약하는 것</span>
            을 추천드립니다.
          </v-expansion-panel-content>
        </v-expansion-panel>

        <v-expansion-panel>
          <v-expansion-panel-header>방문펫시터 예약변경 및 취소</v-expansion-panel-header>
          <v-expansion-panel-content>
            <ul>
              <li>돌봄일 기준 3일 전 까지 <span>100%</span> 환불</li>
              <li>1~2일 전 까지 <span>50%</span> 환불</li>
              <li>돌봄 당일 취소시 <span>20%</span> 환불</li>
            </ul>

            <br />
            예약 변경의 경우, 도그메이트 고객센터로 연락부탁드립니다.
          </v-expansion-panel-content>
        </v-expansion-panel>
  </v-expansion-panels>
</template>

<script>
export default {
}
</script>
