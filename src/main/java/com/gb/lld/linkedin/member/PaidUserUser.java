package com.gb.lld.linkedin.member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaidUserUser extends User implements ProfileUpdater, BackgroundUpdater,
        SkillUpdater, RecommendationRequester  {

    @Override
    public License addLicense(License license) {
        return null;
    }

    @Override
    public void removeLicense(String licenseId) {

    }

    @Override
    public License updateLicense(License license) {
        return null;
    }

    @Override
    public VolunteerExperience addVolunteerExperience(VolunteerExperience volunteerExperience) {
        return null;
    }

    @Override
    public void removeVolunteerExperience(String volunteerExperienceId) {

    }

    @Override
    public VolunteerExperience updateVolunteerExperience(VolunteerExperience volunteerExperience) {
        return null;
    }

    @Override
    public Experience addExperience(Experience experience) {
        return null;
    }

    @Override
    public void removeExperience(String experienceId) {

    }

    @Override
    public Experience updateExperience(Experience experience) {
        return null;
    }

    @Override
    public Education addEduction(Education education) {
        return null;
    }

    @Override
    public void removeEducation(String educationId) {

    }

    @Override
    public Education updateEduction(Education education) {
        return null;
    }

    @Override
    public RecommendationRequest request(RecommendationRequest recommendationRequest) {
        return null;
    }

    @Override
    public Skill addSkill(Skill skill) {
        return null;
    }

    @Override
    public void removeSkill(String skillId) {

    }

    @Override
    public Skill updateSkill(Skill skill) {
        return null;
    }
}
