package com.example.cs15iia.app.presenters;

/**
 * Created by cs15iia on 19/03/2018.
 */
public interface IUniversityPresenter extends IBasePresenter {

    void addUniversity(String universityName);

    void deleteUniversity(int position);

    void deleteUniversityById(String Id);

    void getUniversityById(String id);

    void getAllUniversities();

}