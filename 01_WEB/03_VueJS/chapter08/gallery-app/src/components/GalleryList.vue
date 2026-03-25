<template>
  <div style="display: flex; gap: 10px; margin-top: 20px">
    <GalleryListItem
      v-for="image in images"
      :key="image.id"
      :image="image"
      @select="selectImage"
    />
  </div>
</template>
<script>
import GalleryListItem from './GalleryListItem.vue';

export default {
  name: 'GalleryList',
  components: { GalleryListItem },
  props: ['images'],
  emits: ['select'],
  methods: {
    selectImage(image) {
      this.$emit('change-image', image);
    },
  },
};
</script>
<style></style>
