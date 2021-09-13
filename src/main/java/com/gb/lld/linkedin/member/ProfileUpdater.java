package com.gb.lld.linkedin.member;

import java.util.List;

public interface ProfileUpdater {
    Experience addExperience(Experience experience);
    void removeExperience(String experienceId);
    Education addEduction(Education education);
    void removeEducation(String educationId);
    License addLicense(License license);
    void removeLicense(String licenseId);
}
