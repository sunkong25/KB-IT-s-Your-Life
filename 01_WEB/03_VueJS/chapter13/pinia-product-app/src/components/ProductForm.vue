<template>
  <div>
    <h3>상품 등록</h3>
    <input v-model="form.name" placeholder="상품명 입력" /><br />
    <input v-model="form.price" type="number" placeholder="단가 입력" /><br />
    <input v-model="form.qty" type="number" placeholder="개수 입력" /><br />

    <button @click="submitForm">등록</button>
  </div>
</template>

<script setup>
import { useProductStore } from '@/stores/product';
import { storeToRefs } from 'pinia';
import { reactive } from 'vue';

const store = useProductStore();
const { products } = storeToRefs([]);

const form = reactive({
  name: '',
  price: 0,
  qty: 0,
});

function submitForm() {
  store.addProduct({ ...form });

  form.name = '';
  form.price = 0;
  form.qty = 0;
}
</script>
