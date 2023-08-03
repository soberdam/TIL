# 목차
- [목차](#목차)
- [자바스크립트란?](#자바스크립트란?)
- [Script 태그](#Script-태그)
- [이벤트](#이벤트)
- [콘솔](#콘솔)
- [제어할 태그 선택하기](#제어할-태그-선택하기)
- [데이터 타입](#데이터-타입)
  - [문자열](#문자열)
  - [숫자](#숫자)
  - [undifined, null](#undifined,-null)
- [변수와 연산자](#변수와-연산자)
  - [변수](#변수)
  - [상수](#상수)
  - [비교 연산자](#비교-연산자)
- [배열](#배열)
  - [Array.join()](#Array.join())
- [함수](#함수)
- [객체](#객체)
  - [객체의 순회](#객체의-순회)
- [에러 내용](#에러-내용)
- [라이브러리](#라이브러리)
  - [라이브러리 vs 프레임워크](#라이브러리-vs-프레임워크)
  - [jQuery](#jQuery)
- [Web API](#Web-API)
  - [Dom](#Dom)
  - [Bom](#Bom)

# 자바스크립트란?

- HTML : 웹의 구조, CSS : 웹 꾸미기
- JavaScript : 동적 웹사이트 개발(Iot, 서버 개발, 하이브리드앱)
- 사용자와 상호작용하는 반응형 웹사이트 개발 시 필요
- HTML을 제어하는 언어
- 웹페이지를 동적으로, 다이나믹하게 만들어 준다

# Script 태그

```jsx
</body>
	<script src="index.js"></script>
</html>

```

- <script>태그를 사용하여 html 내부에서 javaScript 코드를 작성한다.
- js파일로 작성 후 <script> 태그 안에 src의 속성값으로 js파일을 입력하여 html파일과 연동한다.
- 캐시로 한번 js파일을 다운받으면 수정되기 전까지 저장해두기 때문에 자원을 절감할 수 있다.
- script태그는 body의 닫는 태그 뒤에 위치하는 것이 좋다.
- `document.write()` 웹에 표시, 동적인 결과 (HTML은 정적인 결과)
- `console.log();` 특정 변수 내 데이터 확인
- 우클릭 + 검사 or F12로 변수 데이터 확인
- 변수의 데이터를 웹 화면에 출력할 때 사용하는 명령어는 `document.write(변수명)`
- `document.writeln();`을 사용하면 출력값 사이에 공백을 넣을 수 있다.

# 이벤트

- `on~` 으로 시작하는 속성(이벤트)의 값으로는 항상 javascript가 와야 한다.
- js코드를 읽고 대기하다가, 이벤트가 일어났을 때 js코드를 해석하여 실행한다.
- 이를 통해 사용자와 상호작용 하는 웹을 만들 수 있다.

# 콘솔

- 개발자 도구의 Console을 이용하여 js코드를 실행시키면 웹 안에 삽입된 js처럼 동작한다.
- elements를 보며 Console을 동시에 보고싶으면 esc를 누른다.
- JS는 웹사이트를 만들 때 뿐만 아니라, 웹을 나의 필요에 따라 사용할 때에도 유용하다.
- 실행을 유보하고 싶을 때에는 `Shift+Enter`

# 제어할 태그 선택하기

- `on` 속성에서 value를 `document.querySelector('element')`로 선택한 후
- `.style` 로 이벤트 시 해당 element에 적용할 CSS를 설정
- `querySelector` 는 첫 번째로 등장하는 태그의 element를 선택하므로
- 태그의 모든 element를 선택하려면 `querySelectorAll('element')`
- element들을 노드리스트로 반환한다.

# 데이터 타입

- 8가지 데이터 타입이 있다.
    1. String : 문자열
    2. Number : 숫자
    3. Boolean : 불린
    4. Function : 함수
    5. Object : 객체
    6. Array : 배열
    7. undefined : 정의되지 않음
    8. null : 널

• `typeof()`는 피연산자의 자료형을 문자열로 리턴한다.

## 문자열

- 문자열 프로퍼티와 메소드

```jsx
let str1 = "Hello World";

str1.length; // 문자열 길이
str1.charAt(0); // 첫번째 문자 추출
str1.split(" "); // 공백 기준으로 문자 나눈 배열 출력
```

- 문자열 메소드 `repeat()`는 주어진 옵션의 count만큼 문자열을 반복하여 출력 `“*”.repeat(3) → “***”`
- 문자열 메소드 `indexOf()` 는 매개변수인 문자(열)의 위치를 반환
- 문자열에 상수를 곱하여 출력하는 게 불가. `“*” * 3 → NaN`
- `trim()` 메소드는 문자열의 좌우 공백을 없애준다.
- 문자열의 산술 연산은 덧셈은 문자를 더하고, 나머지는 숫자 연산을 한다.
- 문자열에서  역슬래시 \를 통해 따옴표를 문자로 사용 가능 `‘He \’s a boy’`
- `toLowerCase()` 메소드는 모든 문자열을 소문자로 변환시켜주는 메소드.

## 숫자

- Math 라이브러리 연산 메소드

```jsx
Math.abs() : 절댓값

Math.ceil() : 올림

Math.floor() : 내림

Math.random() : 임의의 숫자 출력
```

- 문자나 실수를 정수/실수로 변환하는 메소드

```jsx
parseInt() : 정수 형태로 변환

parseFloat() : 실수 형태로 변환
```

## undifined, null

- `undefined` : 변수 안에 데이터를 입력하지 않은 상태 (데이터가 없는 것)
- `null` : 개발자가 임의로 변수 안에 빈 데이터를 삽입한 상태(빈 데이터를 지정한 것)

```jsx
 var unde;
 var empty = null;
```


# 변수와 연산자

## 변수

- 값이 변할 수 있다.
- 대입 연산자를 통해 값을 설정할 수 있다.
- variable

## 상수

- 값이 변할 수 없다.
- constant

## 비교연산자

`==` , `!=` 은 단순 값비교, `===` , `!==`은 타입까지 비교

```jsx
console.log(10 == "10") // true;
console.log(10 != "10") // false;

console.log(10 === "10") // false;
console.log(10 !== "10") // true;
```

# 배열

- 배열은 대괄호 `[]`안에 선언, 순서대로 저장하며 인덱스 접근이 가능하다.

```jsx
let fruit = ["사과", "배", "포도"];

fruit.length; // 데이터 개수

fruit.push("딸기"); // 배열 뒤에 데이터 삽입
fruit.unshift("레몬"); // 배열 앞에 데이터 삽입

fruit.pop(); // 배열 뒤의 데이터 제거
fruit.shift(); // 배열 앞의 데이터 제거
```

## Array.join()

**join()** 메서드는 배열의 모든 요소를 연결해 하나의 문자열로 만든다.

> 예제
> 

```jsx
var arr = ['바람', '비', '물'];

console.log(arr.join());
// 바람,비,물
console.log(arr.join(''));
// 바람비물
console.log(arr.join('-'));
// 바람-비-물
```

객체나 딕셔너리의 key와 value를 설정할 때.

dictObj = {}

dictObj[’과일’] = ‘맛있다’; // {과일 : 맛있다} 로 저장됨

값에 접근할 때도 key로 value값 추출 가능



# 함수

```jsx
// 함수 선언
function func1() {
	connsole.log("func1");
}

// 함수 호출

func1();

```

- function 키워드를 통해 생성한다.
- on~속성에서 호출할 때 인자에 this를 전달하여 호출하는 element에 대한 정보 전달 가능.
- 함수에서는 이를 self 인자로 받아 구현한다.
- 언어의 함수들이 변수처럼 다루어질 때 ***일급 함수***를 가진다고 한다.
- JS는 일급 함수이므로 함수를 객체처럼 사용할 수 있다.
- **함수**를 변수에 할당할 수도 있고 객체에 추가할 수도 있으며 다른 **함수**에 인수로 전달하거나 **함수**에서 **함수**를 반환할 수도 있다
- 함수를 리턴하는 것과 함수의 결과값을 리턴하는 것은 다르다.
- 예를 들어 `return add()` 는 add함수의 결과값을 리턴 하고, `return add` 는 add함수를 리턴한다

# 객체

```jsx
let student = {
name : "damhyun",
age : 27,
skills : ["자바스크립트", "HTML", "CSS"],

sum : fucntion(num1, num2) { return num1 + num2; }
}
```

- 객체는 중괄호 `{}` 안에 선언
- 객체는 프로퍼티, 메서드 데이터로 구성
- 프로퍼티와 메소드를 선언할 때마다 `,`로 구분
- `.` 접근자로 프로퍼티와 메소드에 접근
- `.` 접근자에 대입메소드를 활용하여 프로퍼티와 메소드 저장 가능  `object.name = "이름"`
- `객체명.프로퍼티명` 같이 접근하거나, `객체명[”프로퍼티명”] `과 같이 접근가능
- 후자는 문자열이라 프로퍼티명에 띄어쓰기 가능
- 메소드 내부에서 `this` 키워드를 사용하여 객체 자신을 가리킬 수 있다.

## 객체의 순회

- `for .. in`반복문을 활용한다.

```jsx
for(let key in object) {
	console.log(key + " : " + object[key]);
}

// 객체의 프로퍼티와 메소드를 순회하며 출력한다.
```

# 에러 내용

Invalid left-hand side in assignment

부적절한 위치에서 할당 행위를 하려고 할 때 대표적인 발생하는 에러로서, 흔한 문법 오류이다.

가장 흔한 실수하는 부분이 논리연산자 부분에 변수 할당하려고 했을때 자주 발생한다.

```jsx
// 만일 a가 100이면 b에 값을 할당하는 조건단축문법a == 100 && b = 7// !! 논리값 에서 변수할당을 해서 에러Copy
```

해결책은 다음과 같다.

```jsx
a == 100 && (b = 7)// 괄호를 쳐서 실행문으로 만든다.
```

# 라이브러리

## 라이브러리 vs 프레임워크

- 라이브러리는 필요한 기능들을 모아놓은 플러그인
- 프레임워크는 특정한 프로그램을 만들기 위한 일종의 반제품
- 라이브러리는 내가 처음부터 구현하며 필요한 기능들을 가져다 쓰는 느낌이라면
- 프레임워크는 만들어진 틀 안에서 내가 기능구현만 수정하는 느낌

## jQuery

- 자바스크립트의 가장 대표적인 라이브러리
- 라이브러리를 다운로드 받아서 프로젝트 폴더에 import하거나
- CDN을 활용하여 script 태그의 src에 url을 입력한다.

# Web API

- JavaScript가 아닌, 브라우저에서 제공하는 window 전역 객체의 요소
- 개발자가 HTML문서나 브라우저의 elements들을 제어할 수 있게 해주는 API
- 모든 Node 객체는 EventTarget 인터페이스를 상속받으므로, addEvenetListener와 removeEventListener기능을 사용할 수 있다.

## DOM

- Document Object Model
- 문서에 대한 모든 내용을 담고 있는 객체
- HTML, XML문서의 프로그래밍 인터페이스
- 브라우저의 렌더링 엔진이 HTML을 해석(Parsing)해서 HTML의 구조를 노드 트리로 제공
- 확장자가 다른 JavaScript가 HTML과 CSS를 읽고 수정할 수 있는 건 DOM 때문
- document 노드는 DOM트리의 최상위에 존재하는 유일한 객체
- getElementsBytagName, getElementsByClassName, querySelectorAll 메소드를 주로 사용
- getElementsBytagName, getElementsByClassName은 HTML Collection 객체이며
- querySelectorAll 은 NodeList객체이다.
- HTML Collection 객체는 Live객체여서 Dom이 변경되면 자동으로 값을 변경
- NodeList 는 정적으로 과거의 값 유지
- 둘 다 for문 반복이 가능하지만, HTML Collection은 forEach 사용이 불가능
- 노드 객체의 상태 변경과 상관없이 사용하려면 둘 다 스프레드 연산자로 배열로 변환 후 사용하는 것을 권장

## BOM

- Browser Object Model
- 웹 브라우저 환경의 다양한 기능을 객체처럼 다루는 모델
- 브라우저 버튼, URL, 주소입력창, 타이틀바 등
- 정의된 표준이 없어 브라우저마다 세부사항이 다르다.
- window는 최상위 객체이기 때문에 생략이 가능하다.
