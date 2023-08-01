# 목차
- [목차](#목차)
- [CSS를 사용하는 이유](#CSS를-사용하는-이유)
- [CSS 사용법](#CSS-사용법)
- [CSS 구성요소](#CSS-구성요소)
- [CSS 선택자](#CSS-선택자)
- [Box model](#Box-model)
  - [block level element](#block-level-element)
  - [inline element](#inline-element)
  - [Box의 구성 요소](#Box의-구성-요소)
- [그리드](#그리드)
- [미디어 쿼리](#미디어-쿼리)
- [CSS 코드의 재사용](#CSS-코드의-재사용)
  
# CSS를 사용하는 이유

1. 내용을 전달하는 HTML과 디자인을 관리하는 CSS로 역할을 분리하기 위해
2. CSS로 HTML 내의 디자인을 한번에 수정할 수 있는 효율성을 갖고 있기 때문에(중복 제거)

# CSS 사용법

1. html 코드 내부에서 style 속성을 사용하여 하나씩 수정한다. (선택자 x)
2. <style> 태그로 html과 분리하여 css 코드를 사용할 곳을 정의해준다. (선택자 o)

# CSS 구성요소

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d47f47d8-7daf-4af8-8762-e69478d2ed6d/Untitled.png)

1. 선택자 ( 무엇을 )
2. 선언 ( 어떻게 ) - 선언의 끝에는 항상 세미콜론 `;` 으로 구분한다.

# CSS 선택자

- 수정하고 싶은 HTML 부분들을 class 속성으로 그룹핑하여 CSS에서 효과를 줄 수 있다.
- class는 `.class명` 으로 선택한다.
- class 속성은 띄어쓰기를 구분으로 여러 개를 부여할 수 있다.
- 특정 수정하고 싶은 부분에 id 속성을 부여할 수 있으며 `#id명` 으로 CSS에서 선택한다.
- id값은 유일하고 고유한 값이어야 한다.
- id 선택자는 class 선택자보다 우선한다.
- class 선택자는 태그 선택자보다 우선한다.
- 즉, 구체적인 선택자가 포괄적인 선택자보다 우선한다.
- 만약 동등한 선택자라면 가장 나중에 등장한 효과를 적용한다.
- `,` 선택자를 통해 여러 element를 선택할 수 있다.
- Property 하나에 여러 value를 나열할 수 있으며, 순서는 상관없다. ex)`border : 5px, red, solid`

# Box Model

- html의 요소 하나하나를 박스로 바라보고 디자인하는 모델

### block level element

- 화면 전체를 사용하는 태그
- `display:block`

### inline element

- 콘텐츠만큼의 크기만 갖는 태그
- `display:inline`

## Box의 구성 요소

1. margin
    - border와 border 사이의 거리
2. border
    - element의 테두리, 경계선
3. padding
    - 내부 content와 border 사이의 거리
4. content
    - element의 내용

# 그리드

`<div>` : 디자인의 용도로 사용하는 아무 의미 없는 태그. block element이다.

`<span>`: 디자인의 용도로 사용하는 `<div>`와 같은 태그. inline element이다.

- 여러 element의 레이아웃을 정리해준다.
- `divide:grid` 를 정렬할 elements의 선택자에서 선언
- `grid-template` 속성으로 레이아웃 생성

# 미디어 쿼리

- 반응형 웹의 핵심
- 쿼리문의 조건에 따라 웹을 다르게 구현
- `@media(조건)`  으로 선언

# CSS 코드의 재사용

- CSS 파일에 공통으로 사용하고 관리할 CSS 코드 작성
- `<link>` 태그 활용
- 여러 html에서 하나의 CSS를 사용하고 유지보수 할 수 있음
- 네트워크 적인 측면에서는 CSS를 다운받아야하기 때문에 비효율적일 수도 있지만
- 캐싱 덕분에 한번 CSS를 받으면 CSS가 수정되기 전까지는 같은 CSS를 로드
