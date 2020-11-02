package com.todolist.se.domain.posts;

import com.todolist.se.domain.BaseTimeEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter             // Lombok - Getter 추가
@NoArgsConstructor  // Lombok - 생성자 추가
@Entity             // JPA - 테이블과 연결
public class Posts extends BaseTimeEntity {

  @Id   // PK
  @GeneratedValue(strategy = GenerationType.IDENTITY) // PK 생성 규칙
  private Long id;

  @Column(length = 500, nullable = false)   // 옵션 변경시 사용
  private String title;

  @Column(columnDefinition = "TEXT", nullable = false)
  private String content;

  private String author;

  @Builder
  public Posts(String title, String content, String author){
    this.title = title;
    this.content = content;
    this.author = author;
  }

  public void update(String title, String content){
    this.title = title;
    this.content = content;
  }

}