package com.todolist.se.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

  @GetMapping("/index.do")
  public String index(){
    return "index";
  }

  @GetMapping("/posts/save")
  public String postsSave(){
    return "posts-save";
  }

}