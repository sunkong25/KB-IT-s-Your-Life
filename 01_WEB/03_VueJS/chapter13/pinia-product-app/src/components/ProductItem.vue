<template>
  <div style="border: 1px solid #ccc; padding: 10px; margin: 5px">
    <div>번호 : {{ props.index }}</div>
    <div>상품명 : {{ product.name }}</div>
    <div>단가 : {{ product.price }}</div>
    <div>개수 : {{ product.qty }}</div>
    <div>합계: {{ product.price * product.qty }}</div>
    <button @click="removeProduct(props.index)">삭제</button>
  </div>
</template>

<script setup>
import { useProductStore } from '@/stores/product';

const store = useProductStore();
const { removeProduct } = store;

const props = defineProps({
  product: Object,
  index: Number,
});
</script>
