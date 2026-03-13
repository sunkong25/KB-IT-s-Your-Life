const fs = require('fs');
const path = require('path');
const dir = path.dirname(__filename);
const list = fs.readdirSync(dir);
console.log(list);
