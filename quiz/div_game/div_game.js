const win = {
  가위: '보',
  바위: '가위',
  보: '바위',
};

function onButtonClick(userInput) {
  const choices = ['가위', '바위', '보'];
  const comInput = choices[Math.floor(Math.random() * 3)];

  let result = '내 패: ' + userInput + ', 컴퓨터 패: ' + comInput;
  if (userInput === comInput) {
    result += ' - 비김';
  } else if (win[userInput] === comInput) {
    result += ' - 이김';
  } else {
    result += ' - 짐';
  }

  alert(result);
}
