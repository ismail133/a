package com.example.cs15iia.app.realm.repository;
import com.example.cs15iia.app.model.Student;

import io.realm.RealmList;
import io.realm.RealmResults;
/**
 * Created by cs15iia on 19/03/2018.
 */
public interface IStudentRepository {

    interface OnSaveStudentCallback {
        void onSuccess();
        void onError(String message);
    }

    interface OnDeleteStudentCallback {
        void onSuccess();
        void onError(String message);
    }

    interface OnGetStudentByIdCallback {
        void onSuccess(Student student);
        void onError(String message);
    }

    interface OnGetAllStudentsCallback {
        void onSuccess(RealmResults<Student> students);
        void onError(String message);
    }

    interface OnGetStudentsCallback{
        void onSuccess(RealmList<Student> students);
        void onError(String message);
    }

    void addStudent(Student student, OnSaveStudentCallback callback);

    void addStudentByUniversityId(Student student, String universityId, OnSaveStudentCallback callback);

    void deleteStudentById(String id, OnDeleteStudentCallback callback);

    void deleteStudentByPosition(int position, OnDeleteStudentCallback callback);

    void getAllStudents(OnGetAllStudentsCallback callback);

    void getAllStudentsByUniversityId(String id, OnGetStudentsCallback callback);

    void getStudentById(String id, OnGetStudentByIdCallback callback);

}