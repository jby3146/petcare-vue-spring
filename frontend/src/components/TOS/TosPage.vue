<template>
  <v-contains>
    <v-layout column justify style="padding-left: 200px;">
      <v-tabs
        v-model="tab"
        color="#585858"
        rounded
        hoverable
        background-color="transparent"
        slider-color="#585858"
      >
        <v-tab>서비스 이용약관</v-tab>
        <v-tab>개인정보 취급방침</v-tab>
      </v-tabs>

      <v-tabs-items
        v-model="tab"
        style="margin-top: 50px; background: transparent;"
      >
        <v-tab-item>
          <Tos1 />
        </v-tab-item>

        <v-tab-item>
          <Tos2 />
        </v-tab-item>
      </v-tabs-items>
    </v-layout>


  </v-contains>
</template>

<script>
import Tos1 from "./Tos1"
import Tos2 from "./Tos2"

export default {
  components: {
    Tos1,
    Tos2
  },
  data() {
    return {
      tab: null
    }
  }
}
</script>

<style lang="css" scoped>
</style>
