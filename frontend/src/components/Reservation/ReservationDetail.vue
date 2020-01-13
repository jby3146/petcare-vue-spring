<template>
<v-container fluid pa-3 style="min-height: 100px;">
  <v-row>
    <v-col sm="8" cols="12">
      <v-card>
        <v-navigation-drawer permanent width="300">
          <v-list>
            <v-list-item>
              <v-list-item-avatar>
                <v-img src="https://cdn.vuetifyjs.com/images/john.png"></v-img>
              </v-list-item-avatar>
            </v-list-item>

            <v-list-item link>
              <v-list-item-content>
                <v-list-item-title class="title">이름</v-list-item-title>
                <v-list-item-subtitle>메일@naver.com</v-list-item-subtitle>
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

    <v-col sm="4" cols="12">

    </v-col>
  </v-row>
</v-container>
</template>

<style>
.border {
  border: 2px dashed orange;
}
</style>
