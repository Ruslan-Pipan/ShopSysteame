package com.shop.systeme.dao.persons;

import com.shop.systeme.model.persons.Consumer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsumerRepository extends CrudRepository<Consumer, Integer> {
    List<Consumer> findAll();
    Consumer findById(int id);
    Consumer findByEmail(String email);
}
