package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private Integer id;
    private String user_name;
    private String name;
    private Short gender;
    private String create_time;
    private String update_time;
}
