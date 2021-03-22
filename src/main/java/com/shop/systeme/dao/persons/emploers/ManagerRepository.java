package com.shop.systeme.dao.persons.emploers;

import com.shop.systeme.model.persons.emploers.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ManagerRepository extends JpaRepository<Manager,Integer> {
    Manager findById(int id);
    List<Manager> findAll();
}
