package com.pens.aplikasimobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewExample extends AppCompatActivity {
    private ListView LvItem;
    private String[] namaneagara = new String[] {
            "Indonesia", "Malaysia", "Singapore", "Italia"
            , "Inggris", "Belanda", "Argentina", "Chile", "Mesir", "Uganda"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_example);
        getSupportActionBar().setTitle("List View Sederhana");

        LvItem = (ListView) findViewById(R.id.list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<String >(ListViewExample.this, android.R.layout.activity_list_item, android.R.id.text1, namaneagara);

        LvItem.setAdapter(adapter);

        LvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewExample.this, "Memilih : " +namaneagara[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}
