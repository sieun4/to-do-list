package com.todolist.se.service.posts;

import com.todolist.se.domain.posts.Posts;
import com.todolist.se.domain.posts.PostsRepository;
import com.todolist.se.web.dto.PostsListResponseDto;
import com.todolist.se.web.dto.PostsResponseDto;
import com.todolist.se.web.dto.PostsSaveRequestDto;
import com.todolist.se.web.dto.PostsUpdateRequestDto;
import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostsService {

  private final PostsRepository postsRepository;

  @Transactional
  public Long save(PostsSaveRequestDto requestDto){
    return postsRepository.save(requestDto.toEntity()).getId();
  }

  @Transactional
  public Long update(Long id, PostsUpdateRequestDto requestDto){
    Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 존재하지 않습니다. id = " + id));
    posts.update(requestDto.getTitle(), requestDto.getContent());
    return id;
  }

  public PostsResponseDto findById(Long id){
    Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 존재하지 않습니다. id = " + id));
    return new PostsResponseDto(entity);
  }

//  @Transactional(readOnly = true)
  public List<PostsListResponseDto> findAllDesc(){
    return postsRepository.findAllDesc().stream().map(PostsListResponseDto::new).collect(Collectors.toList());
  }

}
