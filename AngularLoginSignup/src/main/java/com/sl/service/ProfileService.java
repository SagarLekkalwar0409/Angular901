package com.sl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sl.dto.ProfileDTO;
import com.sl.entity.Profile;
import com.sl.repository.ProfileRepository;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public Profile saveProfile(ProfileDTO profileDTO) {
        Profile profile = new Profile();
        profile.setName(profileDTO.getName());
        profile.setEmployeeCode(profileDTO.getEmployeeCode());
        profile.setDepartment(profileDTO.getDepartment());
        profile.setJoiningDate(profileDTO.getJoiningDate());
        profile.setLocation(profileDTO.getLocation());
        profile.setManager(profileDTO.getManager());
        profile.setSalary(profileDTO.getSalary());
        profile.setEpfNo(profileDTO.getEpfNo());
        profile.setUan(profileDTO.getUan());
        profile.setPanNumber(profileDTO.getPanNumber());
        profile.setAadharNumber(profileDTO.getAadharNumber());
        profile.setBranch(profileDTO.getBranch());
        profile.setGrade(profileDTO.getGrade());
        profile.setDesignation(profileDTO.getDesignation());
        profile.setEmployeeCategory(profileDTO.getEmployeeCategory());
        profile.setProjectType(profileDTO.getProjectType());
        return profileRepository.save(profile);
    }
}
