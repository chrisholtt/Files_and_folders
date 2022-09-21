package com.codeclan.example.week14_hw.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

@OneToMany(mappedBy = "folder")
@JsonIgnoreProperties({"folder"})
    @Column(name = "files")
    private List<File> files;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Folder(){
    }

    public Folder(String title, Person person) {
        this.title = title;
        this.files = new ArrayList<>();
        this.person = person;
    }





}
