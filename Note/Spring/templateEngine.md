-Template Engine이란?

지정된 템플릿 양식과 데이터가 합쳐져 HTML 문서를 출력하는 소프트웨어.
웹사이트 화면을 어떤 형태로 만들지 도와주는 양식이다.

![img](https://velog.velcdn.com/images/hi_potato/post/f80ea247-368e-41ee-b5c8-6e1baee7458c/image.png)

웹 템플릿 엔진은 view code(HTML)과 data logic code(DB connection)를 분리해주는 기능을 한다.

템플릿 엔진은 Server Side Template Engine과 Client Side Template Engine으로 나룰 수 있다.


-Server Side Template Engine
![img](https://velog.velcdn.com/images/hi_potato/post/03a0b91f-ff0b-4259-89dc-5060369c658a/image.png)
서버에서 DB 혹은 API에서 가져온 데이터를 미리 정의된 Template에 넣어 HTML을 그려서 클라이언트에 전달해주는 역할을 한다.

HTML 코드에서 고정적으로 사용되는 부분은 템플릿으로 만들어두고 동적으로 생성되는 부분만 템플릿 특정 장소에 끼워 넣는 방식으로 동작할 수 있도록 해준다.

동작 과정
1. 클라이언트의 요청을 받는다.
2. 필요한 데이터 DB나 API에서 가져온다.
3. 미리 정의된 Template에 해당 데이터를 배치한다.
4. 서버에서 HTML(데이터가 반영된 Template)을 그린다.
5. 해당 HTML을 클라이언트에게 전달한다.

서버에서 최종 html 결과를 만들어서 브라우저에 전달하기 때문에 주로 화면 이동이 많은 곳에서 사용된다.
대표적인 서버 사이드 템플릿 엔진으로는 Thymeleaf, JSP, Freemarker가 있다.


- Client Side Template Engine
![img](https://velog.velcdn.com/images/hi_potato/post/1ce0b1f9-1012-41d1-9ecd-81d48fc540b2/image.png)

HTML 형태로 코드를 작성할 수 있으며 동적으로 DOM을 그리게 해주는 역할이다.
데이터를 받아서 DOM 객체에 동적으로 그려주는 프로세스를 담당한다.

동작 과정
1. 클라이언트에서 공통적인 프레임을 미리 Template으로 만든다.
2. 서버에서 필요한 데이터를 받는다.
3. 데이터를 Template에 배치하고 DOM 객체에 동적으로 그려준다.

URL이 바뀌어도 HTML을 다시 내려받지 않고 클라이언트에서 알아서 그리기 때문에 주로 단일 화면에서 화면이 변경되는 경우에 사용된다.

대표적인 클라이언트 사이드 템플릿 엔진으로는 Mustache, Squirrelly, Handlebars가 있다.

- 필요성
1. 많은 코드를 줄일 수 있다.
대부분의 템플릿 엔진은 기존의 HTML에 비해 간단한 문법을 사용한다.
2. 재사용성이 높다. 
똑같은 디자인의 페이지에 보이는 데이터만 바뀌는 경우
3. 유지 보수에 용이하다.
하나의 템플릿을 만들어 여러 페이지를 렌더링

---
출처: 템플릿 엔진이란? https://velog.io/@hi_potato/Template-Engine-Template-Engine


