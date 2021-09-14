package com.gb.lld.linkedin.member;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data
public class Patent {
    private String id;
    private String patentTitle;
    private String patentOffice;
    private String patentApplicationNumber;
    private boolean patentIssued;
    private LocalDate patentIssuedDate;
    private String patentUrl;
    private String description;
}
