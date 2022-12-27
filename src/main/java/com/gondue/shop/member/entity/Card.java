package com.gondue.shop.member.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.YearMonth;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    @NotBlank
    @Size(min = 12, max = 12)
    private String no; // 카드 번호

    @NotBlank
    @JsonFormat(pattern = "yyyy-MM")
    @Future // 미래 날짜인지 검사
    private YearMonth yearMonth; // 유효기간
}
