package com.example.cs15iia.app.presenters;
import com.example.cs15iia.app.model.Student;

/**
 * Created by cs15iia on 19/03/2018.
 */
public interface IStudentPresenter extends IBasePresenter{

    void addStudent(Student student);

    void addStudentByUniversityId(Student student, String universityId);

    void deleteStudentByPosition(int position);

    void deleteStudentById(String studentId);

    void getAllStudents();

    void getAllStudentsByUniversityId(String id);

    void getStudentById(String id);

    void getUniversityById(String id);

}