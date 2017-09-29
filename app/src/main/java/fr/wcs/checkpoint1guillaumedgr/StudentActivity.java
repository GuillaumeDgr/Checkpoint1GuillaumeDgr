package fr.wcs.checkpoint1guillaumedgr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class StudentActivity extends AppCompatActivity {

    TextView textViewName2;
    TextView textViewFirstName2;
    TextView textViewSchool2;
    TextView textViewLanguage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        // Intent
        StudentModel studentModel = getIntent().getExtras().getParcelable("studentModel");

        String name = studentModel.getName();
        String firstName = studentModel.getFirstName();
        String school = studentModel.getSchool();
        String language = studentModel.getLanguage();

        textViewName2 = (TextView) findViewById(R.id.textViewName2);
        textViewFirstName2 = (TextView) findViewById(R.id.textViewFirstName2);
        textViewSchool2 = (TextView) findViewById(R.id.textViewSchool2);
        textViewLanguage2 = (TextView) findViewById(R.id.textViewLanguage2);

        textViewName2.setText(name);
        textViewFirstName2.setText(firstName);
        textViewSchool2.setText(school);
        textViewLanguage2.setText(language);
    }
}
