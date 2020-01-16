package com.catdog.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts,Long> {
    //인터페이스 생성 후 JpaRepository<Entity 클래스, PK 타입> 상속시
    //기본적인 CRUD 메소드가 자동으로 생성됩니다.

    // 주의점
    // Entity 클래스와 기본 Entity Repository는 함께 위치 해야 합니다.

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
