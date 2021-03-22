package com.shop.systeme.model.iteams;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CategoryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(name = "CAT_ITEM",
    joinColumns = {@JoinColumn(name = "cat_id")},
    inverseJoinColumns = {@JoinColumn(name = "item_id")})
    private Set<Item> items;

    public CategoryItem(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
