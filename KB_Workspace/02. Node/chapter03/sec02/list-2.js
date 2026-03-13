const fs = require('fs');
fs.readdir('./', (err, files) => {
  //.은 현재 디렉토리를 나타냄, ..은 부모 디렉토리를 나타냄
  //./는 프로세스의 현재 디렉토리(즉, process의 working 디렉토리)
  if (err) {
    console.log(err);
    return;
  }
  console.log(files);
});

fs.readdir(__dirname, (err, files) => {
  if (err) {
    console.error(err);
    return;
  }
  console.log(files);
});
