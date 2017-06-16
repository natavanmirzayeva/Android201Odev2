package com.example.deneme.android201odev2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button buton1,buton2;
    EditText edt;
    List<String> countr;
    ListView listemiz;
    Intent intent1,intent2;

    private String[] ulkeler =
            {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buton1 = (Button)findViewById(R.id.btn11);
        buton2 = (Button) findViewById(R.id.btn12);
        edt = (EditText)findViewById(R.id.txt);
         countr = new ArrayList<String>();

       // for(int j=0;j<ulkeler.length;j++)
      //  {
      //      countr.add(ulkeler[j]);
      //  }


        buton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
               String degisken = String.valueOf(edt.getText());
                countr.add(degisken);
                ListView listemizz=(ListView) findViewById(R.id.listView2);

                       ArrayAdapter<String> veriAdaptoru2=new ArrayAdapter<String>
                     (MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, countr);


                listemizz.setAdapter(veriAdaptoru2);




            }
        });

        buton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent1 = new Intent(view.getContext(),FormAcrivity.class);
                startActivity(intent1);
            }
        });

    }
}
