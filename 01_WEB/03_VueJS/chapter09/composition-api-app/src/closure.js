function outer() {
  let count = 0;

  function inner() {
    count++;
    console.log(count);
  }

  return inner;
}

const counter = outer(); //함수 코드 + 클로저(outer의 변수-count)

counter();
counter();
counter();
