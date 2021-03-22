package com.shop.systeme.dao.persons.emploers;

import com.shop.systeme.model.persons.emploers.Chief;
import org.springframework.data.repository.CrudRepository;

public interface ChiefRepository extends CrudRepository<Chief, Integer> {
    Chief findById(int id);
    Chief findByEmail(String email);
}
