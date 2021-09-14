package com.gb.lld.linkedin.member;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Award {
    private String id;
    private String title;
    private String associatedWith;
    private String issuer;
    private LocalDate issuedDate;
    private String description;
}
