<template>
  <div>
    <img :src="image" style="width: 540px; height: 500px" />
    <!-- 동적으로 binding하려면 :을 앞에 붙여서 사용 -->
  </div>
</template>

<script>
export default {
  name: 'GalleryBig',
  props: ['image'],
};
</script>
<style></style>
