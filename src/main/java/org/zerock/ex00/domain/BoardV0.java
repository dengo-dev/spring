package org.zerock.ex00.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardV0 {

    private Long bno;

    private String title;

    private String content;

    private String writer;

    private LocalDateTime regDate;

    private LocalDateTime updateDate;

}
