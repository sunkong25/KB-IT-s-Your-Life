const fs = require('fs');

const rs = fs.createReadStream('./readMe.txt', 'utf8');
const ws = fs.createWriteStream('./write.txt');

rs.pipe(ws);
