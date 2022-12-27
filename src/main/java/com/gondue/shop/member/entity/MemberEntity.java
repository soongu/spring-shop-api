package com.gondue.shop.member.entity;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberEntity {

    private String id; // 회원 식별자

    private String email;

    private String password;

    private String userName;

    private LocalDateTime regDate;
}
