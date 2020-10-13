package com.todolist.se.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

  @GetMapping("/index.do")
  public String index(){
    return "hello :D";
  }
}
