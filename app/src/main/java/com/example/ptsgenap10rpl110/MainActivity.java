 package com.example.ptsgenap10rpl110;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    EditText loginemail, loginpassword;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginemail =(EditText)findViewById(R.id.loginemail);
        loginpassword =(EditText)findViewById(R.id.loginpassword);
        login = (Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = loginemail.getText().toString();
                String password =  loginpassword.getText().toString();
                if (email.equalsIgnoreCase("dzufarino@gmail.com")
                        && password.equalsIgnoreCase("depinganteng")){
                    Toast.makeText(MainActivity.this, "Sukses login", Toast.LENGTH_SHORT).show();
                    Intent move = new Intent(MainActivity.this, menuutama.class);
                    startActivity(move);
                }else {
                    Toast.makeText(MainActivity.this, "Gagal login", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}