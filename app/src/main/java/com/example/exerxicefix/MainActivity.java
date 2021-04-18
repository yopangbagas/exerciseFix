package com.example.exerxicefix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin, btnmnu;
    EditText edemail, edpassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btnsignin);
        btnmnu=findViewById(R.id.btnmnu);
        edemail=findViewById(R.id.edEmail);
        edpassword=findViewById(R.id.edpassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

                String email = "yopangbagas@mail.com";

                String pass = "123";

                if(edemail.getText().toString().equals("yopangbagas@mail.com")&& edpassword.getText().toString().equals("123")){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Succeed", Toast.LENGTH_LONG);
                    t.show();

                    Bundle b = new Bundle();

                    b.putString("a", nama.trim());

                    b.putString("b", password.trim());

                    Intent i = new Intent(getApplicationContext(), mainmenu2.class);

                    i.putExtras(b);

                    startActivity(i);



                }
                else if(!edemail.getText().toString().equals("yopangbagas@mail.com")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email Yang Anda Masukkan Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else if(!edpassword.getText().toString().equals("123")){
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Password Yang Anda Masukkan Salah", Toast.LENGTH_LONG);
                    t.show();
                }
                else {
                    Toast.makeText((getApplicationContext()),
                            "Email dan Password Anda Salah", Toast.LENGTH_LONG).show();


                }

            }
        });

        btnmnu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, mainmenu.class);
                startActivity(i);
            }
        });
    }
}

