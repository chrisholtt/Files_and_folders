package com.codeclan.example.week14_hw.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "person")
    @Column
    @JsonIgnoreProperties({"person"})
    private List<Folder> folders;


    public Person(){
    }

    public Person(String name) {
        this.name = name;
        this.folders = new ArrayList<>();
    }



//    Getters and setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFolders(ArrayList<Folder> files) {
        this.folders = folders;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Folder> getFolders() {
        return folders;
    }
}
