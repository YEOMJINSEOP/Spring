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
1. 사용자들이 웹브라우저에 'URI'로 요청을 보내면,
2. URI가 매핑된 컨트롤러의 메소드가 실행된다.
3. 요청에 대한 응답(View)을 반환한다.


(참고)URI란?
URL(Uniform Resource Locator) : 자원을 '서버에 있는 폴더' 위치로 찾아간다.
URI(Uniform Resource Identifier) : 위치로 찾아가게 하는 것이 아니라, id로 mapping시켜 놓는다. 따라서 사용자에게 파일 이름, 위치 노출이 되지 않는다.(그래서 컨트롤러를 만든다는 말은 곧 URI를 만든다는 말.)
단어에서 알 수 있듯, 위치와 식별자라는 차이가 있다.
예를 들어 http://opentutorials.org:3000/main?id=HTML&page=12 라는 주소가 있다고 하자.
여기서 http://opentutorials.org:3000/main 까지는 URL이다.(URI이기도 한)
그리고 http://opentutorials.org:3000/main?id=HTML&page=12 이것은 URI라고 할 수 있다.(URL은 아닌)
다시 말해 URL은 자원의 '위치'를 나타내 주는 것이고, URI는 자원의 '식별자'이다.
?id=HTML&page=12 이 부분은 위치를 나타내는 것이 아닌 id 값이 HTML이고, page가 12인 것을 나타내주는 식별하는 부분이기 때문이다.


- controller를 왜 쓰는가?
대규모 서비스로 갈수록 처리해야할 서비스들이 많아지는데, 이를 하나의 클래스에서 몰아서 처리할 게 아니라 
controlle라는 중간 제어자 역할을 하는 것을 만들어서 A 요청에 대한 것은 A-controller가 맡아 필요한 로직처리를 위한 서비스를 호출하게 된다.
controller는 MVC 패턴에 포함되는 것인데, Model View Controller의 역할에 따라 설계하고 코딩하면 주먹구구식으로 개발할 때 보다 개발비용이나 유지보수비용이 대폭 줄어든다. 역할 분담이 핵심이다.

출처 
https://sudo-minz.tistory.com/25
https://hardlearner.tistory.com/315

