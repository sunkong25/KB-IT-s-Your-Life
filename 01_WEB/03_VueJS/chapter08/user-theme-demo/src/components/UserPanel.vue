<template>
  <div style="border: solid 2px blue; padding: 10px">
    <h3>UserPanel</h3>
    <ThemeDisplay />
  </div>
</template>
<script>
import ThemeDisplay from './ThemeDisplay.vue';

export default {
  name: 'UserPanel',
  components: { ThemeDisplay },
};
</script>
