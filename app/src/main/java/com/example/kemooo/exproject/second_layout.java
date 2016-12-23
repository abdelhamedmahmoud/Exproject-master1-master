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
import android.widget.TextView;
import android.widget.Toast;

public class second_layout extends AppCompatActivity {

    static  String  wood , color ;
    static int kemo[] ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_layout);


        String [] woodArray= new String[]{"Cedar" , "Oak" , "Beech" , "Mahogany" , "Pine"};
        String [] colorsArray= new String[]{"Black" , "Woody" , "Gray" , "off-white"};

/////////////////////////////////////////// initialize wood spinner ////////////////////////////////
            ArrayAdapter<String> adapterforwood = new ArrayAdapter<>(this ,android.R.layout.simple_spinner_item , woodArray);
            final Spinner sp = (Spinner)findViewById(R.id.woodtype);
            sp.setAdapter(adapterforwood);
            sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    wood=  sp.getSelectedItem().toString();

                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////// initialize color spinner////////////////////////////////
        ArrayAdapter<String> adapterforcolor = new ArrayAdapter<>(this ,android.R.layout.simple_spinner_item , colorsArray);
        final Spinner spforcolor = (Spinner)findViewById(R.id.colortype);
        spforcolor.setAdapter(adapterforcolor);
        spforcolor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                color=  spforcolor.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////


/////////////////// button listener /////////////////////////////////////////////////////////////////
        Button next= (Button)findViewById(R.id.button2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alBuilder= new AlertDialog.Builder(second_layout.this);
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
                                AlertDialog.Builder aBuilder = new AlertDialog.Builder(second_layout.this);
                                aBuilder.setMessage("Data has been saved !!")
                                        .setPositiveButton("Dismiss", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                getSelectedFeatures.getFeatures();
                                                Intent i = new Intent(second_layout.this , Third_layout.class);
                                                startActivity(i);
                                            }
                                        }).show();
                            }
                        }).show();
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////


///////////////////// on Create final state /////
    }
/////////////////////////////////////////////////

///////////////// class final state ////////////
}
////////////////////////////////////////////////
