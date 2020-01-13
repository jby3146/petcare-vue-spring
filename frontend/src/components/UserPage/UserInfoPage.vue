<template>
<v-container fluid pa-3 style="min-height: 100px;">
  <v-row>
    <v-col sm="4" cols="12">
      <v-card width="300">
        <v-navigation-drawer permanent width="300">
          <v-list>
            <v-list-item>
              <v-list-item-avatar>
                <v-img src="https://cdn.vuetifyjs.com/images/john.png"></v-img>
              </v-list-item-avatar>
            </v-list-item>

            <v-list-item link>
              <v-list-item-content>
                <v-list-item-title class="title">{{name}}</v-list-item-title>
                <v-list-item-subtitle>{{email}}</v-list-item-subtitle>
              </v-list-item-content>
            </v-list-item>
          </v-list>
          <v-divider></v-divider>
          <v-list nav dense>
            <v-list-item-group v-model="item" color="primary">
              <v-list-item v-for="(item, i) in items" :key="i" @click="flagReverse(i)">
                <v-list-item-icon>
                  <v-icon v-text="item.icon"></v-icon>
                </v-list-item-icon>

                <v-list-item-content>
                  <v-list-item-title v-text="item.title"></v-list-item-title>
                </v-list-item-content>
              </v-list-item>
            </v-list-item-group>
          </v-list>
        </v-navigation-drawer>
      </v-card>
    </v-col>

    <v-col sm="8" cols="12">
      <ReservationHistory v-if="items[0].flag" />
      <PetRegister v-if="items[1].flag" />
      <AccountManage v-if="items[2].flag" />
    </v-col>
  </v-row>
</v-container>
</template>

<script>
import PetRegister from "./PetRegister"
import ReservationHistory from './ReservationHistory'
import AccountManage from './AccountManage'
import api from '../../api'
import router from "../../router";

export default {
  components: {
    PetRegister,
    ReservationHistory,
    AccountManage
  },
  data() {
    return {
      items: [
        {
          title: '예약내역',
          icon: 'mdi-calendar-check',
          flag: true
        },
        {
          title: '반려동물 정보관리',
          icon: 'mdi-dog-side',
          flag: false
        },
        {
          title: '계정관리',
          icon: 'mdi-account',
          flag: false
        }
      ],
      name:"이름",
      email:"",
    }
  },
  created :function(){
    this.name = sessionStorage.getItem("name")
    this.email = sessionStorage.getItem("email")
  },
  methods: {
    alarm() {
      alert('Turning on alarm...')
    },
    blinds() {
      alert('Toggling Blinds...')
    },
    lights() {
      alert('Toggling lights...')
    },
    flagReverse(idx) {
      for(var i = 0; i < this.items.length; i++) {
        if(i == idx) {
          this.items[i].flag = true;
          continue;
        }

        this.items[i].flag = false;
      }
    }
  },
}
</script>

<style>
.border {
  border: 2px dashed orange;
}
</style>
