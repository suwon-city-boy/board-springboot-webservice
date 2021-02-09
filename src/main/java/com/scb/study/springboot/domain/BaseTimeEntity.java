package com.scb.study.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

//모든 Entity들의 상위 클래스로, createdDate, modifiedDate 자동으로 관리
@Getter
@MappedSuperclass //이 클래스를 상속하는 Entity 클래스에서도 필드를 칼럼으로 인식
@EntityListeners(AuditingEntityListener.class) //Auditing 기능 포함
public class BaseTimeEntity {

    @CreatedDate //Entity가 생성, 저장될 때 시간 자동 저장
    private LocalDateTime createdDate;

    @LastModifiedDate //조회한 Entity의 값을 변경할 때 시간 자동 저장
    private LocalDateTime modifiedDate;

}
