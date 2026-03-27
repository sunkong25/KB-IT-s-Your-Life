<template>
  <div>
    X: <input type="text" v-model.number="x" /><br />
    Y: <input type="text" v-model.number="y" /><br />
    <button @click="calcAdd">계산</button><br />
    <div>결과 : {{ result }}</div>
  </div>
</template>

<script>
import { ref } from 'vue';

export default {
  name: 'Calc2',
  setup() {
    /*
    모두 const를 사용
    x = 20 대입을 차단하기 위해 const를 사용(즉, 상수로 선언하는 것을 권장)
    */
    const x = ref(10);
    const y = ref(20);
    const result = ref(30);

    const calcAdd = () => {
      result.value = x.value + y.value;
    };

    return { x, y, result, calcAdd };
  },
};
</script>
