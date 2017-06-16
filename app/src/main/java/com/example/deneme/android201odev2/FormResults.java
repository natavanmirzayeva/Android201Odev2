package com.example.deneme.android201odev2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Deneme on 6/16/2017.
 */

public class FormResults extends AppCompatActivity{

    Intent intent;
    FormBilgileri form;
    List<String> formm;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_results);

        name = (EditText)findViewById(R.id.name);

        FormBilgileri bilgi = (FormBilgileri) getIntent().getSerializableExtra("formBilgileri");




        formm = new ArrayList<String>();
        formm.add(bilgi.getName());
       ListView listemizz=(ListView) findViewById(R.id.listView1);


        ArrayAdapter<String> veriAdaptoru2=new ArrayAdapter<String>
               (FormResults.this, android.R.layout.simple_list_item_1, android.R.id.text1, formm);


        listemizz.setAdapter(veriAdaptoru2);



    }
}
