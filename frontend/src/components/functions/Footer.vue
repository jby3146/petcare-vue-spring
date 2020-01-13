<template>
  <v-footer
    color="grey lighten-3"
    padless
  >
    <v-row
      justify="center"
      no-gutters
      col-12
    >
        <v-col
            cols="12"
            class="text-center mt-1"
        >
            <v-btn
                class="mx-2 black--text"
                icon
                col-4
            >
                <v-icon size="24px">{{ 'mdi-blogger' }}</v-icon>
            </v-btn>

            <v-btn
                class="mx-2 black--text"
                icon
                col-4
                href="https://www.facebook.com/profile.php?id=100042704627526"
            >
                <v-icon size="24px">{{ 'mdi-facebook-box' }}</v-icon>
            </v-btn>

            <v-btn
                class="mx-2 black--text"
                icon
                col-4
            >
                <v-icon size="24px">{{ 'mdi-instagram' }}</v-icon>
            </v-btn>
        </v-col>

        <v-col
            cols="12"
            class="text-center"
            id="font"
        >
            <v-btn
                v-for="link in links"
                :key="link"
                text
                rounded
                class="my-2"
                col-4
                to='/tos'
            >
                {{ link }}
            </v-btn>
        </v-col>
        <v-col
            class="grey lighten-3 py-4 text-center"
            cols="12"
            id="font"
        >
            주식회사 도담도담 | 대표 정선열 | 개인정보책임관리자 정선열<br>
            광주 광산구 하남산단6번로 107, 그린캠퍼스 2층 1강의실<br>
            고객센터 010-0000-0000<br>
            Copyright ⓒ 2019. All Rights Reserved.
        </v-col>
    </v-row>
  </v-footer>
</template>

<script>
  export default {
    data: () => ({
      links: [
        '이용약관',
        '개인정보취급방침'
      ]
    }),
  }
</script>

<style>
    #font {
        font-size: 1vw;
        font-family:'Nanum Gothic Coding', monospace;
    }

</style>
