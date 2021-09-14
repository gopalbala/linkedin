package com.gb.lld.linkedin.member;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Background {
    private List<Education> educations;
    private List<Experience> experiences;
}
