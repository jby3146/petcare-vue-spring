<template>
    <v-container>
        <v-layout column >
            <v-flex>
                <h1 style="text-align:center">방문펫시터 예약</h1>
                <br/>
                <div style="text-align:center;width:100%; margin:15px; padding:20px;">
                    <div style="text-align:center;width:50%; background:#F2F2F2; display:inline-block;">
                        <p>원하시는 방문유형을 선택해주세요.</p>
                        <v-btn block color="blue" large dark v-on:click="regularvisit">정기 방문 돌봄 신청</v-btn><br/>
                        <v-btn block color="red" large dark v-on:click="commonvisit">일반 방문 돌봄 신청</v-btn>
                        <br/>
                        <v-icon>fas fa-list</v-icon> 정기 방문 돌봄 신청
                        <p><font size="1">매월 몇회씩 방문 돌봄을 신청하는 서비스로 정기 결제 시 최대 22% 할인 된 가격으로 이용하실 수 있습니다.</font></p>
                        <br/>
                        <v-icon>fas fa-flag</v-icon> 일반 방문 돌봄 신청
                        <p><font size="1">여행 및 출장 등의 이유로 단기 방문 돌봄을 신청하는 서비스로 5회 이상 예약 시 회당 10% 할인된 가격으로 이용하실 수 있습니다.</font></p>
                        <br/>
                    </div>
                </div>
                <v-dialog
                v-model="dialog"
                width="100%">
                <div style="text-align:center;width:100%; margin:15px; padding:20px;">
                    <div style="text-align:center;width:50%; background:#F2F2F2; display:inline-block;">
                        <h3>방문 예약 전 아래 내용을 확인해 주세요</h3>
                        <div style="margin:15px; display:grid; border:1px solid #A4A4A4;">
                            <p>원하는 시간대 안에서 예약이 진행됩니다.</p>
                            <v-divider/>
                            <p>도담도담은 원활한 돌봄을 위해 시간대로 운영되고 있습니다.
오전 (9~12) 오후 (12~15 / 15~18) 저녁 (18~21) 타임 중 요청한 시간대 내에서 스케쥴에 따라 시간대가 결정됩니다.</p>
                        </div>
                        <div style="margin:15px; display:grid;display:grid; border:1px solid #A4A4A4;">
                            <p>돌봄은 1시간 단위로 제공됩니다.</p>
                            <v-divider/>
                            <p>펫시터는 요청한 시간대에 방문해 기본 1시간 돌봄을 (산책, 배식, 배변처리) 진행합니다.
또한 1시간 내 최대 2마리까지 산책이 가능하며 3마리 이상 산책을 원할 경우 2시간 돌봄으로 예약 신청 바랍니다.</p>
                        </div>
                        <div style="margin:15px; display:grid;display:grid; border:1px solid #A4A4A4;">
                            <p>2명의 펫시터가 교차 배정될 수 있습니다.</p>
                            <v-divider/>
                            <p>원하는 날짜, 시간대 방문을 위해 최소 2명의 펫시터가 배정될 수 있으며 펫시터 지정은 불가합니다.</p>
                        </div>
                        <div style="margin:15px; display:grid;display:grid; border:1px solid #A4A4A4;">
                            <p>하네스가 없으면 산책이 불가합니다.</p>
                            <v-divider/>
                            <p>도담도담은 산책 시 발생될 수 있는 놓침 사고를 예방하기 위해 이중산책줄을 사용합니다.
도담도담에서 준비한 목줄과 하네스를 결합하여 사고를 방지하고 있습니다. 하네스가 없을 경우 산책은 불가하며 실내놀이로 대체됩니다.</p>
                        </div>
                        <div style="margin:15px; display:grid;display:grid; border:1px solid #A4A4A4;">
                            <p>반려동물 등록 및 인식표를 의무화해주세요</p>
                            <v-divider/>
                            <p>도담도담은 동물등록 의무화 관련 법령을 이행하지 않아 발생되는 모든 책임들에 대한 의무가 없음을 알려드립니다.</p>
                        </div>
                        <v-btn v-on:click="reservation">확인</v-btn>
                    </div>
                </div>
                </v-dialog>
           </v-flex>
        </v-layout>
    </v-container>
</template>
<script>
import axios from "axios"
import api from '../../api'
import router from "../../router";

export default {
  data: () => ({
   weight:0,
   petname:"",
   breeds:"",
   petage:0,
   ok:true,
   dialog:false,
   petinfo:{
       petname:"",
       breeds:"",
       petage:0,
       weight:""
  },
  }),
  components:{},
  methods:{
      regularvisit(){
          this.dialog=!this.dialog
      },
      commonvisit(){
          
      },
      reservation(){
          this.$router.push("/visitreservationdate");
      }
  }

};

</script>