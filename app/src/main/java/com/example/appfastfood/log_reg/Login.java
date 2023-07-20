package com.example.appfastfood.log_reg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appfastfood.AppFastFood;
import com.example.appfastfood.R;
import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity {

    TextInputEditText user,pass;
    Button forget,login,register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        addControls();
        addEvents();
    }

    private void addControls() {
        user = (TextInputEditText) findViewById(R.id.user_Log);
        pass = (TextInputEditText) findViewById(R.id.pass_Log);
        forget = (Button) findViewById(R.id.forget_log);
        login = (Button) findViewById(R.id.login_log);
        register = (Button) findViewById(R.id.reg_log);
    }

    private void addEvents() {
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, AppFastFood.class);
                startActivity(intent);
            }
        });
    }
}