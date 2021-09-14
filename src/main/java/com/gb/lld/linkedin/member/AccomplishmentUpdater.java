package com.gb.lld.linkedin.member;

public interface AccomplishmentUpdater {
    Publication addPublication(Publication publication);
    void removePublication(String publicationId);
    Publication updatePublication(Publication publication);

    Patent addPatent(Patent patent);
    void removePatent(String patentId);
    Patent updatePatent(Patent patent);
}
