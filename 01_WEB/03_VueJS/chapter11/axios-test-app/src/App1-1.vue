<template>
  <div>
    <h1>test</h1>
  </div>
</template>

<script setup>
import axios from 'axios';

const listUrl = '/api/todos1';
const todoUrlPrefix = '/api/todos/';

const requestAPI = async () => {
  try {
    let todoList = [];

    let response = await axios.get(listUrl);
    todoList = response.data;

    console.log('# TodoList : ', todoList);
    for (let i = 0; i < todoList.length; i++) {
      response = await axios.get(todoUrlPrefix + todoList[i].id);
      console.log(response.data);
    }
  } catch (error) {
    console.log(error);
  }

  // axios
  //   .get(listUrl)
  //   .then((response) => {
  //     todoList = response.data;
  //     console.log('# TodoList : ', todoList);
  //     console.log(todoList[0]);
  //     return todoList[0].id;
  //   })
  //   .then((id) => {
  //     return axios.get(todoUrlPrefix + id);
  //   })
  //   .then((response) => {
  //     console.log('## 첫번째 Todo : ', response.data);
  //   });
};

requestAPI();
</script>
