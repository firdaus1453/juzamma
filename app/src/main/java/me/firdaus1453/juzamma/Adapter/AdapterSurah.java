package me.firdaus1453.juzamma.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import me.firdaus1453.juzamma.R;

public class AdapterSurah extends RecyclerView.Adapter<AdapterSurah.ViewHolder> {
    // TODO Membuat variable untuk di proses adapter
    // TODO Context untuk menyimpan Activity
    Context contex;
    // TODO Membuat variable String array untuk menampung nama dan isi surah
    String[] nama_surah,isi_surah;

    //TODO Membuat Constructor untuk dapat menerima data pada saat Adapter dibuat menjadi object
    public AdapterSurah(Context contex, String[] nama_surah, String[] isi_surah) {
        this.contex = contex;
        this.nama_surah = nama_surah;
        this.isi_surah = isi_surah;
    }

    @NonNull
    @Override
    public AdapterSurah.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // TODO membuat layout item_surah menjadi object
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_surah,viewGroup,false);
        // TODO Lalu object layout item_surah kita kirim ke class ViewHolder
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSurah.ViewHolder viewHolder, int i) {
        // TODO untuk kita menampilkan data ke tampilan widget yang kita inginkan
        viewHolder.txtNamaSurah.setText(nama_surah[i]);
        viewHolder.txtIsiSurah.setText(isi_surah[i]);
    }

    @Override
    public int getItemCount() {
        // TODO Untuk menentukan jumlah data yang ingin di tampilkan
        return nama_surah.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // TODO Membuat variable untuk menampung widget
        TextView txtNamaSurah,txtIsiSurah;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // TODO membuat object widget nama_surah
            txtNamaSurah = itemView.findViewById(R.id.txtNamaSurah);
            // TODO membuat object widget isi_surah
            txtIsiSurah = itemView.findViewById(R.id.txtIsiSurah);
        }
    }
}
