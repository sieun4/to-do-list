package com.todolist.se.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

  @GetMapping("/index.do")
  public String index(){
    return "hello :D";
  }

}
