package com.laoshenshi.study.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class user {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
