<template>
  <div>
    X: <input type="text" v-model.number="state.x" /><br />
    Y: <input type="text" v-model.number="state.y" /><br />
    <button @click="calcAdd">계산</button><br />
    <div>결과 : {{ state.result }}</div>
  </div>
</template>

<script>
import { reactive } from 'vue';

export default {
  name: 'Calc3',
  setup() {
    const state = reactive({ x: 10, y: 20, result: 30 }); //data 대체

    // 내부 함수로 메서드 대체
    const calcAdd = () => {
      state.result = state.x + state.y; // 객체의 멤버가 변경되도 동작함
    };

    return { state, calcAdd };
  },
};
</script>
