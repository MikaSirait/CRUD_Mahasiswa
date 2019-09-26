package com.proteintracker.crud_mahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Kelola_Mahasiswa extends AppCompatActivity {
    String[] items={"Brayen Chanzezar Saroinsong","Arnold Stanley Rivaldy Tato",
            "Verina Kristanti Wiyono","Yubelince Naomi Wakum","Hendry Masikun","Baskoro Adi Wicaksono",
            "Yos Rafel Kristanto","Alfadeo Melody Jeremy Bulin","Yashinta Novita Dewi","Yalina Hosea",
            "Adrian Paskalis","Desta Siwi","Cindy Claudya","Angkie Octovaldo Elias Wangkay",
            "Christian Dorra","Tita Marita Simangunsong","Angga Dwi Kaharap","Fransiska Ayu Gloria",
            "Mika Havennia Sirait","Marni Eva Kristina Saragih","Aristyo Rahadian Agung Nugroho",
            "Laurentia Yulia Cristi","Putu Abdi Setiawan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelola__mahasiswa);

        android.widget.ListView lv = (ListView)findViewById(R.id.lvKelola);
        // Spinner spinner = findViewById(R.id.mSpinner);
        Button btnAdd3 = (Button)findViewById(R.id.btnAdd3);
        btnAdd3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Kelola_Mahasiswa.this,AddActivity.class);
                startActivity(i);
            }
        });

        Button btnEdit3 = (Button)findViewById(R.id.btnEdit3);
        btnEdit3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(Kelola_Mahasiswa.this,EditActivity.class);
                startActivity(i);
            }
        });

        lv.setAdapter(new ArrayAdapter<String>(Kelola_Mahasiswa.this, android.R.layout.simple_list_item_1,items));
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);

        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //   spinner.setAdapter(aa);

//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainKelolaActivity.this, "anda memilih" + items[position],Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                Toast.makeText(MainKelolaActivity.this,"anda memilih", Toast.LENGTH_SHORT).show();
//            }
//        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Kelola_Mahasiswa.this,"anda memilih = "+ items[position],Toast.LENGTH_LONG).show();  //toast utk pop up message
            }
        });

    }
}

