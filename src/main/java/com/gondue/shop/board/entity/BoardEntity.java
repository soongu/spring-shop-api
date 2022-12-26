package com.gondue.shop.board.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BoardEntity {

    private Long boardNo;
    private String title;
    private String content;
    private String writer;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime regDate;
}
