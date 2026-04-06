<template>
  <div>
    <h3>count : {{ count }}</h3>
    <h3>doubleCount : {{ doubleCount }}</h3>
    <h1></h1>
    <button @click="increment">증가</button>
    <button @click="decrement">감소</button>
  </div>
</template>

<script setup>
import { useCounterStore } from '@/stores/counter';
import { storeToRefs } from 'pinia';

const store = useCounterStore();

const { count, doubleCount } = storeToRefs(store);
const { increment, decrement } = store;
</script>
