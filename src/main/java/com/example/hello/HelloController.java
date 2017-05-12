package com.example.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Solbon on 2017-05-11.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi() {
        return "Hello World";
    }
}
