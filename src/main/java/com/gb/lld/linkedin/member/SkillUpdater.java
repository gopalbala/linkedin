package com.gb.lld.linkedin.member;

public interface SkillUpdater {
    Skill addSkill(Skill skill);
    void removeSkill(String skillId);
}
