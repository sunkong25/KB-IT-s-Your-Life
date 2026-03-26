<template>
  <div>
    <!-- MyForm 컴포넌트가 input처럼 동작한다 -->
    <MyForm v-model:title="title" v-model:content="content" />

    <h3>결과</h3>
    <p>제목: {{ title }}</p>
    <p>내용: {{ content }}</p>
  </div>
</template>

<script>
import MyForm from './components/MyForm.vue';

export default {
  components: { MyForm },
  data() {
    return {
      title: '',
      content: '',
    };
  },
};
</script>

<style scoped></style>
