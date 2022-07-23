package com.example.studentform;

import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button buttonmessage;
    private TextView name,password,phone,email,gender,department;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        addListenerOnButton();
        String getName = getIntent().getStringExtra("name");
        String getPassword = getIntent().getStringExtra("password");
        String getPhone=getIntent().getStringExtra("phone");
        String getEmail=getIntent().getStringExtra("email");
        String getGender=getIntent().getStringExtra("gender");
        String getDepartment=getIntent().getStringExtra("department");
        ((TextView) findViewById(R.id.name)).setText("Name:"+getName);
        ((TextView) findViewById(R.id.password)).setText("Pasword:"+getPassword);
        ((TextView) findViewById(R.id.phone)).setText("Phone:"+getPhone);
        ((TextView) findViewById(R.id.email)).setText("Email:"+getEmail);
        ((TextView) findViewById(R.id.gender)).setText("Gender:"+getGender);
        ((TextView) findViewById(R.id.department)).setText("Department:"+getDepartment);
    }


}