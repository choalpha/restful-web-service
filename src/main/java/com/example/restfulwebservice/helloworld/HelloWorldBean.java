package com.example.restfulwebservice.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   // getter, setter
@AllArgsConstructor // 모든 멤버변수 포함 생성자
@NoArgsConstructor  // 기본 생성자
public class HelloWorldBean {
    private String message;
}
