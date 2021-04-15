package com.example.startupreview.beans;

import javax.persistence.*;

@Entity
public class Startup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long s_id;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "VARCHAR(5000)")
    private String description;
    private String launch_date;

    public Startup() {
    }

    public Startup(String name, String description, String launch_date) {
        this.name = name;
        this.description = description;
        this.launch_date = launch_date;
    }

    public Long getS_id() {
        return s_id;
    }

    public void setS_id(Long s_id) {
        this.s_id = s_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLaunch_date() {
        return launch_date;
    }

    public void setLaunch_date(String launch_date) {
        this.launch_date = launch_date;
    }
}
