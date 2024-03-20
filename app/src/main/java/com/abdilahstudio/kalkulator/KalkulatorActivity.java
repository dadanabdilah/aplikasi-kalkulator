package com.abdilahstudio.kalkulator;

import static androidx.core.view.ViewCompat.setBackground;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
    }

    public void jumlah (View v){
        EditText angka_awal = (EditText) findViewById(R.id.angka_awal);
        EditText angka_akhir = (EditText) findViewById(R.id.angka_akhir);

        int jumlah = new Integer(angka_awal.getText().toString()).intValue() + new Integer(angka_akhir.getText().toString());
        TextView hasil = (TextView) findViewById(R.id.hasil);
        hasil.setText("Hasil : " + String.valueOf(jumlah));
    }

    public void kurang (View v){
        EditText angka_awal = (EditText) findViewById(R.id.angka_awal);
        EditText angka_akhir = (EditText) findViewById(R.id.angka_akhir);

        int jumlah = new Integer(angka_awal.getText().toString()).intValue() - new Integer(angka_akhir.getText().toString());
        TextView hasil = (TextView) findViewById(R.id.hasil);
        hasil.setText("Hasil : " + String.valueOf(jumlah));
    }

    public void kali (View v){
        EditText angka_awal = (EditText) findViewById(R.id.angka_awal);
        EditText angka_akhir = (EditText) findViewById(R.id.angka_akhir);

        int jumlah = new Integer(angka_awal.getText().toString()).intValue() * new Integer(angka_akhir.getText().toString());
        TextView hasil = (TextView) findViewById(R.id.hasil);
        hasil.setText("Hasil : " + String.valueOf(jumlah));
    }

    public void bagi (View v){
        EditText angka_awal = (EditText) findViewById(R.id.angka_awal);
        EditText angka_akhir = (EditText) findViewById(R.id.angka_akhir);

        int jumlah = new Integer(angka_awal.getText().toString()).intValue() / new Integer(angka_akhir.getText().toString());
        TextView hasil = (TextView) findViewById(R.id.hasil);
        hasil.setText("Hasil : " + String.valueOf(jumlah));
    }
}