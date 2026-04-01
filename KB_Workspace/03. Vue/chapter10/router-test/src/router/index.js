import { createRouter, createWebHistory } from 'vue-router';
import HomeView from '../views/HomeView.vue';
// import AboutView from '../views/AboutView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    // 배열에 초점을 맞춰서 봐야됨
    {
      path: '/',
      name: 'home',
      component: HomeView,
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      // component: () => import('../views/AboutView.vue'),
      // component: AboutView, //처음 기동할 때 로드됨
      component: () => import('../views/AboutView.vue'), // 요청이 왔을 때 로드됨. 성능적으로 더 좋음
    },
  ],
});

export default router;
