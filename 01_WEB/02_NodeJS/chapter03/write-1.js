const fs = require('fs');
const path = require('path');

const filename = path.join(path.dirname(__filename), 'example.txt');
const readFile = fs.readFileSync(filename, 'utf-8');
fs.writeFileSync(
  path.join(path.dirname(__filename), 'text-1.txt'),
  readFile,
  'utf-8',
);

fs.writeFile(
  path.join(path.dirname(__filename), 'text-2.txt'),
  readFile,
  'utf-8',
  (err) => {
    if (err) {
      console.error(err);
    }
  },
);
