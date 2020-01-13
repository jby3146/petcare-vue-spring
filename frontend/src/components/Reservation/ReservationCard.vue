<template>
  <v-card
    class="mx-auto overflow-hidden reserv_card"
    style="max-width: 1000px;"
    :elevation="hover ? 16 : 2"
  >
    <v-row>
      <v-col class="d-flex" cols="4">
        <div style = "width:300px; height:300px margin-left:30px">
          <v-img
            class = "house_img" :src="imgurl"
          ></v-img>
          <div class = "rocations">
             <v-icon large class="mr-1 color = yellow">mdi-map-marker-outline</v-icon>
             <span class="subheading mr-2">{{address}}</span>
          </div>  
        </div>
        
        
      </v-col>
      <v-col cols="8">
        <v-container
          class="pa-0 pl-2"
          style="margin: -4px 0"
        >
         <v-card-title class="align-start">
            <div class = "user">
                <span class="headline">{{subject}}</span>
                <v-list-item class="grow">
                    <v-list-item-avatar color="grey darken-3">
                    <v-img
                        class="elevation-6"
                        src="https://3.bp.blogspot.com/-OyDHXLOIDJ4/W1jPc8xLJAI/AAAAAAAAA_Y/YKe8vetp-ugm49p1kh-2XrBcQzak5G0tACLcBGAs/s1600/da-dien-vien-trai-tim-mua-thu-blogtamsuvn-12-600x478.jpg"
                    ></v-img>
                    </v-list-item-avatar>
                    <v-list-item-content>
                    <v-list-item-title>{{name}}</v-list-item-title>
                    </v-list-item-content>

                    <v-list-item-avatar color="grey darken-3">
                    <v-img
                        class="elevation-6"
                        src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZxg4Zf1S-xQJPXLq7n7OvaFGs8crqwGYHjMmzx9LKgiux7Exq"
                    ></v-img>
                    </v-list-item-avatar>

                    <v-list-item-content>
                    <v-list-item-title>{{sitter_period}}</v-list-item-title>
                    </v-list-item-content>
                </v-list-item>
            </div>
            <v-spacer></v-spacer>
            </v-card-title>
            <v-chip-group>
              <v-chip 
              outlined 
              color = "teal" 
              >
              {{residence_type}}
              </v-chip>
              <v-chip outlined color = "teal">{{pet_size}}</v-chip>
              <v-chip outlined color = "teal">노령견케어</v-chip>
              <v-chip outlined color = "teal">자격증보유</v-chip>
              <v-chip outlined color = "teal">픽업가능</v-chip>
              <v-chip outlined color = "teal">반려견 없는 곳</v-chip>
            </v-chip-group>  

            <v-divider></v-divider>
            <v-card-actions class ="price_line">
            <span class="pl-2 grey--text text--darken-2 font-weight-light body-1">day care/</span>
            <span class="pl-2 font-weight-bold title">{{daycare}}</span>
            <span class="pl-2 amber--text text--darken-2 font-weight-light body-1">1박/</span>
            <span class="pl-2 amber--text font-weight-bold title">{{staycare}}</span>
            </v-card-actions>
            <div class = "bottom_line">
             <v-icon class="mr-1">mdi-clipboard-text-outline</v-icon>
             <span class="subheading mr-2">고객 후기 70개</span>
             <v-icon class="mr-1">mdi-star-outline</v-icon>
             <span class="subheading mr-2">정기 고객 3명</span>
               <v-progress-circular
              :value="93"
              color="deep-orange"
              :size="80"
              :width="15"
              >
              9.3
              </v-progress-circular>
            </div>
        </v-container>
      </v-col>
    </v-row>
  </v-card>
</template>

<script>
  export default {
        props: {
        name: {
        type: String,
        default: ""
        },
        address: {
        type: String,
        default: ""
        },
        subject: {
        type: String,
        default: ""
        },
        staycare: {
        type: String,
        default: ""
        },
        daycare: {
        type: String,
        default: ""
        },
        residence_type: {
        type: String,
        default: 0
        },
        imgurl: {
          type: String,
          default: ""
        },
        sitter_type: {
          type: String,
          default: ""
        },
        pet_size: {
          type: String,
          default: ""
        },
        sitter_period: {
          type: String,
          default: ""
        },
    },
    data: () => ({
      copied: false,
      dialog: false,
      rating: 10,
    }),

    methods: {
      copy () {
        const markup = this.$refs.link
        markup.focus()
        document.execCommand('selectAll', false, null)
        this.copied = document.execCommand('copy')
      },
    },
  }
</script>

<style>
 .rocations {
   color:white;
   background:black;
   width: 250px;
   position: relative;
   top:-290px;
   left:10px;
   z-index: 9;
   opacity: 0.6;
 }
 .house_img {
   position: relative;
   width:300px;
   height:300px;
 }
 .bottom_line {
   float: right;
   background: #f3eeee;	
   clear: both;
   margin-right: 50px;
 }
 .price_line {
   float: right;
   margin-right: 50px;
 }
 .user {
   width:500px;
 }
 .reserv_card:hover { 
    border:rgb(250, 202, 71) 2px solid; 
   }
</style>
