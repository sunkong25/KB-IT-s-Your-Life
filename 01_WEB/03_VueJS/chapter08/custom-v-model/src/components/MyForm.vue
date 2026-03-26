<template>
  <div>
    제목
    <input
      type="text"
      placeholder="제목 입력"
      :value="title"
      @input="$emit('update:title', $event.target.value)"
    />
    <br />
    내용
    <textarea
      placeholder="내용 입력"
      :value="content"
      cols="50"
      rows="5"
      @input="$emit('update:content', $event.target.value)"
    ></textarea>
  </div>
</template>
<script>
export default {
  props: { title: String, content: String },
};
</script>
<style></style>
