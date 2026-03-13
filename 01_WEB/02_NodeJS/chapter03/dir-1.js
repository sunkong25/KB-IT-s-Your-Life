const fs = require('fs');
const path = require('path');

const dirpath = path.dirname(__filename);

if (fs.existsSync(path.join(dirpath, 'test'))) {
  console.log('folder already exists');
} else {
  fs.mkdir(path.join(dirpath, 'test'), (err) => {
    if (err) {
      return console.error(err);
    }
    console.log('folder created');
  });
}
