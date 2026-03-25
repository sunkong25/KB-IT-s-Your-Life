<template>
  <div>
    <img
      :src="image.url"
      :style="{
        width: '100px',
        height: '100px',
        cursor: 'pointer',
        border: image.clicked ? 'solid 3px red' : 'solid 3px gray',
      }"
      @click="handleClick"
    />
  </div>
</template>
<script>
export default {
  name: 'GalleryListItem',
  props: ['image'],
  emits: ['select'],
  methods: {
    handleClick() {
      this.$emit('select', this.image);
    },
  },
};
</script>
<style></style>
