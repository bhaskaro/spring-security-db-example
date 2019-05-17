package com.techprimers.security.securitydbexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.security.securitydbexample.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
