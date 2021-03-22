package com.shop.systeme.model.persons.emploers;

import com.shop.systeme.model.persons.Person;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Employer extends Person {
    @OneToMany
    @Column(nullable = true)
    private Set<Task> taskSet;
    @Column(nullable = false)
    private double Salary;

    public Set<Task> getTaskSet() {
        return taskSet;
    }

    public void setTaskSet(Set<Task> taskSet) {
        this.taskSet = taskSet;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
