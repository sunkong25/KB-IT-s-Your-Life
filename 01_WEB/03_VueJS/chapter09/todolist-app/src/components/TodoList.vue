<template>
  <div class="row">
    <div class="col">
      <ul class="list-group">
        <TodoListItem
          v-for="todoItem in todoList"
          :key="todoItem.id"
          :todoItem="todoItem"
          @toggle-completed="emit('toggle-completed', todoItem.id)"
          @delete-todo="emit('delete-todo', todoItem.id)"
        />
        <!-- $붙으면 내장 객체, 발생한 이벤트를 객체로 받아옴 -->
      </ul>
    </div>
  </div>
</template>

<script setup>
import TodoListItem from './TodoListItem.vue';

const props = defineProps({
  todoList: { type: Array, required: true },
});
const emit = defineEmits(['delete-todo', 'toggle-completed']);
</script>
