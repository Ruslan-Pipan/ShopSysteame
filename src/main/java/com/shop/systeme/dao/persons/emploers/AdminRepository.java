package com.shop.systeme.dao.persons.emploers;

import com.shop.systeme.model.persons.emploers.Admin;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findById(int id);
    Admin findByEmail(String email);
}
