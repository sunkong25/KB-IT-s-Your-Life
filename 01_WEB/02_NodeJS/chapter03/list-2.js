const fs = require('fs');
const path = require('path');

const dirname = path.dirname(__filename);
fs.readdir(dirname, (err, data) => {
  if (err) {
    console.error(err);
    return;
  }
  console.log(data);
});
