package com.example.deneme.android201odev2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Deneme on 6/16/2017.
 */

public class FormAcrivity extends AppCompatActivity
{
    EditText name,surname;
    Button dt;
    DatePickerDialog datePickerDialog;
    Intent intent2,intent3;
    Button buton3;
    FormBilgileri formBilgileri;
    List<FormBilgileri> bilgiler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        intent2 = getIntent();

        name = (EditText)findViewById(R.id.name);
        surname = (EditText)findViewById(R.id.surname);
        dt = (Button) findViewById((R.id.date));
        buton3 = (Button)findViewById(R.id.btn13);



        dt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR);
                int mMonth = c.get(Calendar.MONTH);
                int mDay = c.get(Calendar.DAY_OF_MONTH);
                // date picker dialog
                datePickerDialog = new DatePickerDialog(FormAcrivity.this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // set day of month , month and year value in the edit text
                                dt.setText(dayOfMonth + "/"
                                        + (monthOfYear + 1) + "/" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });


        buton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                formBilgileri = new FormBilgileri(name.getText().toString(),surname.getText().toString(),dt.getText().toString());
                intent3 = new Intent(view.getContext(),Bilgiler.class);
                intent3.putExtra("formBilgileri",  formBilgileri);
                startActivity(intent3);


            }
        });






    }

}
