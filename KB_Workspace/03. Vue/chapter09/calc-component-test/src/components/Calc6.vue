<template>
  <div>
    X: <input type="text" v-model.number="state.x" /><br />
    <div>결과 : {{ state.result }}</div>
  </div>
</template>

<script>
import { reactive, watch } from 'vue';

export default {
  name: 'Calc6',
  setup() {
    const state = reactive({ x: 0, result: 0 });
    watch(
      () => state.x,
      (current, old) => {
        // 첫 번째 인자에 함수를 넣어야된다.
        // current와 old는 ref의 객체가 아닌 ref.value 값이다.
        console.log(`${old} -> ${current}`);
        state.result = current * 2;
      },
    );

    return { state };
  },
};
</script>
