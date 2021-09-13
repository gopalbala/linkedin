package com.gb.lld.linkedin.member;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Company {
    private String url;
    private String website;
    private Industry industry;
    private int size;
    private CompanyType companyType;
}
