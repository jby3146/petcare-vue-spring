<template>
  <v-container id="noticepage">
      <v-layout column justify-center align-center style="background: #B1AFCD; height: 300px; color: white; padding-top: 50px">
        <h2 class="marginSetting">혹시 도움이 필요하신가요?</h2>
        <p class="marginSetting">
          운영시간 : 매일 오전 10시 ~ 오후 5시 (점심시간 12시 ~ 1시)
        </p>
        <v-btn class="ma-2" text color="white" style="align: center;">
          <v-icon style="margin-right: 10px">mdi-phone</v-icon>
          010 - 0000 - 0000
        </v-btn>
      </v-layout>

      <v-layout column justify-center style="margin-top: 50px; background: white">
          <v-tabs
            v-model="tab"
            color="blue"
            rounded
            hoverable
            background-color="transparent"
            activatable
          >
            <v-tab>방문 펫시터</v-tab>
            <v-tab>가정집 펫시터</v-tab>
            <v-tab>펫시터 지원</v-tab>
          </v-tabs>

          <v-tabs-items
            v-model="tab"
          >
            <v-tab-item>
              <NoticeDetail1 />
            </v-tab-item>

            <v-tab-item>
              <NoticeDetail2 />
            </v-tab-item>

            <v-tab-item>
              <NoticeDetail3 />
            </v-tab-item>
          </v-tabs-items>
      </v-layout>
  </v-container>
</template>

<script>
import NoticeDetail1 from "./NoticeDetail1"
import NoticeDetail2 from "./NoticeDetail2"
import NoticeDetail3 from "./NoticeDetail3"

export default {
  components : {
    NoticeDetail1,
    NoticeDetail2,
    NoticeDetail3
  },
  data() {
    return {
      tab: null
    }
  }
}
</script>

<style>
  .marginSetting {
    margin-bottom: 5px;
  }
  .btnMargin {
    margin-left: 40px;
    margin-right: 40px;
  }
  .v-expansion-panel-content {
    padding-top: 40px;
    padding-left: 30px;
    padding-bottom: 40px;
  }
  .v-divider {
    margin: 20px;
  }
  #noticepage span {
     color: #0C90AD;
     font-weight: bolder;
  }
</style>
