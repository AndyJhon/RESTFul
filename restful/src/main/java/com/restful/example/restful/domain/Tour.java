package com.restful.example.restful.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Tour implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String title;

    @Column(length = 300)
    private String description;

    @Column(length = 300)
    private String blurb;

    private Integer price;

    private String duration;

    @Column(length = 300)
    private String bullets;

    private String keywords;

    @ManyToOne
    private TourPackage tourPackage;

    @Column
    private Difficulty difficulty;

    @Column
    private Region region;

    public Tour(String title, String description, String blurb, Integer price, String duration, String bullets, String keywords, TourPackage tourPackage, Difficulty difficulty, Region region) {
        this.title = title;
        this.description = description;
        this.blurb = blurb;
        this.price = price;
        this.duration = duration;
        this.bullets = bullets;
        this.keywords = keywords;
        this.tourPackage = tourPackage;
        this.difficulty = difficulty;
        this.region = region;
    }

    protected Tour(){

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setBullets(String bullets) {
        this.bullets = bullets;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getBlurb() {
        return blurb;
    }

    public Integer getPrice() {
        return price;
    }

    public String getDuration() {
        return duration;
    }

    public String getBullets() {
        return bullets;
    }

    public String getKeywords() {
        return keywords;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public Region getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", blurb='" + blurb + '\'' +
                ", price=" + price +
                ", duration='" + duration + '\'' +
                ", bullets='" + bullets + '\'' +
                ", keywords='" + keywords + '\'' +
                ", tourPackage=" + tourPackage +
                ", difficulty=" + difficulty +
                ", region=" + region +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tour)) return false;
        Tour tour = (Tour) o;
        return Objects.equals(getId(), tour.getId()) &&
                Objects.equals(getTitle(), tour.getTitle()) &&
                Objects.equals(getDescription(), tour.getDescription()) &&
                Objects.equals(getBlurb(), tour.getBlurb()) &&
                Objects.equals(getPrice(), tour.getPrice()) &&
                Objects.equals(getDuration(), tour.getDuration()) &&
                Objects.equals(getBullets(), tour.getBullets()) &&
                Objects.equals(getKeywords(), tour.getKeywords()) &&
                Objects.equals(getTourPackage(), tour.getTourPackage()) &&
                getDifficulty() == tour.getDifficulty() &&
                getRegion() == tour.getRegion();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getDescription(), getBlurb(), getPrice(), getDuration(), getBullets(), getKeywords(), getTourPackage(), getDifficulty(), getRegion());
    }
}
