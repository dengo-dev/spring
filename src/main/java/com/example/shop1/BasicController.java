package com.example.shop1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {

  @GetMapping("/")
  String hello(){
    return "index.html";
  }

  @GetMapping("/about")
  @ResponseBody
  String about(){

    return "피싱사이트다";
  }

}
