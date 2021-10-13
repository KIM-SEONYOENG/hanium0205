package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VolunteerVO {
    private long _vid;
    private int term;
    private long _uid;
    private long _lid;
}
