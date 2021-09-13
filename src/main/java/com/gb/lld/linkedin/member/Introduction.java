package com.gb.lld.linkedin.member;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Introduction {
    private String introText;
    private String currentPosition;
    private String eduction;
    private String country;
    private String location;
    private Industry industry;
    private String contactInfo;
}
