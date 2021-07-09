package com.panyukovnn.gradlebasics.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class SubprojectoneUser {

    private String name;
    private LocalDate birthday;
}
