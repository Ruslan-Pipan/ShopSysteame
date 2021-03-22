package com.shop.systeme.model.persons.emploers;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Manager extends Employer {

    @OneToMany
    private Set<Editor> editors;


    public Manager(){}

}
