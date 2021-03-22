package com.shop.systeme.dao.persons.emploers;

import com.shop.systeme.model.persons.emploers.Editor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EditorRepository extends JpaRepository<Editor, Integer> {
    Editor findById(int id);
    Editor findByEmail(String email);
}
