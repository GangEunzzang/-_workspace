package org.zerock.guestbook.entity;


import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
@Getter
abstract class BaseEntity {
    
    @CreatedDate  // 생성할때 날짜가 들어감
    @Column(name ="regdate", updatable = false)
    private LocalDateTime regDate; // 작성일
    
    @LastModifiedDate // 수정할때 날짜가 들어감
    @Column(name ="moddate")
    private LocalDateTime modDate; // 수정일
}
