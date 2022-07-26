Spring Bean이란?\n
Spring IoC container가 관리하는 자바 객체, Spring Bean Container에 존재하는 객체를 말한다.

Spring IoC(Inversion of Control) Container에 의해 인스턴스화, 관리, 생성된다.

Bean Container는 의존성 주입을 통해 Bean 객체를 사용할 수 있도록 해준다.

Spring에서 Bean은 보통 Singleton으로 존재한다.

(Singleton: 어떤 Class가 최초 한번만 메모리를 할당하고(Static) 그 메모리에 객체를 만들어 사용하는 디자인 패턴)\n



Spring Container

: 스프링 컨테이너는 스프링 빈의 생명 주기를 관리하며,

생성된 스프링 빈들에게 추가적인 기능을 제공하는 역할을 한다.

즉 Container는 개발자가 작성한 코드의 처리과정을 위임받은 독립적인 존재라고 생각하면 된다.

Container는 적절한 설정만 되어있다면 누구의 도움 없이도 작성한 코드를 스스로 참조한 뒤 알아서 객체의 생성과 소멸을 컨트롤해준다.





출처

https://velog.io/@gillog/Spring-Bean-%EC%A0%95%EB%A6%AC
