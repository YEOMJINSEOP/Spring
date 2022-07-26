package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    // 생성자에 Autowired를 사용해서 Controller와 Service를 연결해준다
    // MemberController가 생성될 때 Spring 빈에 등록되어 있는 MemberService 객체를 가져다가 딱 넣어준다.
    // 즉, 스프링이 의존 관계를 주입해주는 것이다.
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

}
