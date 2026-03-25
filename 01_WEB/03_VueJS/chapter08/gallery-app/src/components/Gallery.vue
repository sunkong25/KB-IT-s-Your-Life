<template>
  <div>
    <GalleryBig :image="selectedImage.url" />
    <!-- :image->변수이름(v-bind:) 자식에게 보내는 값-->
    <GalleryList :images="images" @change-image="changeImage" />
  </div>
</template>

<script>
import GalleryBig from './GalleryBig.vue';
import GalleryList from './GalleryList.vue';

export default {
  name: 'Gallery',
  components: { GalleryBig, GalleryList },
  data() {
    //동적으로 데이터를 잡을때만 사용
    return {
      images: [
        { id: 'img01', url: './images/dog1.jpg', clicked: true },
        { id: 'img02', url: './images/dog2.jpg', clicked: false },
        { id: 'img03', url: './images/dog3.jpg', clicked: false },
        { id: 'img04', url: './images/dog4.jpg', clicked: false },
        { id: 'img05', url: './images/dog5.jpg', clicked: false },
      ],
      selectedImage: { id: 'img01', url: './images/dog1.jpg' },
    };
  },
  methods: {
    changeImage(image) {
      let index = this.images.findIndex((item) => image === item);
      image.clicked = !image.clicked;
      this.images[index].clicked = !this.images[index].clicked;
      this.selectedImage = this.images[index];
    },
  },
};
</script>
<style></style>

<!-- 3. props, $emit 사용

4. 현재 선택된 이미지는 Gallery.vue에서 관리한다.

5. 이벤트 이름
select
change-image

6. 이벤트 핸들러 메서드
GalleryListItem.vue
- handleClick()

GalleryList.vue
- selectImage()

Gallery.vue
- changeImage() -->
