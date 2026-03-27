<template>
  <div>
    <!-- 증가와 감소 버튼 작성 -->
    <h3>Count : {{ count }}</h3>
    <button @click="increment">증가버튼</button>
    <button @click="decrement">감소버튼</button>
  </div>
</template>
<script setup>
import { ref } from 'vue';

const count = ref(0);
const increment = () => {
  count.value++;
};
const decrement = () => {
  count.value--;
};
</script>
