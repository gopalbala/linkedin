package com.gb.lld.linkedin.member;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RecommendationRequest {
    private String recommender;
    private Relationship relationship;
    private String positionAtTime;
}
