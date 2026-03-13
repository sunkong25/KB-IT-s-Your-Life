const fs = require('fs');
const path = require('path');

const dirpath = path.dirname(__filename);
fs.readFile(path.join(dirpath, 'example.txt'), 'utf-8', (err, data) => {
  if (err) {
    console.error(err);
  }
  console.log(data);

  fs.writeFile(
    path.join(dirpath, 'text-1.txt'),
    data,
    { flag: 'ax' },
    (err) => {
      if (err) {
        console.log('파일이 존재합니다.');
      }
    },
  );
});
