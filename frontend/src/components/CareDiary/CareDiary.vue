<template>
    <v-card
      class="mx-auto"
    >
      <v-container>
        <v-layout column justify-center align-center style="border-bottom: 1px solid black; margin-bottom: 15px;">
          <p
            style="font-size: 25px; color: gray; font-weight: 800;"
          >
            돌봄일지
          </p>
        </v-layout>

        <v-layout column justify-center align-center>
          <v-chip
            class="ma-2"
            color="#0C90AD"
            text-color="white"
          >
            <v-avatar left>
              <v-icon>mdi-dog</v-icon>
            </v-avatar>
            돌봄 완료! 돌봄일지가 등록되었습니다.
          </v-chip>

          <p style="color: #6E6E6E;">
            <strong>도담도담 펫시터</strong> (010-0000-0000)
          </p>
        </v-layout>

        <v-layout column justify-center style="border-top: 1px solid black; border-bottom: 1px solid black; margin-top: 15px; margin-bottom: 15px; padding-top:15px; padding-bottom: 15px;">
          <v-layout style="margin-bottom: 5px;">
            <v-flex>방문 날짜</v-flex>
            <v-flex class="text-right" style="font-weight: 600">2019년 10월 21일 (월)</v-flex>
          </v-layout>

          <v-layout style="margin-bottom: 5px;">
            <v-flex>방문예정시간</v-flex>
            <v-flex class="text-right" style="font-weight: 600">13:10~14:10 / 1시간 돌봄</v-flex>
          </v-layout>

          <v-layout>
            <v-flex>반려동물정보</v-flex>
            <v-flex class="text-right" style="font-weight: 600">1마리 (크림)</v-flex>
          </v-layout>
        </v-layout>

        <v-layout column justify-center style="margin-top: 40px;">
          <strong style="margin-bottom: 10px;">돌봄 리스트</strong>

          <v-layout style="border-bottom: 1px solid black; padding-bottom: 5px;">
            <v-flex><v-icon>mdi-check-circle-outline</v-icon>배변을 정리하였습니다.</v-flex>
            <v-flex class="text-right"><v-icon>mdi-image</v-icon>5</v-flex>
          </v-layout>

          <v-layout style="border-bottom: 1px solid black; padding-bottom: 5px; margin-top: 15px;">
            <v-flex><v-icon>mdi-check-circle-outline</v-icon>식기세척과 밥, 물을 급여하였습니다.</v-flex>
            <v-flex class="text-right"><v-icon>mdi-image</v-icon>3</v-flex>
          </v-layout>

          <v-layout style="border-bottom: 1px solid black; padding-bottom: 5px; margin-top: 15px;">
            <v-flex><v-icon>mdi-check-circle-outline</v-icon>실내 놀이를 진행하였습니다.</v-flex>
            <v-flex class="text-right"><v-icon>mdi-image</v-icon>2</v-flex>
          </v-layout>

          <v-layout style="border-bottom: 1px solid black; padding-bottom: 5px; margin-top: 15px;">
            <v-flex><v-icon>mdi-check-circle-outline</v-icon>산책을 다녀왔습니다.</v-flex>
            <v-flex class="text-right"><v-icon>mdi-image</v-icon>4</v-flex>
          </v-layout>

          <v-layout style="border-bottom: 1px solid black; padding-bottom: 5px; margin-top: 15px;">
            <v-flex><v-icon>mdi-check-circle-outline</v-icon>요청사항을 완료했습니다.</v-flex>
            <v-flex class="text-right"><v-icon>mdi-image</v-icon>2</v-flex>
          </v-layout>
        </v-layout>

        <v-layout column justify-center style="margin-top: 40px;">
          <v-flex style="margin-bottom: 20px;"><v-icon>mdi-comment-text-outline</v-icon><strong> 돌봄후기</strong></v-flex>
          <p>
            첫만남부터 살갑게 반겨준 크림이! 절 보더니 곧 산책 가는 걸 아는지 폴짝폴짝 신나하더라구요.
            패드에 쉬야도 잘 해서 다 갈아두었습니다.
          </p>
          <br />
          <p>
            공원에서 처음엔 이쪽저쪽 저를 막 끌고 다녔는데 차분히 기다려주니까 진정되었습니다.
            흙 밟고 냄새 맡는 걸 좋아하는 것 같아서 충분히 밟게 해주었고 풀숲으론 최대한 가지 않았어요.
            비가 조금씩 와서, 15분 정도만 산책을 했고 산책 중에 대변 한 번, 소변 한 번 보았어요.
          </p>
          <br />
          <p>
            집에 와서 발을 닦아주는데 너무 얌전하게 있어서 간식도 챙겨 주었습니다.
            말씀해주신 대로 사료도 정량 급여했구요. 그리고 새로 사주신 장난감으로 노즈워크 놀이를 했어요 ^^
            이리저리 간식도 잘 찾고 엄청 재밌어하는 모습이 정말 귀여웠어요~
          </p>
          <br />
          <p>
            사용한 수건은 신발장 앞에 두었습니다.
            크림이는 사람을 좋아하고 활발해서 저도 힐링되는 기분입니다. 다음 만남도 무척 기대되어요~^^
          </p>
        </v-layout>

        <v-layout column justify-center style="margin-top: 40px;">
          <v-flex style="margin-bottom: 20px;"><v-icon>mdi-camcorder</v-icon><strong> 돌봄영상</strong></v-flex>
          <p>
            영상은 돌봄 완료 24시간 이내에 업로드 됩니다.
            <br />
            영상 열람은 돌봄 완료 후 7일까지 확인이 가능합니다.
          </p>

          <v-flex style="border: 1px solid gray; font-size: 12px;"><v-icon>mdi-play-circle</v-icon> 액션캠 영상</v-flex>
        </v-layout>
      </v-container>
    </v-card>
</template>

<script>
  export default {
    data () {
      return {
        dialog: false,
      }
    },
  }
</script>

<style lang="css" scoped>

</style>
