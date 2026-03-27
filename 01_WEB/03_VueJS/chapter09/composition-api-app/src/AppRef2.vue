<template>
  <div>
    국어: <input type="text" v-model.number="kor" /> <br />
    영어: <input type="text" v-model.number="eng" /> <br />
    수학: <input type="text" v-model.number="math" /> <br />

    총합: {{ result }}
  </div>
</template>
<script>
import { ref, computed } from 'vue';

export default {
  setup() {
    const kor = ref(0);
    const eng = ref(0);
    const math = ref(0);

    const result = computed(() => {
      return kor.value + eng.value + math.value;
    });

    return { kor, eng, math, result };
  },
};
</script>
