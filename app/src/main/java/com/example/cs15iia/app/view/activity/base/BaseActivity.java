package com.example.cs15iia.app.view.activity.base;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by cs15iia on 19/03/2018.
 */
public abstract class BaseActivity extends AppCompatActivity {

    abstract protected void initComponents();

    public void showMessage(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

}