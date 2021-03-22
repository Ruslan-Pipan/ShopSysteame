package com.shop.systeme.model.persons.emploers;

import com.shop.systeme.model.persons.Consumer;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Admin extends Employer{

    @OneToMany
    private Set<Consumer> consumers;
}
