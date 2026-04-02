<template>
  <div>
    <h1>test</h1>
  </div>
</template>

<script setup>
import axios from 'axios';

const listUrl = '/api/todos';
const requestAPI = async () => {
  let data = { todo: '윗몸일으키기 3세트', desc: '너무 빠르지 않게...' };
  try {
    let response = await axios.post(listUrl, data);
    console.log(response);
  } catch (e) {
    console.log('## 다음 오류가 발생했습니다.');
    if (e instanceof Error) console.log(e.message);
    else console.log(e);
  }
};

requestAPI();
</script>
