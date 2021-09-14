package com.gb.lld.linkedin.member;

import java.util.List;

public interface ProfileUpdater {
    Experience addExperience(Experience experience);
    void removeExperience(String experienceId);
    Education addEduction(Education education);
    void removeEducation(String educationId);
    License addLicense(License license);
    void removeLicense(String licenseId);
    VolunteerExperience addVolunteerExperience(VolunteerExperience volunteerExperience);
    void  removeVolunteerExperience(String volunteerExperienceId);
    Skill addSkill(Skill skill);
    void removeSkill(String skillId);
    Publication addPublication(Publication publication);
    void removePublication(String publicationId);
}
