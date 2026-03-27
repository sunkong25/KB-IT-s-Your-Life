<template>
  <div>
    X: <input type="text" v-model.number="x" /><br />
    Y: <input type="text" v-model.number="y" /><br />
  </div>
</template>

<script>
import { ref } from 'vue'; //객체로 무엇인가를 관리한다...

export default {
  name: 'Calc',
  setup() {
    // 주로 기본 데이터 타입을 사용하지만, 배열, 객체 등 다 사용할 수 있음
    //reactive는 참조 객체만 사용할 수 있음(객체, 배열 등...)
    /*
    o = ref({name, age})
    o.value.name
    o.value.age
    이런 단점으로 reactive가 등장
    */
    const x = ref(10);

    //템플릿에서 사용할 것을 객체로 return -> 사용되는 것
    //this를 사용하지 않음
    const y = ref(20);

    //스크립트에서 값을 사용하려면 .value를 이용해야됨(x.value, y.value)
    return { x, y };
  },
};
</script>
