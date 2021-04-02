package com.example.goapproni.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.goapproni.R;


public class LoginActivity extends AppCompatActivity {

    Button login;
    EditText username,password;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);



        setContentView(R.layout.login_relative);

        login = (Button) findViewById(R.id.btnlogin);
        username = (EditText) findViewById(R.id.etUsername);
        password = (EditText) findViewById(R.id.etPassword);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (password.getText().toString().toUpperCase().equals("RONI")){


                    login_sukses();
                }else{
                    Toast.makeText(getApplicationContext(), "salah password", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }

    private void login_sukses() {
        String user_login = username.getText().toString();
        Intent i = new Intent(this,MainActivity.class);
        // kirimkan username ke tampilan utama
        i.putExtra("USERNAME", user_login);
        startActivity(i);
    }
}
