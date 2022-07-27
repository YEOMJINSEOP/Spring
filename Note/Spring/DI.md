Controller
: 컨트롤러를 통해 외부 요청을 받고,

Service
: 비즈니스 로직을 만들고

Repository
: 리포지터리에서 데이터를 저장하고

이게 정형화 된 패턴이다. (김영한님 인프런 강의)

-----

Spring Bean이란?


Spring IoC container가 관리하는 자바 객체, Spring Bean Container에 존재하는 객체를 말한다.


Spring IoC(Inversion of Control) Container에 의해 인스턴스화, 관리, 생성된다.


Bean Container는 의존성 주입을 통해 Bean 객체를 사용할 수 있도록 해준다.


Spring에서 Bean은 보통 Singleton으로 존재한다.


(Singleton: 어떤 Class가 최초 한번만 메모리를 할당하고(Static) 그 메모리에 객체를 만들어 사용하는 디자인 패턴으로, 유일하게 하나만 등록해서 공유한다.)

따라서 같은 스프링 빈이면 모두 같은 인스턴스다.

설정으로 싱글톤이 아니게 설정할 수 있지만, 특별한 경우를 제외하면 대부분 싱글톤을 사용한다.

Bean으로 등록됐을 때의 장점
1. 스프링 IoC 컨테이너에 등록된 Bean들은 의존성 관리가 수월해진다.
2. 스프링 IoC 컨테이너에 등록된 Bean들은 싱글톤의 형태이다.
이러한 장점들 때문에 우리가 직접 Inversion of Control의 코드를 작성해서 사용하는 것이 아니라 스프링의 IoC 컨테이너를 사용하는 것이다.

![img](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FAo7Sn%2FbtqFQxKUqBn%2FV1ipb2pFAyNkqhRLowRYuk%2Fimg.png)

Bean을 등록하는 방법
1. xml 설정파일을 통한 등록
2. Java 코드를 이용해서 Bean 등록
3  SpringBoot는 어노테이션을 통해 Bean을 설정하고 주입 


-----

Spring Container


: 프로그래머가 작성한 코드의 처리 과정을 위임받아 독립적으로 처리하는 존재이다.
 
스프링 컨테이너는 스프링 빈의 생명 주기를 관리하며,


생성된 스프링 빈들에게 추가적인 기능을 제공하는 역할을 한다.


즉 Container는 개발자가 작성한 코드의 처리과정을 위임받은 독립적인 존재라고 생각하면 된다.


Container는 적절한 설정만 되어있다면 누구의 도움 없이도 작성한 코드를 스스로 참조한 뒤 알아서 객체의 생성과 소멸을 컨트롤해준다.

-----

Spring IoC란?(Inversion of Control)


제어의 역전 이라는 의미로, 말 그대로 메소드나 객체의 호출작업을 개발자가 결정하는 것이 아니라, 외부에서 결정되는 것을 의미한다.


즉, 제어의 흐름을 바꾼다고 할 수 있다.


객체의 의존성을 역전시켜 객체 간의 결합도를 줄이고 유연한 코드를 작성할 수 있게 해 가독성 및 코드 중복, 유지 복수를 편하게 할 수 있게 한다.


기존에는 다음 순서로 객체가 만들어지고 실행됐다.
1. 객체 생성
2. 의존성 객체 생성(클래스 내부에서 생성)
3. 의존성 객체 메소드 호출

하지만, 스프링에서는 다음과 같은 순서로 객체가 만들어지고 실행된다.
1. 객체 생성
2. 의존성 객체 주입(스스로가 만드는 것이 아니라 제어권을 스프링에게 위임해 스프링이 만들어놓은 객체를 주입한다.)
3. 의존성 객체 메소드 호출

스프링이 모든 의존성 객체를 스프링이 실행될 때 다 만들어주고 필요한 곳에 주입시킴으로써 Bean들은 singleton 패턴을 가지며,
제어의 흐름을 사용자가 컨트럴하는 것이 아니라 스프링에게 맡겨 작업을 처리하게 된다.

-----

DI란?

Inversion of Control이라고도 하는 의존 관계 주입(Dependecy Injection)이다.
어떤 객체가 사용하는 의존 객체를 직접 만들어 사용하는게 아니라, 주입 받아 사용하는 방법이다

-----
스프링 IoC 컨테이너란?

애플리케이션 컴포넌트의 중앙 저장소이다.
Bean 설정 소스로부터 Bean 정의를 읽어들이고, 구성하고 제공한다.
Bean들의 의존 관계를 설정해준다.(객체의 생성을 책임지고, 의존성을 관리한다.)
가장 중요한 인터페이스는 BeanFactory, ApplicationContext이다.

![img](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcM9Dkl%2FbtqGywqvBaK%2Fs3oPO0uTKTQVuE2pORGJq1%2Fimg.jpg)

*BeanFactory: 스프링 빈 컨테이너에 접근하기 위한 최상위 인터페이스
Bean 객체를 생성하고 관리하는 인터페이스이다.
디자인패턴의 일종인 팩토리 패턴을 구현한 것이다.
BeanFactory 컨테이너는 구동될 때 Bean 객체를 생성하는 것이 아니라, 클라이언트의 요청이 있을 때 객체를 생성한다.

*ApplicationContext:
ListableBeanFactory(BeanFactory의 하위 인터페이스로 Bean을 Listable하게 보관하는 인터페이스)를 상속하고 있으며,
여러 기능을 추가로 제공한다.(ResourceLoader, ApplicationEvenetPublisher, MessageSource, Bean LifeCycle)
BeanFactory를 상속받은 interface이며, 구동되는 시점에 등록된 Bean 객체들을 스캔해 객체화한다.

--

지금까지 객체를 사용하기 위해서 그림과 같이 new 생성자를 이용하거나 getter/setter 기능을 써야만 했다. 
어플리케이션에는 이러한 객체가 무수히 많이 존재하고 서로 참조하고 있을 것이다.
서로 참조하고 있는 정도가 심할수록 의존성이 높다고 표현한다. 
낮은 결합도와 높은 캡슐화로 대변되는 OOP에서 높은 의존성은 매우 지양된다.

![img](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fbu9Zpi%2FbtqGAfPyl3m%2FndbIcpLaKSFrjp2KXckDK1%2Fimg.jpg)

이런 의존성 제어, 즉 객체간의 의존성을 낮추기 위해 IoC 컨테이너가 사용된다.

![img](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcFVRwB%2FbtqGAfBUIhb%2FavKdOUXQpKkpxqlNyF7TC1%2Fimg.jpg)

-----
의존성 주입을 사용하는 이유

1. 재사용성을 높임
2. 테스트에 용이
3. 코드를 단순화
4. 사용하는 이유를 파악하기 수월하고, 가독성이 좋음
5. 종속성이 감소해 변경에 민감하지 않다.
6. 결합도는 낮추면서 유연성과 확장성은 향상시킬 수 있다.
7. 객체간의 의존관계를 설정할 수 있다.

-----
IoC 사용 목적

호출 방식

1. 클래스 호출 방식
클래스 내에 선언과 구현이 같이 있기 때문에 다양한 형태로 변화가 불가능하다.
![img](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FmqcsT%2FbtqGvYIu8OV%2FTDuqI5uhMWyOXYzoN0ofDk%2Fimg.jpg)

2. 인터페이스 호출 방식
클래스를 인터페이스와 인터페이스를 상속받아 구현하는 클래스로 분리했다.
구현클래스 교체가 용이해 다양한 변화가 가능하다.
그러나 구현클래스 교체시 호출클래스의 코드에서 수정이 필요하다.(부분적으로 종속적)
![img](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FdcIkKG%2FbtqGuFWY5To%2FLyQpg5Lak2Th3ijypN0Tk0%2Fimg.jpg)

3. 팩토리 호출 방식
팩토리가 구현 클래스를 생성하기 때문에 호출클래스는 팩토리를 호출 하는 코드로 충분하다.
구현클래스 변경시 팩토리만 수정하면 되기 때문에 호출클래스에는 영향을 미치지 않는다.
그러나 호출 클래스에서 팩토리를 호출하는 코드가 들어가야 하는 것 또한 팩토리에 의존함을 의미한다.
![img]()

4. IoC
팩토리 패턴의 장점을 더해 어떠한 것에도 의존하지 않는 형태.
실행시점에 클래스 간의 관계가 형성된다.
즉, 의존성이 삽입된다는 의미로 IoC를 DI라는 표현으로 사용한다.
![img](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbkXmw3%2FbtqGyxi7F0J%2FZC5EK1xgK6CNKx5JdJKA5k%2Fimg.jpg)


-----

@Autowired란?
필요한 의존 객체의 "타입"에 해당하는 빈을 찾아 주입한다.

1. 생성자
2. setter
3. 필드

위의 세 가지 경우에 Autowired를 사용할 수 있다.
Autowired는 기본값이 true이기 때문에 의존성 주입을 할 대상을 찾이 못한다면 애플리케이션 구동에 실패한다.

-----
자료 및 내용 출처: 
Bean 정리: https://velog.io/@gillog/Spring-Bean-%EC%A0%95%EB%A6%AC
DI, IoC 정리: https://velog.io/@gillog/Spring-DIDependency-Injection
스프링 의존성 주입(DI)란? : https://devlog-wjdrbs96.tistory.com/165?category=882236
