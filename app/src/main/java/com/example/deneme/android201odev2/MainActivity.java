package com.example.deneme.android201odev2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button buton1,buton2;
    EditText edt;
    List<String> countr;
    ListView listemiz;
    Intent intent1,intent2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buton1 = (Button)findViewById(R.id.btn11);

        edt = (EditText)findViewById(R.id.txt);
         countr = new ArrayList<String>();
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);

        setSupportActionBar(myToolbar);

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


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.form:
                intent1 = new Intent(this,FormAcrivity.class);
                startActivity(intent1);
                return true;

            case R.id.bilgiler:
                intent2 = new Intent(this,Bilgiler.class);
                startActivity(intent2);
                return true;

            default:

                return super.onOptionsItemSelected(item);

        }
    }


}
