package com.gb.lld.linkedin.member;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data
public class License {
    private String id;
    private String name;
    private String issuingOrganization;
    private LocalDate issuanceDate;
    private LocalDate expiringDate;
    private String credentialId;
    private String credentialUrl;
}
