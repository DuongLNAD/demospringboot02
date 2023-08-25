package com.cybersoft.demospringboot02.controller;


/*
*   Annotation định nghĩa đường dẫn
*   @Controller : Định nghĩa đường dẫn để trả ra nội dung html
*   Có thể trả ra String: Dùng thêm @ResponseBody
*
* ===============================================================================
*   @RestController : Dùng định nghĩa đường dẫn, nội dung trả về String (API)
*
*
*
*
*
*
* */

import jakarta.annotation.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("")
    public String hello() {

        return "Hello Spring boot";
    }

    @GetMapping("/cybersoft")
    public String HelloCybersoft() {

        return "Hello cyberSoft";
    }

}
