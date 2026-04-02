<template>
  <div>
    <h2>콘솔을 확인합니다.</h2>
  </div>
</template>

<script setup>
import axios from 'axios';

const requestAPI = () => {
  const url = '/api/todos/1'; //프론트엔드 서버와 백엔드 서버가 동일하다. -> 데이터 API 제공
  axios.get(url).then((response) => {
    console.log('# 응답객체 : ', response);
    console.log(typeof response.data);
  });
};

requestAPI();
</script>


