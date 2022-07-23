package com.example.studentform;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText editTextName, editTextPassword, editTextPhone, editTextEmail, editTextGender, editTextDepartment;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        editTextName = findViewById(R.id.name_etext);
        editTextPassword = findViewById(R.id.password);
        editTextPhone = findViewById(R.id.phone);
        editTextEmail = findViewById(R.id.email);
        editTextGender = findViewById(R.id.gender);
        editTextDepartment = findViewById(R.id.department);
        buttonLogin = findViewById(R.id.button);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputName = editTextName.getText().toString();
                String inputPassword = editTextPassword.getText().toString();
                String inputPhone = editTextPhone.getText().toString();
                String inputEmail = editTextEmail.getText().toString();
                String inputGender = editTextGender.getText().toString();
                String inputDepartment = editTextDepartment.getText().toString();
//                if(!inputName.equals("")){
//                    if (!inputPassword.equals("")){
//                        if (!inputPhone.equals("")){
//                            if (!inputEmail.equals("")){
//                                if(!inputGender.equals("")){
//                                    if (!inputDepartment.equals("")){
//                                        if(inputName.equals(Constants.name)){
//                                            if (inputPassword.equals(Constants.password)){
//                                                if (inputEmail.equals(Constants.email)){
//                                                    Toast.makeText(LoginActivity.this, "Successfully Login", Toast.LENGTH_SHORT).show();
//                                                    Intent myIntent = new Intent(LoginActivity.this, StudentActivity.class);
////                                                    myIntent.putExtra("name", inputName);
////                                                    myIntent.putExtra("password", inputPassword);
////                                                    myIntent.putExtra("phone",inputPhone);
////                                                    myIntent.putExtra("email",inputEmail);
////                                                    myIntent.putExtra("gender",inputGender);
////                                                    myIntent.putExtra("department",inputDepartment);
//
//                                                    startActivity(myIntent);
//
//                                                }
//                                                else {
//                                                    Toast.makeText(LoginActivity.this, "Email is Incorrect", Toast.LENGTH_SHORT).show();
//                                                }
//                                            }
//                                            else {
//                                                Toast.makeText(LoginActivity.this, "Password is Incorrect", Toast.LENGTH_SHORT).show();
//                                            }
//                                        }
//                                        else {
//                                            Toast.makeText(LoginActivity.this, "User Name is Incorrect", Toast.LENGTH_SHORT).show();
//                                        }
//                                    }
//                                    else {
//                                        Toast.makeText(LoginActivity.this, "Department Field is Empty", Toast.LENGTH_SHORT).show();
//                                    }
//                                }
//                                else {
//                                    Toast.makeText(LoginActivity.this, "Gender Field is Empty", Toast.LENGTH_SHORT).show();
//                                }
//                            }
//                            else {
//                                Toast.makeText(LoginActivity.this, "Email Field is Empty", Toast.LENGTH_SHORT).show();
//                            }
//                        }
//                        else {
//                            Toast.makeText(LoginActivity.this, "Phone Field is Empty", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                    else {
//                        Toast.makeText(LoginActivity.this, "Password is Empty", Toast.LENGTH_SHORT).show();
//                    }
//                }
//                else{
//                    Toast.makeText(LoginActivity.this, "User Name is Empty", Toast.LENGTH_SHORT).show();
//                }
                Intent myIntent = new Intent(LoginActivity.this, StudentActivity.class);
                startActivity(myIntent);
            }
        });
    }
//    void initDialog(){
//        AlertDialog.Builder alertDialog=new AlertDialog.Builder(this);
//        alertDialog.setTitle("Login")
//                .setMessage("Do you want to Login?")
//                .setPositiveButton("Ye")
//
//
//    }
}