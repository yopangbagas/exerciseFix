package com.example.exerxicefix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;



public class mainmenu extends AppCompatActivity {
    EditText usr, email, alamat, pwd,repwd;
    Button btnrgs, btnbatal;
    CheckBox jenisklm, agama;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        usr = findViewById(R.id.Rusr);
        email = findViewById(R.id.Remail);
        alamat = findViewById(R.id.alamat);
        repwd = findViewById(R.id.pass1);
        pwd = findViewById(R.id.pass);
        btnrgs = findViewById(R.id.btnregis);
        btnbatal = findViewById(R.id.btnbatal);
        jenisklm = findViewById(R.id.ceklk);
        jenisklm = findViewById(R.id.cekpr);
        agama = findViewById(R.id.chkislam);
        agama = findViewById(R.id.ckkristen);
        agama = findViewById(R.id.ckbudha);
        agama = findViewById(R.id.chkshindu);

        btnrgs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usr.getText().toString().isEmpty() ||
                        email.getText().toString().isEmpty() ||
                        alamat.getText().toString().isEmpty() ||
                        pwd.getText().toString().isEmpty() ||
                        repwd.getText().toString().isEmpty() ||
                        jenisklm.getText().toString().isEmpty()||
                        agama.getText().toString().isEmpty())
                {
                    usr.setError("Masukkan Nama");
                    email.setError("Masukkan Email");
                    alamat.setError("Masukkan Alamat");
                    repwd.setError("Masukkan Re-Password");
                    pwd.setError("Masukkan Password");
                }
                else
                {
                    if (pwd.getText().toString().equals(repwd.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(), "registration is successful",
                                Toast.LENGTH_LONG).show();
                        Intent i =new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }

                }
            }
        });
        btnbatal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
}

