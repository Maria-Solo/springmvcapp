package com.mary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {
    @GetMapping( "hello-world")
    public String sayHello() {
return "hello/hello.html";
    }
//
//    @GetMapping
//    public String home() {
//        return "redirect:/hello-world";
//    }

}
