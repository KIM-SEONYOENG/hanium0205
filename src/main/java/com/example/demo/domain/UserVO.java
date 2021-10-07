package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserVO {
    public UserVO(String id) {
        this.id = id;
    }

    private long _uid;
    private String id;
    private String password;
}
