package com.sl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sl.dto.ProfileDTO;
import com.sl.entity.Profile;
import com.sl.service.ProfileService;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {
    @Autowired
    private ProfileService profileService;

    @PostMapping
    public ResponseEntity<Profile> createProfile(@RequestBody ProfileDTO profileDTO) {
        Profile savedProfile = profileService.saveProfile(profileDTO);
        return ResponseEntity.ok(savedProfile);
    }
}