package com.sparta.springmemoproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;
@Getter
@AllArgsConstructor

// 메모 요청 Dto
public class MemoRequestDto {
    private String title;
    private String pwd;
    private String contents;
    private String userName;
}
