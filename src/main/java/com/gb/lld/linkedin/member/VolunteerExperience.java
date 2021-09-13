package com.gb.lld.linkedin.member;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class VolunteerExperience {
    private String id;
    private String organization;
    private String role;
    private String cause;
    private boolean currentlyDoing;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
}
