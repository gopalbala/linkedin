package com.gb.lld.linkedin.member;

public interface ProfileUpdater {
    Experience addExperience(Experience experience);
    void removeExperience(String experienceId);
    Experience updateExperience(Experience experience);

    Education addEduction(Education education);
    void removeEducation(String educationId);
    Education updateEduction(Education education);

}
