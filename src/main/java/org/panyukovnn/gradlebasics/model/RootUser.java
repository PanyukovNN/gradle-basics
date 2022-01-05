package org.panyukovnn.gradlebasics.model;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class RootUser {

    private final String name;
    private final LocalDate birthday;
}
