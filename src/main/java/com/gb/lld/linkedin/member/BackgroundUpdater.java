package com.gb.lld.linkedin.member;

public interface BackgroundUpdater {
    Experience addExperience(Experience experience);
    void removeExperience(String experienceId);
    Experience updateExperience(Experience experience);

    Education addEduction(Education education);
    void removeEducation(String educationId);
    Education updateEduction(Education education);

    License addLicense(License license);
    void removeLicense(String licenseId);
    License updateLicense(License license);

    VolunteerExperience addVolunteerExperience(VolunteerExperience volunteerExperience);
    void  removeVolunteerExperience(String volunteerExperienceId);
    VolunteerExperience updateVolunteerExperience(VolunteerExperience volunteerExperience);
}
