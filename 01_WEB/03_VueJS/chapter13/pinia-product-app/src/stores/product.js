import { defineStore } from 'pinia';
import { ref } from 'vue';

export const useProductStore = defineStore('product', () => {
  const products = ref([]);

  function addProduct(product) {
    products.value.push(product);
  }

  //삭제
  function removeProduct(index) {
    products.value.splice(index, 1);
  }

  return { products, addProduct, removeProduct };
});
