package com.shop.systeme.model.persons.emploers;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Chief extends Employer{

    @OneToMany
    private Set<Manager> managers;
}
