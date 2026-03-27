<template>
  <div>
    X: <input type="text" v-model.number="state.x" /><br />
    Y: <input type="text" v-model.number="state.y" /><br />
    <div>결과 : {{ result }}</div>
  </div>
</template>

<script>
import { reactive, computed } from 'vue';

export default {
  name: 'Calc3',
  setup() {
    const state = reactive({ x: 10, y: 20 });
    const result = computed(() => { //계산된 속성명
      return state.x + state.y;
    });
    /**
     * 한 줄짜리 함수여서
     * computed(() => state.x + state.y)로도 사용 가능
     */
    /**
     * watch는 스크립트만 변경하고 싶을 때 사용
     */

    return { state, result };
  },
};
</script>
