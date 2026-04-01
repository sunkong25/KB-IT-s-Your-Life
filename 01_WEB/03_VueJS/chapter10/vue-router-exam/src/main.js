import { createApp } from 'vue'
import App from './App.vue'
import router from './router' // /router/index.js를 나타냄

const app = createApp(App)

app.use(router)

app.mount('#app')
