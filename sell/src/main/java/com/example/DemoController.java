package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lbf
 * @date 2020/6/21 19:58
 */
@RestController
public class DemoController {
    @GetMapping("/index")
    public String index(){
        return "Hello SpringBoot";
    }
}
