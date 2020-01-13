<template>
  <v-container>
    <v-layout justify-center>
      <form style="width:500px">
        <v-banner class="grey lighten-5">
          도담도담에 궁금한 점을 1:1로 문의하는 공간입니다.
          <v-icon>mdi-emoticon-cool-outline</v-icon>
        </v-banner>
        <v-divider></v-divider>
        <v-row
          class="mb-6"
          justify="center"
          no-gutters
        >
          <v-col>
            <v-select
              v-model="select"
              :items="items"
              :error-messages="selectErrors"
              label="문의유형"
              required
              @change="$v.select.$touch()"
              @blur="$v.select.$touch()"
            ></v-select>
          </v-col>
        </v-row>
        <v-row
          class="mb-6"
          justify="center"
          no-gutters
        >
          <v-col cols="4">
            <v-text-field
              v-model="name"
              :error-messages="nameErrors"
              :counter="10"
              label="성명"
              required
              cols="2"
              @input="$v.name.$touch()"
              @blur="$v.name.$touch()"
            ></v-text-field>
          </v-col>
          <v-col cols="1">
          </v-col>
          <v-col cols="7">
            <v-text-field
              v-model="email"
              :error-messages="emailErrors"
              label="E-mail"
              required
              @input="$v.email.$touch()"
              @blur="$v.email.$touch()"
            ></v-text-field>
          </v-col>

        </v-row>

        <v-row
          class="mb-6"
          justify="center"
          no-gutters
        >
          <v-text-field
            v-model="title"
            :error-messages="titleErrors"
            :counter="30"
            label="제목"
            required
            @input="$v.title.$touch()"
            @blur="$v.title.$touch()"
          ></v-text-field>
        </v-row>
        <v-row
          class="mb-6"
          justify="center"
          no-gutters
        >
          <v-subheader>문의내용</v-subheader>
          <v-textarea
            v-model="content"
            label="내용을 입력하세요."
            counter
            maxlength="200"
            full-width
            outlined
          ></v-textarea>
        </v-row>
        <div class="d-flex flex-row-reverse">
          <v-btn class="mr-4" @click="submit">submit</v-btn>
          &nbsp&nbsp
          <v-btn class="ml-4" @click="clear">clear</v-btn>
        </div>

      </form>
    </v-layout>
  </v-container>
</template>

<script>
  import { validationMixin } from 'vuelidate'
  import { required, maxLength, email } from 'vuelidate/lib/validators'

  export default {
    mixins: [validationMixin],

    validations: {
      name: { required, maxLength: maxLength(10) },
      email: { required, email },
      title: { required, maxLength: maxLength(30) },
      content: {},
      select: { required },
    },

    data: () => ({
      name: '',
      email: '',
      title: '',
      select: null,
      items: [
        'Item 1',
        'Item 2',
        'Item 3',
        'Item 4',
      ],
    }),

    computed: {
      nameErrors () {
        const errors = []
        if (!this.$v.name.$dirty) return errors
        !this.$v.name.maxLength && errors.push('성명은 최대 10글자 입력 가능합니다.')
        !this.$v.name.required && errors.push('성명입력은 필수입니다.')
        return errors
      },
      emailErrors () {
        const errors = []
        if (!this.$v.email.$dirty) return errors
        !this.$v.email.email && errors.push('유효한 이메일 형식이어야합니다.')
        !this.$v.email.required && errors.push('이메일 입력은 필수입니다.')
        return errors
      },
      selectErrors () {
        const errors = []
        if (!this.$v.select.$dirty) return errors
        !this.$v.select.required && errors.push('문의유형 선택은 필수입니다.')
        return errors
      },
      nameErrors () {
        const errors = []
        if (!this.$v.title.$dirty) return errors
        !this.$v.title.maxLength && errors.push('제목은 30글자를 초과할 수 없습니다.')
        !this.$v.title.required && errors.push('제목은 필수입니다.')
        return errors
      },
      contentErrors () {
        const errors = []
        if (!this.$v.content.$dirty) return errors
        return errors
      },

    },

    methods: {
      submit () {
        this.$v.$touch()
      },
      clear () {
        this.$v.$reset()
        this.title = ''
        this.content = ''
        this.name = ''
        this.email = ''
        this.select = null

      },
    },
  }
</script>
