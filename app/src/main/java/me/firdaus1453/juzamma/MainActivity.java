package me.firdaus1453.juzamma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnSurahPendek)
    Button btnSurahPendek;
    @BindView(R.id.btnSurahPanjang)
    Button btnSurahPanjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnSurahPendek, R.id.btnSurahPanjang})
    public void onViewClicked(View view) {
        // TODO Membuat variable global dengan tipe data Intent
        Intent intent;
        switch (view.getId()) {
            case R.id.btnSurahPendek:
                // TODO Membuat object intent
                intent = new Intent(this,RecycleSurah.class);
                // TODO Memasukkan data ke Intent
                intent.putExtra("tanda","pendek");
                // TODO Menjalankan Intent
                startActivity(intent);
                break;
            case R.id.btnSurahPanjang:
                // TODO Membuat object intent
                intent = new Intent(this,RecycleSurah.class);
                // TODO Memasukkan data ke Intent
                intent.putExtra("tanda","panjang");
                // TODO Menjalankan Intent
                startActivity(intent);
                break;
        }
    }
}
