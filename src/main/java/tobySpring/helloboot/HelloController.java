package tobySpring.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(String name){
        return "Hello " + name;
    }
}

// API 테스트 방법
// 터미널 창에 http -v 포트/path 입력
// ex> http -v ":8080/hello?name=Spring
//Ultimate 버전만 가능