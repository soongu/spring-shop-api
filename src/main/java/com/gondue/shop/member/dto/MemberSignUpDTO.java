package com.gondue.shop.member.dto;

import com.gondue.shop.member.entity.Address;
import com.gondue.shop.member.entity.Card;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberSignUpDTO {

    @NotBlank @Email
    private String email;

    @NotBlank
    private String password;

    @NotBlank
    @Min(2) @Max(5)
    private String userName;

    @Valid // 자바빈즈 입력값 검증
    private Address address;

    @Valid
    private List<Card> cardList;


}
