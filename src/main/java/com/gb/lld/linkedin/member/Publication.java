package com.gb.lld.linkedin.member;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Publication {
    private String id;
    private String title;
    private String publisher;
    private String publicationDate;
    private String author;
    private String url;
    private String description;
}
