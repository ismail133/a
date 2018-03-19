package com.example.cs15iia.app.realm.table;

/**
 * Created by cs15iia on 19/03/2018.
 */
public interface RealmTable {

    String ID = "id";

    interface University {
        String STUDENTS = "students";
        String NAME = "name";
    }

    interface Student{
        String NAME = "name";
        String AGE = "age";
        String EMAIL = "email";
        String BOOKS = "books";
        String LESSONS = "lessons";
    }
}