<template>
  <v-container fluid>
    <div class = "search_container mx-auto">

    <v-row align="center" class="rows mx-auto" >
      <v-col class="d-flex" cols="2" sm="2">
        <v-select
          :items="service"
          label="서비스"
          dense
          outlined
          height="20"
        ></v-select>
      </v-col>

      <v-col class="d-flex" cols="2" sm="2">
        <v-menu
        ref="startMenu"
        v-model="startMenu"
        :close-on-content-click="false"
        :nudge-right="40"
        :return-value.sync="start"
        transition="scale-transition"
        min-width="290px"
        offset-y
        full-width
      >
        <template v-slot:activator="{ on }">
          <v-text-field
            v-model="start"
            label="Start Date"
            readonly
            outlined
            v-on="on"
          ></v-text-field>
        </template>
        <v-date-picker
          v-model="start"
          no-title
          scrollable
        >
          <v-spacer></v-spacer>
          <v-btn
            text
            color="primary"
            @click="startMenu = false"
          >
            Cancel
          </v-btn>
          <v-btn
            text
            color="primary"
            @click="$refs.startMenu.save(start)"
          >
            OK
          </v-btn>
        </v-date-picker>
      </v-menu>
      </v-col>

      <v-col class="d-flex" cols="2" sm="2">
        <v-menu
        ref="endMenu"
        v-model="endMenu"
        :close-on-content-click="false"
        :nudge-right="40"
        :return-value.sync="end"
        transition="scale-transition"
        min-width="290px"
        offset-y
        full-width
      >
        <template v-slot:activator="{ on }">
          <v-text-field
            v-model="end"
            label="End Date"
            readonly
            outlined
            v-on="on"
          ></v-text-field>
        </template>
        <v-date-picker
          v-model="end"
          no-title
          scrollable
        >
          <v-spacer></v-spacer>
          <v-btn
            text
            color="primary"
            @click="endMenu = false"
          >
            Cancel
          </v-btn>
          <v-btn
            text
            color="primary"
            @click="$refs.endMenu.save(end)"
          >
            OK
          </v-btn>
        </v-date-picker>
      </v-menu>
      </v-col>

      <v-col class="d-flex" cols="2" sm="2">
        <v-select
          :items="age"
          label="반려견 나이"
          dense
          outlined
        ></v-select>
      </v-col>

      <v-col class="d-flex" cols="2" sm="2">
        <v-select
          :items="size"
          label="반려견 크기"
          dense
          outlined
        ></v-select>
      </v-col>

      <v-col class="d-flex" cols="2" sm="2">
        <v-btn large color="#69ddca">찾기</v-btn>
      </v-col>
    </v-row>

    <v-row align="center" class="rows mx-auto">
      <v-chip-group
        v-model="selection"
        multiple
        active-class="teal accent-4 white--text"
      >
        <v-chip>아파트</v-chip>
        <v-chip>마당</v-chip>
        <v-chip>환자견케어</v-chip>
        <v-chip>노령견케어</v-chip>
        <v-chip>자격증보유</v-chip>
        <v-chip>실외배변</v-chip>
        <v-chip>수제간식</v-chip>
        <v-chip>픽업가능</v-chip>
        <v-chip>반려견 없는 곳</v-chip>
        <v-chip>응급처치</v-chip>
        <v-chip>투약가능</v-chip>
        <v-chip>대형견</v-chip>
      </v-chip-group>  
    </v-row>
    </div>

    <v-flex v-for="item in list">
      <ReservationCard
        :name="item.name"
        :address="item.address"
        :subject="item.subject"
        :staycare="item.staycare"
        :daycare="item.daycare"
        :residence_type="item.residence_type"
        :sitter_type="item.sitter_type"
        :pet_size="item.pet_size"
        :imgurl="item.imgurl"
        :sitter_period="item.sitter_period"
      />
    </v-flex>
  </v-container>
</template>

<script>
    import api from '../../api'
    import ReservationCard from "./ReservationCard"
    export default {
    components: {
      ReservationCard
    },
    data: () => ({
      name:'',
      list:[],
      startMenu: false,
      endMenu: false,
      start:'',
      end:'',
      selection:'',
      service: ['24시간 돌봄', '데이케어'],
      age: ['강아지 (1살이하)', '성견 (2살~6살)', '노령견 (7살 이상)'],
      size: ['소형견(0~5kg)', '중형견(5~15kg)', '대형견(15kg 이상)'],
      grade: ['신규', '일반', '우수'],
      user:'',
    }),
    created(){
      this.getFindAllSitter();
    },
    methods: {
      async getFindAllSitter(){
        var dat =await api.findAllSitter();
        this.list = dat.data;
        console.log("!@3123")
        console.log(this.list)
        return dat.data;
      }
    }
  }
</script>

<style>
  .rows{
    width: 95%;
  }
  .search_container{
    border: 1px solid #000000;    
    width: 80%;
    padding: 50px 0px;
    margin-bottom: 50px;
    background:white;
  }
</style>