package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // localhost 8080 들어가면 첫 도메인
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
