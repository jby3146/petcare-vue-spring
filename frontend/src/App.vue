<template>
  <div id="app">
    <v-app>

      <Header/>

      <v-content>
        <v-container fluid fill-height class="grey lighten-5">
          <v-layout>
            <!-- each pages will be placed here -->
            <router-view />
          </v-layout>
        </v-container>
      </v-content>

      <Footer/>

    </v-app>
  </div>

</template>

<script>

import router from "./router";
import Header from "./components/functions/Header.vue"
import Footer from "./components/functions/Footer.vue"
export default {
  data: () => ({

  }),
  components:{
    Header,
    Footer
  },
  methods: {
    goTo: function(path) {
      router.push({ name: path });
    }
  }
};

</script>


<style>
@import url('https://fonts.googleapis.com/css?family=Nanum+Gothic+Coding:400,700&display=swap');
#keep .v-navigation-drawer__border {
  display: none;
}
</style>
