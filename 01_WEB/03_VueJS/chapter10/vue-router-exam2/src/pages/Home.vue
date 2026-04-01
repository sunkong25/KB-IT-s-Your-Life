<!-- <template>
  <div>
    <h1>게시물 목록</h1>
    <ul>
      <li><router-link to="/post/1">1번 글</router-link></li>
      <li><router-link to="/post/2">2번 글</router-link></li>
      <li><router-link to="/post/3">3번 글</router-link></li>
    </ul>
  </div>
</template> -->

<!-- 동적 바인딩 :to 사용 -->
<template>
  <div>
    <h1>게시물 목록</h1>
    <ul>
      <li v-for="post in posts" :key="post.id">
        <router-link :to="`/post/${post.id}`">{{post.id}}번 글</router-link>
      </li>
    </ul>
  </div>
</template>

<script setup>
import { ref } from 'vue';
const posts = ref([{ id: 1 }, { id: 2 }, { id: 3 }]);
</script>
