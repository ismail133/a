package com.example.cs15iia.app.realm.repository;
import com.example.cs15iia.app.model.University;

import io.realm.RealmResults;
/**
 * Created by cs15iia on 19/03/2018.
 */
public interface IUniversityRepository extends IBaseRepository {

    interface OnAddUniversityCallback {
        void onSuccess();
        void onError(String message);
    }

    interface OnGetAllUniversityCallback {
        void onSuccess(RealmResults<University> universities);
        void onError(String message);
    }

    interface OnGetUniversityByIdCallback {
        void onSuccess(University university);
        void onError(String message);
    }

    interface OnDeleteUniversityCallback {
        void onSuccess();
        void onError(String message);
    }

    void addUniversity(University university, OnAddUniversityCallback callback);

    void deleteUniversityById(String Id, OnDeleteUniversityCallback callback);

    void deleteUniversityByPosition(int position, OnDeleteUniversityCallback callback);

    void getAllUniversities(OnGetAllUniversityCallback callback);

    void getUniversityById(String id, OnGetUniversityByIdCallback callback);
}