// import './assets/main.css'

import { createApp } from 'vue';
import App from './App.vue';
import CheckboxItem from './components/CheckboxItem.vue';

createApp(App)
  .component('CheckboxItem', CheckboxItem) //컴포넌트 등록(전역)
  .mount('#app');
