package com.example.appfastfood.log_reg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.appfastfood.R;
import com.google.android.material.textfield.TextInputEditText;

public class Register extends AppCompatActivity {

    EditText user_reg,pass_reg,email_reg,phone_reg,address_reg;
    Button reg,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        addControls();
        addEvents();

    }

    private void addEvents() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register.this,Login.class);
                startActivity(intent);
            }
        });

    }

    private void addControls() {
        user_reg = (EditText) findViewById(R.id.username_reg);
        pass_reg = (EditText) findViewById(R.id.pass_reg);
        email_reg = (EditText) findViewById(R.id.email_reg);
        phone_reg = (EditText) findViewById(R.id.phone_reg);
        address_reg = (EditText) findViewById(R.id.address_reg);
        reg = (Button) findViewById(R.id.btnreg_reg);
        login = (Button) findViewById(R.id.btnlogin_reg);
    }
}