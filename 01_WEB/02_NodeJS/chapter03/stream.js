const fs = require('fs');

const rs = fs.createReadStream('./readMe.txt');
rs.on('data', (chunk) => {
  console.log('new chunk received');
  console.log(chunk.length, chunk);
})
  .on('end', () => {
    console.log('finished reading data');
  })
  .on('error', (err) => {
    console.err(`Error reading the file: ${err}`);
  });
