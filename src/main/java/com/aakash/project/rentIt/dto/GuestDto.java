package com.aakash.project.rentIt.dto;

import com.aakash.project.rentIt.entity.User;
import com.aakash.project.rentIt.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
