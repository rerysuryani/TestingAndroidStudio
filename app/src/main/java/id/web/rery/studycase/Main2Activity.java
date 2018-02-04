package id.web.rery.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
TextView mtempat;
TextView mmenu;
TextView mjumlah;
TextView mharga;
private final int uang = 65000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mtempat = findViewById(R.id.layout2_Eatbus);
        mmenu = findViewById(R.id.Menu);
        mjumlah = findViewById(R.id.Porsi);
        mharga = findViewById(R.id.Harga);

        Intent intent = getIntent();

        String tempat = intent.getStringExtra("tempat");
        String menu = intent.getStringExtra("menu");
        String jumlah = intent.getStringExtra("jumlah");
        String harga = intent.getStringExtra("harga");

        int totalHarga = Integer.valueOf(harga) * Integer.valueOf(jumlah);

        mtempat.setText(tempat);
        mmenu.setText(menu);
        mjumlah.setText(jumlah);
        mharga.setText(String.valueOf(harga));

        if (totalHarga <= uang) {
            Toast.makeText(Main2Activity.this, "Disini saja makan malamnya", Toast.LENGTH_LONG).show();
        }else {
    Toast.makeText(Main2Activity.this, "Jangan makan disini, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
            }
        }
    }
