package com.shop.systeme.model.iteams;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(nullable = false)
    private String nameItem;
    @Column(nullable = false)
    private double prise;
    @Column(nullable = true)
    private int count;

    @OneToOne
    @JoinColumn(name = "stat_id")
    private Statistic statistic;

    @ManyToMany(mappedBy = "items")
    private Set<CategoryItem> categoryItem;

    @Column(nullable = false,columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private String imgMain;

    @Column
    private String imgSecond;

    public Item(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Statistic getStatistic() {
        return statistic;
    }

    public void setStatistic(Statistic statistic) {
        this.statistic = statistic;
    }

    public Set<CategoryItem> getCategory() {
        return categoryItem;
    }

    public void setCategory(Set<CategoryItem> categoryItem) {
        this.categoryItem = categoryItem;
    }


    public Set<CategoryItem> getCategoryItem() {
        return categoryItem;
    }

    public void setCategoryItem(Set<CategoryItem> categoryItem) {
        this.categoryItem = categoryItem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgMain() {
        return imgMain;
    }

    public void setImgMain(String imgMain) {
        this.imgMain = imgMain;
    }

    public String getImgSecond() {
        return imgSecond;
    }

    public void setImgSecond(String imgSecond) {
        this.imgSecond = imgSecond;
    }

    public String getShortName(){
        if (this.nameItem.length() > 12)
            return this.nameItem.substring(0,10) + "..";
        else
            return this.nameItem;
    }

}
