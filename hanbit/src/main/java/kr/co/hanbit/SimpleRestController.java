package kr.co.hanbit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
    @RequestMapping("/") // "/"경로로 들어온 요청의 경우 아래와 같이 작동한다.
    public String hello(){
        return "Hello <strong>Backend</strong>";
    }

    @RequestMapping("/article") // "/"경로로 들어온 요청의 경우 아래와 같이 작동한다.
    public String createArticle(@RequestParam("title") String title, @RequestParam("content") String content){
        return String.format("title=%s / content=%s", title, content);
    }

}
