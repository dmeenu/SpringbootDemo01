package com.sample.springbootdemo01;

import lombok.Data;

@Data
public class UserDetails {

    private String userId;
    private String userName;
    private String firstName;
    private String lastName;
    private Long age;
}
