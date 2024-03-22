package com.example._2024_03_18_moviefun.models;

import java.time.LocalDateTime;

public class Movie {
    private int id;
    private String title;
    private int releaseYear;
    private String description;
    private String tags;

    public Movie() {
    }

    public Movie(int id, String title, int releaseYear, String description, String tags) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.description = description;
        this.tags = tags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getYearsOld() {
        return LocalDateTime.now().getYear() - releaseYear;
    }
}
