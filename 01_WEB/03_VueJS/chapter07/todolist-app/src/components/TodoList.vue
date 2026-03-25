<template>
  <div class="row">
    <div class="col">
      <ul class="list-group">
        <TodoListItem
          v-for="todoItem in todoList"
          :key="todoItem.id"
          :todoItem="todoItem"
          @toggle-completed="$emit('toggle-completed', $event)"
          @delete-todo="$emit('delete-todo', $event)"
        /> <!-- $붙으면 내장 객체, 발생한 이벤트를 객체로 받아옴 -->
      </ul>
    </div>
  </div>
</template>

<script>
import TodoListItem from './TodoListItem.vue';

export default {
  name: 'TodoList',
  components: { TodoListItem },
  props: {
    todoList: { type: Array, required: true },
  },
  emits: ['delete-todo', 'toggle-completed'],
};
</script>
