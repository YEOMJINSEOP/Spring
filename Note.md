Spring Boot 

-MVC 패턴
애플리케이션의 역할을 Model, View, Contoller로 나누어, 이들 사이 상호작용을 통제하는 아키텍처 페턴이다.

![img](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2F6QO4D%2FbtrbhYYpWHL%2FjtSpTqBF8UbUbkili88bVk%2Fimg.png)
- controller란 무엇인가?
1. 사용자의 요청이 진입하는 지점(entry point)이며
2. 요청에 따라 어떤 처리를 할지 결정해주며(단, controller는 단지 결정만 해주고 실질적인 처리는 서비스(Latered Architecture에서 담당한다.))
3. 사용자에게 View(또는 서버에서 처리된 데이터를 포함하는 View)를 응답으로 보내준다.

- controller를 왜 쓰는가?
대규모 서비스로 갈수록 처리해야할 서비스들이 많아지는데, 이를 하나의 클래스에서 몰아서 처리할 게 아니라 
controlle라는 중간 제어자 역할을 하는 것을 만들어서 A 요청에 대한 것은 A-controller가 맡아 필요한 로직처리를 위한 서비스를 호출하게 된다.
controller는 MVC 패턴에 포함되는 것인데, Model View Controller의 역할에 따라 설계하고 코딩하면 주먹구구식으로 개발할 때 보다 개발비용이나 유지보수비용이 대폭 줄어든다. 역할 분담이 핵심이다.

출처: hardlearner.tistory.com/315
