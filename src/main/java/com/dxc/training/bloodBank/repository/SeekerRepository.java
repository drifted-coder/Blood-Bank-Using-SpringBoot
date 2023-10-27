package com.dxc.training.bloodBank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dxc.training.bloodBank.model.BloodBank;
import com.dxc.training.bloodBank.model.Seeker;

public interface SeekerRepository extends JpaRepository<Seeker, Long> {

	@Query(value = "SELECT * FROM seeker WHERE email = :email and password= :password", nativeQuery = true)
	BloodBank seekerLogin(String email,String password);
}
