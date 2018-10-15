package me.firdaus1453.juzamma;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.firdaus1453.juzamma.Adapter.AdapterSurah;

public class RecycleSurah extends AppCompatActivity {

    @BindView(R.id.MyRecycle)
    RecyclerView MyRecycle;

    // TODO membuat variable untuk menampung data nama dan isi surah
    String[] nama_surah_pendek,nama_surah_panjang,isi_surah_pendek,isi_surah_panjang;

    // TODO membuat variable global AdapterSurah
    AdapterSurah adapterSurah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_surah);
        ButterKnife.bind(this);

        // TODO Mengisi variable dengan data yang ada pada String
        nama_surah_pendek = getResources().getStringArray(R.array.nama_surah_pendek);
        nama_surah_panjang = getResources().getStringArray(R.array.nama_surah_panjang);
        isi_surah_pendek= getResources().getStringArray(R.array.isi_surah_pendek);
        isi_surah_panjang = getResources().getStringArray(R.array.isi_surah_panjang);

        // TODO menangkap data dari Intent
        String tanda = getIntent().getStringExtra("tanda");
        Log.i("Isi tanda",tanda);
        // TODO kita cek isi data dari activity sebelumnya
        if (tanda.equals("pendek")){
            Log.i("Cek if","Masuk pendek");
            // TODO apabila dia surah pendek maka kita buat object adapter dengan data surah pendek
            adapterSurah = new AdapterSurah(RecycleSurah.this,nama_surah_pendek,isi_surah_pendek);
        } else {
            Log.i("Cek if","Masuk panjang");
            // TODO apabila dia surah pendek maka kita buat object adapter dengan data surah panjang
            adapterSurah = new AdapterSurah(RecycleSurah.this,nama_surah_panjang,isi_surah_panjang);
        }

        // TODO mensetting recycleview dan mengeset recycle adapter dengan Adaptersurah
        MyRecycle.setHasFixedSize(true);
        // TODO mengeset layoutmanager recycleview
        MyRecycle.setLayoutManager(new LinearLayoutManager(RecycleSurah.this));
        // TODO menset adapter recycleview
        MyRecycle.setAdapter(adapterSurah);
    }
}
