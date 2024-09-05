package semicolon.devop.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentityController {
    @GetMapping("/api/v1/sayAWord")
    public String sayAWord(){
        return "Hello World!";
    }


}


