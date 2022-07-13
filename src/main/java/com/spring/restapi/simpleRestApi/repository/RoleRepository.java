package com.spring.restapi.simpleRestApi.repository;

import com.spring.restapi.simpleRestApi.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    public Role findByName(String name);
}
