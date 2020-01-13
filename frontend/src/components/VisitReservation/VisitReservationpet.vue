<template>
    <v-container>
        <v-layout column >
            <v-flex >
                <p aline="center">돌봄을 신청하는 반려동물을 등록해주세요.</p>
                <div v-if="ok">
                <v-text-field v-model="petname" label="이름" hint="강아지 이름을 적어주세요^^"></v-text-field>
                <v-text-field v-model="pettype" label="견종" hint="강아지 견종을 적어주세요^^"></v-text-field>
                <v-text-field v-model="petage" label="나이" hint="강아지 나이를 적어주세요^^"></v-text-field>
                <br/>
                <p> 강아지의 크기를 체크해주세요</p>
                <v-radio-group v-model="weight" column>
                    <v-radio
                        label="5kg미만(소형견)"
                        color="primary"
                        value="소형견"
                    ></v-radio>
                    <v-radio
                        label="5~15kg(중형견)"
                        color="secondary"
                        value="중형견"
                    ></v-radio>
                    <v-radio
                        label="15kg이상(대형견)"
                        color="success"
                        value="대형견"
                    ></v-radio>
                </v-radio-group>
                <v-btn to='/visitreservation'>뒤로</v-btn>
                <v-btn v-on:click="onoff">다음</v-btn>
                </div>
            </v-flex>
           
           <v-flex >
                <div v-if="!ok" style="width:100%; background:#F2F2F2">
                    <div v-for="(pet,i) in petlist">
                        <p>{{pet.petname}}({{pet.pettype}}/{{pet.petage}}살/{{pet.weight}})<v-btn icon v-on:click="pop(i)"><v-icon>fa-close</v-icon></v-btn></p>
                    </div>
                
                    <br/>
                    <v-btn v-on:click="back">뒤로</v-btn>
                    <v-btn color="#A9F5F2" v-on:click="sessionon">다음</v-btn>
                </div>
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
   pettype:"",
   petage:0,
   ok:true,
   petinfo:{     
   },
   petlist:[
   ],
  }),
  methods:{
      onoff(){
          this.ok=!this.ok;
          this.petinfo.petname=this.petname
          this.petinfo.pettype=this.pettype
          this.petinfo.petage=this.petage
          this.petinfo.weight=this.weight
          console.log(this.petinfo)
          if(sessionStorage.getItem("userpetlist")!=null)
            this.petlist = JSON.parse(sessionStorage.getItem("userpetlist"))
            console.log(this.petlist)

          this.petlist.push({petname:this.petname,pettype:this.pettype,petage:this.petage,weight:this.weight})
          console.log(this.petlist + " : petlsit")
          sessionStorage.setItem("userpetlist",JSON.stringify(this.petlist));

      },
      sessionon(){
          console.log(this.petlist[0])
          sessionStorage.setItem("userpetlist",JSON.stringify(this.petlist));
          sessionStorage.setItem("userpetinfo",JSON.stringify(this.petinfo));
          this.$router.push("/visitreservationnext");
      },
      pop(index){
          this.petlist.pop(index);
          sessionStorage.setItem("userpetlist",JSON.stringify(this.petlist));
      },
      back(){
          this.ok=!this.ok;
      }
  }

};

</script>