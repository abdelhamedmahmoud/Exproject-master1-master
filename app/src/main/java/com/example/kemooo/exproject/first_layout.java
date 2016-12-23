package com.example.kemooo.exproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class first_layout extends AppCompatActivity {

   static String category , size , price ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

/////////////////////////////////////////// initialize category spinner
        String [] categoryArray= new String[]{"Bed Rooms" , "Living Rooms" , "Dining Rooms" , "Children Rooms"};


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this ,android.R.layout.simple_spinner_item , categoryArray);
        adapter = new ArrayAdapter<String>(this, R.layout.spinner_item,categoryArray);
        final Spinner sp = (Spinner)findViewById(R.id.category);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 category=  sp.getSelectedItem().toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
///////////////////////////////////////////////////////////////

        ///////////////////// initialize size spinner
        String [] SizeArray= new String[]{"3 * 3" ,"3 * 4", "4 * 5" , "5 * 5" };




        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this ,android.R.layout.simple_spinner_item , SizeArray);
        adapter1 = new ArrayAdapter<String>(this, R.layout.spinner_item,SizeArray);
        final Spinner sp1 = (Spinner)findViewById(R.id.size);
        sp1.setAdapter(adapter1);
        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                size=  sp1.getSelectedItem().toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
///////////////////////////////////////////////////////////////


        ///////////////////// initialize size spinner
        String [] priceArray= new String[]{"10,000 - 20,000" , "20,000 - 40,000" , "40,000 - 60,000" , "more than 60,000"};




        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this ,android.R.layout.simple_spinner_item , priceArray);
        adapter2 = new ArrayAdapter<String>(this, R.layout.spinner_item,priceArray);
        final Spinner sp2 = (Spinner)findViewById(R.id.price);
        sp2.setAdapter(adapter2);
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                price=  sp2.getSelectedItem().toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
///////////////////////////////////////////////////////////////


        Button next= (Button)findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alBuilder= new AlertDialog.Builder(first_layout.this);
                alBuilder.setMessage("Are you sure you want to continue with these Specification ?")
                        .setTitle("Warning")
                        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                        .setPositiveButton("YES" , new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                AlertDialog.Builder aBuilder = new AlertDialog.Builder(first_layout.this);
                                aBuilder.setMessage("Data has been saved !!")
                                        .setPositiveButton("Dismiss", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                Intent i = new Intent(first_layout.this , second_layout.class);
                                                startActivity(i);
                                            }
                                        }).show();
                            }
                        }).show();
            }
        });
    }


}
