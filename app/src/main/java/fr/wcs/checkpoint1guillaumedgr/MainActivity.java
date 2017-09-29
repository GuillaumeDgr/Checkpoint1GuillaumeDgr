package fr.wcs.checkpoint1guillaumedgr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textViewName;
    TextView textViewFirstName;
    TextView textViewSchool;
    TextView textViewLanguage;
    Button butSend;
    String nameContent;
    String firstNameContent;
    String schoolContent;
    String languageContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butSend = (Button) findViewById(R.id.butSend);
        textViewName = (TextView) findViewById(R.id.textViewName);
        textViewFirstName = (TextView) findViewById(R.id.textViewFirstName);
        textViewSchool = (TextView) findViewById(R.id.textViewSchool);
        textViewLanguage = (TextView) findViewById(R.id.textViewLanguage);

        butSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameContent = textViewName.getText().toString();
                firstNameContent = textViewFirstName.getText().toString();
                schoolContent = textViewSchool.getText().toString();
                languageContent = textViewLanguage.getText().toString();

                if ((nameContent.equals("")) || (firstNameContent.equals("")) || (schoolContent.equals("")) || (languageContent.equals(""))) {
                    Toast.makeText(MainActivity.this, "Please fill all information", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(getApplicationContext(), StudentActivity.class);
                    StudentModel studentModel = new StudentModel(nameContent, firstNameContent, schoolContent, languageContent);
                    intent.putExtra("studentModel", studentModel);
                    startActivity(intent);
                }
            }
        });
    }
}
