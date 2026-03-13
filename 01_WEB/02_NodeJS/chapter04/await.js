const fs = require('fs').promises;

async function readDir() {
  try {
    const file = await fs.readdir('./', 'utf-8');
    console.log(file);
  } catch (error) {
    console.error(err);
  }
}

readDir();
