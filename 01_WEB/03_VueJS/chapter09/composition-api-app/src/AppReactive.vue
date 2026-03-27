<template>
  <div>
    국어: <input type="text" v-model.number="score.kor" /> <br />
    영어: <input type="text" v-model.number="score.eng" /> <br />
    수학: <input type="text" v-model.number="score.math" /> <br />

    총합: {{ result }}
  </div>
</template>
<script>
import { reactive, computed } from 'vue';

export default {
  setup() {
    const score = reactive({
      kor: 0,
      eng: 0,
      math: 0,
    });

    const result = computed(() => {
      return score.kor + score.eng + score.math;
    });

    return { score, result };
  },
};
</script>
