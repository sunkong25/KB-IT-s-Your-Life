<template>
    <h1>게시물 상세 페이지</h1>
    <h3>ID : {{route.params.id }}</h3>
</template>
<script>
import { useRoute } from 'vue-router';

export default {
    setup() {
        const route = useRoute(); //현재 URL 정보 가져오기
        
        return {route}
    }
}
</script>