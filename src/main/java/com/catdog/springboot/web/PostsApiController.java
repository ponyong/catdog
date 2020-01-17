package com.catdog.springboot.web;


import com.catdog.springboot.domain.posts.Posts;
import com.catdog.springboot.service.PostsService;
import com.catdog.springboot.web.dto.PostsListResponseDto;
import com.catdog.springboot.web.dto.PostsResponseDto;
import com.catdog.springboot.web.dto.PostsSaveRequestDto;
import com.catdog.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

//    @GetMapping("/api/v1")
//    public  List<PostsListResponseDto>  list() {
//        return postsService.findAllDesc();
//    }
    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }
}
