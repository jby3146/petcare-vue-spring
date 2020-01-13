<template>
    <v-flex>
        <v-btn
        @click="clickImgBtn()"
        color="warning"
        flat
        large
        replace
        style="font-size:1.2em;text-transform:none;"
        slot="text"
        class="text_font"
        >강아지 사진등록하기</v-btn
        >
        <form ref="myFileInputForm">
        <input
            style="display: none"
            type="file"
            id="ex_file"
            ref="inputBanner"
            v-on:processFile="processFile"
            @change="processFile()"
            class="imgur"
            accept="image/*"
        />
        </form>
        <v-img v-bind:src="linkaddr" height="300px"/> 
    </v-flex>
</template>
<script>
let linkdata;
export default {
   data: function() {
    return {
      linkaddr:"",
    };
  },
  methods:{
    clickImgBtn() {
      this.$refs.inputBanner.click();
    },
    linkpath(linkdatas){
      this.linkaddr = linkdata;
    },
     processFile() {
      var tempVue = this;
      var target = event.currentTarget;
      var xmlHttpRequest = new XMLHttpRequest();
      xmlHttpRequest.open("POST", "https://api.imgur.com/3/image/", true);
      xmlHttpRequest.setRequestHeader(
        "Authorization",
        "Client-ID babea18b3af5eaa"
      );
      xmlHttpRequest.send(target.files[0]);

      xmlHttpRequest.onreadystatechange = function() {
        if (xmlHttpRequest.readyState == 4) {
          if (xmlHttpRequest.status == 200) {
            var result = JSON.parse(xmlHttpRequest.responseText);
            linkdata = result.data.link;
            console.log("여기 오나요?",linkdata);
            tempVue.linkpath(linkdata);
            sessionStorage.setItem("linkurl",linkdata)
          } else {
            Swal.fire({
              title: "Error!",
              text: "이미지 업로드에 실패했습니다.",
              type: "error",
              confirmButtonText: "Ok!"
            });
          }
        }
      };
    }
  }
}
</script>
