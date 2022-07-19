Spring Boot 

-MVC 패턴
애플리케이션의 역할을 Model, View, Contoller로 나누어, 이들 사이 상호작용을 통제하는 아키텍처 페턴이다.
1. Model: 비즈니스 규칙을 표현
2. View: 프레젠테이션을 표현
3. Controller: 위 두가지를 분리하기 위해 양측 사이에 배치된 Interface

![img](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2F6QO4D%2FbtrbhYYpWHL%2FjtSpTqBF8UbUbkili88bVk%2Fimg.png)

- controller란 무엇인가?
사용자의 요청이 진입하는 지점(entry point)

주로 사용자의 요청을 처리한 후 지정된 뷰에 모델 객체를 넘겨주는 역할을 수행한다.
지정된 뷰에 모델 객체를 넘겨주는 역할은 두가지로 나누어 설명할 수 있다.
1. 사용자들이 웹브라우저에 'URI*'로 요청을 보내면, 그 요청을 컨트롤러가 받게 된다.
2. 요청에 대한 응답(View)을 반환한다.


- controller를 왜 쓰는가?
대규모 서비스로 갈수록 처리해야할 서비스들이 많아지는데, 이를 하나의 클래스에서 몰아서 처리할 게 아니라 
controlle라는 중간 제어자 역할을 하는 것을 만들어서 A 요청에 대한 것은 A-controller가 맡아 필요한 로직처리를 위한 서비스를 호출하게 된다.
controller는 MVC 패턴에 포함되는 것인데, Model View Controller의 역할에 따라 설계하고 코딩하면 주먹구구식으로 개발할 때 보다 개발비용이나 유지보수비용이 대폭 줄어든다. 역할 분담이 핵심이다.

출처 
MVC : https://sudo-minz.tistory.com/25
controller : hardlearner.tistory.com/315
