package com.todolist.se.web;

import com.todolist.se.service.posts.PostsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

  private PostsService postsService;

  @GetMapping("/")
  public String index(Model model){
    model.addAttribute("posts", postsService.findAllDesc());
    return "index";
  }

  @GetMapping("/posts/save")
  public String postsSave(){
    return "posts-save";
  }

}