package com.gb.lld.linkedin.member;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Experience {
    private String title;
    private EmploymentType employmentType;
    private String companyName;
    private String location;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isPresentCompany;
    private String headline;
    private Industry industry;
    private String description;
}
