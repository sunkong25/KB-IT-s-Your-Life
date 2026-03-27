<template>
  <div>
    X: <input type="text" v-model.number="x" /><br />
    Y: <input type="text" v-model.number="y" /><br />
    <div>결과 : {{ result }}</div>
  </div>
</template>

<script>
import { ref, watchEffect } from 'vue';

export default {
  name: 'Calc8',
  setup() {
    const x = ref(10);
    const y = ref(20);
    const result = ref(30);

    // 주로 페이지 이동, 데이터 로드를 함
    // computed는 cache있음, watch는 cache없음
    // 함수 내에 있는 값이 수정되면 둘다(computed, watch) 호출 된다.
    watchEffect(() => {
      result.value = x.value + y.value;
      console.log(`{x.value} + ${y.value} = ${result.value}`);
    });
    return { x, y, result };
  },
};
</script>
