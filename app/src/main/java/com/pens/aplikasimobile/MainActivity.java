package com.pens.aplikasimobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etNama;
    private TextView tvTampilNama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.et_nama);
        tvTampilNama = (TextView) findViewById(R.id.tv_tampil_nama);
    }

    public void tampilNama(View view) {
        tvTampilNama.setText("Nama anda: "+etNama.getText().toString().trim());
    }

    public void activityCalculator(View view) {
        Intent moveIntent = new Intent(MainActivity.this, Kalkulator.class);
        startActivity(moveIntent);
    }
}
