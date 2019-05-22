package com.example.login;

import android.provider.ContactsContract;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.PasswordAuthentication;


public class MainActivity extends AppCompatActivity {

    EditText emailEditText;
    EditText passwordEditText;
    Button loginbutton;
    Button resetbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = (EditText) findViewById(R.id.EmailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginbutton = findViewById(R.id.loginbutton);
        resetbutton = findViewById(R.id.resetbutton);

        //first method of setting an event handler
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String message = "";

                if(email.equals("student@gc.ca") && password.equals("Password")){
                    message = "Welcome";
                }
                else{
                    message = " Try Again";
                }

                View parentLayout = findViewById(android.R.id.content);
                Snackbar.make(parentLayout, message, Snackbar.LENGTH_LONG).show();
            }
        });
    }

    //this is the second option
    public void Reset(View view){
        emailEditText.setText("");
        passwordEditText.setText("");
    }

}
