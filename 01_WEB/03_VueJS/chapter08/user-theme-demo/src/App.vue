<template>
  <div>
    <h1>App</h1>
    <p>현재 사용자 : {{ username }}</p>
    <UserForm v-model:username="username" />
    <UserPanel />
  </div>
</template>

<script>
import UserPanel from './components/UserPanel.vue';
import UserForm from './components/UserForm.vue';

export default {
  name: 'App',
  components: { UserPanel, UserForm },
  data() {
    return {
      theme: 'dark',
      username: '',
    };
  },
  provide() {
    return {
      theme: this.theme,
    };
  },
};
</script>
