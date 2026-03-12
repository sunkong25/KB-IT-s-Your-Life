let orderPizza = false;
const order = new Promise((resolve, reject) => {
  if (orderPizza) {
    resolve('피자를 주문합니다.');
  } else {
    reject('피자를 준문하지 않습니다.');
  }
});

order.then((result) => console.log(result)).catch((err) => console.log(err));
