import { createRouter, createWebHistory } from 'vue-router';
import Home from '@/pages/Home.vue';
import PostDetail from '@/pages/PostDetail.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/', component: Home },
    { path: '/post/:id', component: PostDetail }, //동적 라우트
  ],
});

export default router;
