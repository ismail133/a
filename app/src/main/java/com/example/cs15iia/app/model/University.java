package com.example.cs15iia.app.model;
import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by cs15iia on 19/03/2018.
 */
public class University extends RealmObject {

    @PrimaryKey
    private String id;
    private String name;
    private RealmList<Student> students;

    public University() {
    }

    public University(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RealmList<Student> getStudents() {
        return students;
    }

    public void setStudents(RealmList<Student> students) {
        this.students = students;
    }

}