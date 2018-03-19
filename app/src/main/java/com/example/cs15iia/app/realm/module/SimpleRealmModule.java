package com.example.cs15iia.app.realm.module;
import com.example.cs15iia.app.model.Student;
import com.example.cs15iia.app.model.University;

import io.realm.annotations.RealmModule;
/**
 * Created by cs15iia on 19/03/2018.
 */


    @RealmModule(classes = {Student.class, University.class})
    public class SimpleRealmModule {

    }
