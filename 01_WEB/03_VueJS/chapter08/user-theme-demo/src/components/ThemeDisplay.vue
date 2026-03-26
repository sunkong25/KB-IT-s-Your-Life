<template>
  <div style="border: solid 2px yellow; padding: 10px; margin-top: 10px;">
    <p>Theme: {{ theme }}</p>
  </div>
</template>
<script>
export default {
  name: 'ThemeDisplay',
  inject: ['theme'],
};
</script>
