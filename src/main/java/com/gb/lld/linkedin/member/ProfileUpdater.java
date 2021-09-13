package com.gb.lld.linkedin.member;

public interface ProfileUpdater {
    Experience addExperience(Experience experience);
    void removeExperience(int experienceId);
    Education addEduction(Education education);
    void removeEducation(int educationId);
}
