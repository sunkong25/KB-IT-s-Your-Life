const fs = require('fs').promises;

fs.readdir('./', 'utf-8')
  .then((result) => console.log(result))
  .catch((err) => console.error(err));
