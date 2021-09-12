package com.gb.lld.linkedin.member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User {
    private String id;
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String country;
    private Account account;
    private String recentJobTitle;
    private EmploymentType employmentType;
    private Industry industry;
}
