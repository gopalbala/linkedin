package com.gb.lld.linkedin.member;

public interface BackgroundUpdater {
    Experience addExperience(Experience experience);
    void removeExperience(String experienceId);
    Education addEduction(Education education);
    void removeEducation(String educationId);
    License addLicense(License license);
    void removeLicense(String licenseId);
    VolunteerExperience addVolunteerExperience(VolunteerExperience volunteerExperience);
    void  removeVolunteerExperience(String volunteerExperienceId);
}
