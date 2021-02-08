package com.scb.study.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<Entity 타입, PK타입> = 기본적인 CRUD 메소드 자동 생성
//Entity 클래스와 기본 Entity Repository는 함께 위치해야함
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
