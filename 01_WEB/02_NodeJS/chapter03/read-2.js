const fs = require('fs');
const path = require('path');

const filename = path.join(path.dirname(__filename), 'example.txt');
console.log(filename);
const file = fs.readFileSync(filename, 'utf-8');
console.log(file);

fs.readFile(filename, 'utf-8', (err, data) => {
  if (err) {
    console.error(err);
    return;
  }
  console.log(data);
});
