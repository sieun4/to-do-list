package com.todolist.se.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter                   // get method 생성
@RequiredArgsConstructor  // 생성자 생성
public class HelloResponseDto {

  private String name;
  private int amount;

}