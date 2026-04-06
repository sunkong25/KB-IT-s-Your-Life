<template>
  count: {{ count }} <br />
  doubleCount: {{ doubleCount }}
  <button @click="increment">증가</button>
  <hr />
  <div>
    <h2>TodoList 테스트(Composition API)</h2>
    <hr />
    할일 추가:
    <input type="text" v-model="todo" />
    <button @click="addTodoHandler">추가</button>
    <hr />
    <ul>
      <li v-for="todoItem in todoList">
        <span style="cursor: pointer" @click="toggleDone(todoItem.id)">
          {{ todoItem.todo }} {{ todoItem.done ? '(완료)' : '' }}
        </span>
        &nbsp;&nbsp;&nbsp;
        <button @click="deleteTodo(todoItem.id)">삭제</button>
      </li>
    </ul>
    <div>완료된 할일 수 : {{ doneCount }}</div>
  </div>
</template>
<script setup>
import { useCounterStore } from '@/stores/counter.js';

const { increment } = useCounterStore(); //액션함수는 문제가 없음, 상태 데이터는 반응성을 잃어버린다. 분해할당으로 가져오면 값을 복사해서 가져옴
const store = useCounterStore();

const doubleCount = computed(() => store.doubleCount);

// const store = useCounterStore();
// console.log(store);
// store.count = 10;
// console.log(store.count);

import { useTodoListStore } from '@/stores/todoList.js';
import { ref, computed } from 'vue';

const todo = ref('');

const todoListStore = useTodoListStore();
const { todoList, addTodo, deleteTodo, toggleDone } = todoListStore;
const doneCount = computed(() => todoListStore.doneCount);

const addTodoHandler = () => {
  addTodo(todo.value);
  todo.value = '';
};
</script>
