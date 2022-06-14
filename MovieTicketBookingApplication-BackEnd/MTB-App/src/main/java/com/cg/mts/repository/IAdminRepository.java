package com.cg.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.mts.model.User;

public interface IAdminRepository extends JpaRepository<User, Integer> {

}