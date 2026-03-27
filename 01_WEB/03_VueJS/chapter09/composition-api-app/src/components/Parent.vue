<template>
  <div>
    <h3>숫자: {{ count }}</h3>
    <Child :initCount="count" @update-count="updateCount" />
  </div>
</template>

<script setup>
import { ref } from 'vue';
import Child from './Child.vue';

const count = ref(5);
const updateCount = (newCount) => {
  count.value = newCount;
};
</script>
