package com.sl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sl.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
