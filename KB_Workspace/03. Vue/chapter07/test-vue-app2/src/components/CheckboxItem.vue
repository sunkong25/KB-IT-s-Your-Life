<template>
  <li><input type="checkbox" v-model="checked" />옵셥1</li>
</template>
<script>
export default {
  name: 'CheckboxItem',
  data() {
    return {
      checked: false,
    };
  },
};
</script>
