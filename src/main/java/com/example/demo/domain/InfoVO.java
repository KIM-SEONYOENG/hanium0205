package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InfoVO {
    private long _iid;
    private String bank;
    private String acc;
    private String homepage;
    private String intro;
    private long _uid;
}
