package com.gondue.shop.board.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardPostDTO {

    @NotBlank
    @Size(min = 2, max = 20)
    private String title;
    private String content;
    @NotBlank
    private String writer;
}
