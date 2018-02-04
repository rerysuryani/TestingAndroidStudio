package id.web.rery.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mMenu, mPorsi;
    private Button mEatbus, mAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMenu = (EditText) findViewById(R.id.edittext_Menu);
        mPorsi = (EditText) findViewById(R.id.edittext_Jumlah);
        mEatbus = (Button) findViewById(R.id.button_Eatbus);
        mAbnormal = (Button) findViewById(R.id.button_Abnormal);

        mEatbus.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           Intent lanjut = new Intent(MainActivity.this, Main2Activity.class);
                                           lanjut.putExtra("tempat", "Eatbus");
                                           lanjut.putExtra("menu", mMenu.getText().toString());
                                           lanjut.putExtra("porsi", mPorsi.getText().toString());
                                           lanjut.putExtra("harga", "50000");
                                           startActivity(lanjut);
                                       }
                                   }
        );

        mAbnormal.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent lanjut = new Intent(MainActivity.this, Main2Activity.class);
                                             lanjut.putExtra("tempat", "Abnormal");
                                             lanjut.putExtra("menu", mMenu.getText().toString());
                                             lanjut.putExtra("porsi", mPorsi.getText().toString());
                                             lanjut.putExtra("harga", "50000");
                                             startActivity(lanjut);
                                         }
                                     }
        );
    }
}