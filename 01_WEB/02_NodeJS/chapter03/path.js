const path = require('path');

console.log(path.join('some', 'work', 'ex.txt'));
console.log(`파일 절대 경로: ${__filename}`);
console.log(`경로만: ${__dirname}`);

const filename = path.basename(__filename);
console.log(`파일 이름: ${filename}`);

const file = path.basename(__filename, '.js');
console.log(`파일 이름(확장자 제외): ${file}`);

const ext = path.extname(__filename);
console.log(`파일 확장자: ${ext}`);

const all = path.parse(__filename);
console.log(all);
