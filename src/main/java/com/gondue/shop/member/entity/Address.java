package com.gondue.shop.member.entity;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @NotBlank
    private String postCode;

    @NotBlank
    private String location;
}
