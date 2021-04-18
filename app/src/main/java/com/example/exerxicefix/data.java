package com.example.exerxicefix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class data extends AppCompatActivity {

    TextView nama1, nomor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        nama1 = findViewById(R.id.tvNamaKontak);
        nomor = findViewById(R.id.tvNomorTelpon);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Inayah":
                nama1.setText("ANA A");
                nomor.setText("082222222221");
                break;
            case "Ilham":
                nama1.setText("ANI I");
               nomor.setText("082222222222");
                break;
            case "Eris":
                nama1.setText("ANU U");
                nomor.setText("082222222223");
                break;
            case "Fikri":
                nama1.setText("ANE E");
                nomor.setText("082222222224");
                break;
            case "Maul":
                nama1.setText("ANO O");
                nomor.setText("082222222225");
                break;
            case "Intan":
                nama1.setText("ANA A");
                nomor.setText("082222222221");
                break;
            case "Vina":
                nama1.setText("ANI I");
                nomor.setText("082222222222");
                break;
            case "Gita":
                nama1.setText("ANU U");
                nomor.setText("082222222223");
                break;
            case "Vian":
                nama1.setText("ANE E");
                nomor.setText("082222222224");
                break;
            case "Luthfi":
                nama1.setText("ANO O");
                nomor.setText("082222222225");
                break;
        }
    }
}