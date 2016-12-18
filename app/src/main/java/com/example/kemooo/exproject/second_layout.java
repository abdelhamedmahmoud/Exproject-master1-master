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

    static  String desc , wood , color , dimension;
    static int kemo[] ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_layout);

        String [] DescArray= new String[]{"All pieces" , "Bed" , "nightstand" , "chest of drawer with mirror" , "wardrobe"};
        String [] DescArrayforliving= new String[]{"All pieces" , "sofa" , "3 seats" , "1 seat"};
        String [] DescArrayforchildren= new String[]{"All pieces" , "Bed" , "nightstand" , "wardrobe"};
        String [] DescArrayfordining= new String[]{"All pieces" , "Dining table" , "6 chairs" };
        String [] woodArray= new String[]{"Cedar" , "Oak" , "Beech" , "Mahogany" , "Pine"};
        String [] colorsArray= new String[]{"Black" , "Woody" , "Gray" , "off-white"};
        String [] dimnsArray= new String[]{"120 CM" , "140 CM" , "160 CM" , "180 CM"};

        Toast.makeText(this, desc, Toast.LENGTH_SHORT).show();
/////////////////////////////////////////// initialize category spinner ////////////////////////////

     if(first_layout.category.equals("Bed Rooms"))
     {
         ArrayAdapter<String> adapter = new ArrayAdapter<>(this ,android.R.layout.simple_spinner_item , DescArray);
         final Spinner sp = (Spinner)findViewById(R.id.Description);
         sp.setAdapter(adapter);
         sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                 desc=  sp.getSelectedItem().toString();
                 if(sp.getSelectedItem().toString().equals("Bed"))
                 {
                 TextView dimn = (TextView)findViewById(R.id.texture);
                 dimn.setAlpha(1);
                 final Spinner sp = (Spinner)findViewById(R.id.Dimn);
                 sp.setAlpha(1);
             }

                 else
                 {
                     TextView dimn = (TextView)findViewById(R.id.texture);
                     dimn.setAlpha(0);
                     final Spinner sp = (Spinner)findViewById(R.id.Dimn);
                     sp.setAlpha(0);
                 }
                 if(sp.getSelectedItem().toString().equals("chest of drawer with mirror"))
                 {
                     final Spinner sp = (Spinner)findViewById(R.id.Dimn);
                     sp.setPadding(20,0,0,0);
                 }
                 else
                 {
                     final Spinner sp = (Spinner)findViewById(R.id.Dimn);
                     sp.setPadding(70,0,0,0);
                 }
             }

             @Override
             public void onNothingSelected(AdapterView<?> parent) {

             }
         });
     }

       else if(first_layout.category.equals("Living Rooms"))
        {
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this ,android.R.layout.simple_spinner_item , DescArrayforliving);
            final Spinner sp = (Spinner)findViewById(R.id.Description);
            sp.setAdapter(adapter);
            sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    desc=  sp.getSelectedItem().toString();
                    if(sp.getSelectedItem().toString().equals("Bed"))
                    {
                        TextView dimn = (TextView)findViewById(R.id.texture);
                        dimn.setAlpha(1);
                        final Spinner sp = (Spinner)findViewById(R.id.Dimn);
                        sp.setAlpha(1);
                    }
                    else
                    {
                        TextView dimn = (TextView)findViewById(R.id.texture);
                        dimn.setAlpha(0);
                        final Spinner sp = (Spinner)findViewById(R.id.Dimn);
                        sp.setAlpha(0);
                    }
                    if(sp.getSelectedItem().toString().equals("chest of drawer with mirror"))
                    {
                        final Spinner sp = (Spinner)findViewById(R.id.Dimn);
                        sp.setPadding(20,0,0,0);
                    }
                    else
                    {
                        final Spinner sp = (Spinner)findViewById(R.id.Dimn);
                        sp.setPadding(70,0,0,0);
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        }

     else if(first_layout.category.equals("Dining Rooms"))
     {
         ArrayAdapter<String> adapter = new ArrayAdapter<>(this ,android.R.layout.simple_spinner_item , DescArrayfordining);
         final Spinner sp = (Spinner)findViewById(R.id.Description);
         sp.setAdapter(adapter);
         sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                 desc=  sp.getSelectedItem().toString();
                 if(sp.getSelectedItem().toString().equals("Bed"))
                 {
                     TextView dimn = (TextView)findViewById(R.id.texture);
                     dimn.setAlpha(1);
                     final Spinner sp = (Spinner)findViewById(R.id.Dimn);
                     sp.setAlpha(1);
                 }
                 else
                 {
                     TextView dimn = (TextView)findViewById(R.id.texture);
                     dimn.setAlpha(0);
                     final Spinner sp = (Spinner)findViewById(R.id.Dimn);
                     sp.setAlpha(0);
                 }
                 if(sp.getSelectedItem().toString().equals("chest of drawer with mirror"))
                 {
                     final Spinner sp = (Spinner)findViewById(R.id.Dimn);
                     sp.setPadding(20,0,0,0);
                 }
                 else
                 {
                     final Spinner sp = (Spinner)findViewById(R.id.Dimn);
                     sp.setPadding(70,0,0,0);
                 }
             }

             @Override
             public void onNothingSelected(AdapterView<?> parent) {

             }
         });
     }
     else if(first_layout.category.equals("Children Rooms"))
     {
         ArrayAdapter<String> adapter = new ArrayAdapter<>(this ,android.R.layout.simple_spinner_item , DescArrayforchildren);
         final Spinner sp = (Spinner)findViewById(R.id.Description);
         sp.setAdapter(adapter);
         sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                 desc=  sp.getSelectedItem().toString();
                 if(sp.getSelectedItem().toString().equals("Bed"))
                 {
                     TextView dimn = (TextView)findViewById(R.id.texture);
                     dimn.setAlpha(1);
                     final Spinner sp = (Spinner)findViewById(R.id.Dimn);
                     sp.setAlpha(1);
                 }
                 else
                 {
                     TextView dimn = (TextView)findViewById(R.id.texture);
                     dimn.setAlpha(0);
                     final Spinner sp = (Spinner)findViewById(R.id.Dimn);
                     sp.setAlpha(0);
                 }
                 if(sp.getSelectedItem().toString().equals("chest of drawer with mirror"))
                 {
                     final Spinner sp = (Spinner)findViewById(R.id.Dimn);
                     sp.setPadding(20,0,0,0);
                 }
                 else
                 {
                     final Spinner sp = (Spinner)findViewById(R.id.Dimn);
                     sp.setPadding(70,0,0,0);
                 }
             }

             @Override
             public void onNothingSelected(AdapterView<?> parent) {

             }
         });
     }


//
//
         ArrayAdapter<String> adapterfordims = new ArrayAdapter<>(this ,android.R.layout.simple_spinner_item , dimnsArray);
         final Spinner spfordims = (Spinner)findViewById(R.id.Dimn);
         spfordims.setAdapter(adapterfordims);
         spfordims.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                 dimension=  spfordims.getSelectedItem().toString();
             }

             @Override
             public void onNothingSelected(AdapterView<?> parent) {

             }
         });
//

////////////////////////////////////////////////////////////////////////////////////////////////////



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


/////////////////// button listener/////////////////////////////////////////////////////////////////
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
                                                Intent i = new Intent(second_layout.this , Third_layout.class);
                                                startActivity(i);
                                            }
                                        }).show();
                            }
                        }).show();
            }
        });
////////////////////////////////////////////////////////////////////////////////////////////////////



///////////////////Rooms arrays ////////////////////////////////////////////////////////////////////
        if (first_layout.category.equals("Bed Rooms")) {
            if (first_layout.price.equals("10,000 - 20,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    kemo = new int [] {R.drawable.bl101};
                }else if(first_layout.size.equals("3 * 4")){
                    kemo = new int [] {R.drawable.bl102,R.drawable.bl103,R.drawable.bl104,R.drawable.bl105,
                            R.drawable.bl106,R.drawable.bl107};
                }
                else if(first_layout.size.equals("4 * 5")){
                    kemo = new int [] {R.drawable.bl108,R.drawable.bl109,R.drawable.bl110};

                }
                else if(first_layout.size.equals("5 * 5")) {
                    CustomSwipeAdapter.textView.setText("Not found");
                }
            }
            else if(first_layout.price.equals("20,000 - 40,000")){
                if(first_layout.size.equals(2.5 * 2.5)){
                    ////piccount = 0;
                }else if(first_layout.size.equals("3 * 4")){
                    ////piccount = 2;
                }
                else if(first_layout.size.equals("4 * 5")){
                    ////piccount = 3;
                }
                else if(first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            }
            else if(first_layout.price.equals("40,000 - 60,000")){
                if(first_layout.size.equals(2.5 * 2.5)){
                    //piccount = 0;
                }else if(first_layout.size.equals("3 * 4")){
                    ////piccount = 2;
                }
                else if(first_layout.size.equals("4 * 5")){
                    ////piccount = 3;
                }
                else if(first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            }
            else if(first_layout.price.equals("more than 60,000")){

            }
            else if(first_layout.size.equals("4 * 5")){

            }
            else if(first_layout.size.equals("5 * 5")) {

            }
        }

        else if (first_layout.category.equals("Living Rooms")) {
            if (first_layout.price.equals("10,000 - 20,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    ////piccount = 1;
                }else if(first_layout.size.equals("3 * 4")){
                    ////piccount = 2;
                }
                else if(first_layout.size.equals("4 * 5")){
                    ////piccount = 3;
                }
                else if(first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            }
            else if(first_layout.price.equals("20,000 - 40,000")){
                if(first_layout.size.equals(2.5 * 2.5)){
                    ////piccount = 0;
                }else if(first_layout.size.equals("3 * 4")){
                    ////piccount = 2;
                }
                else if(first_layout.size.equals("4 * 5")){
                    ////piccount = 3;
                }
                else if(first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            }
            else if(first_layout.price.equals("40,000 - 60,000")){
                if(first_layout.size.equals(2.5 * 2.5)){
                    ////piccount = 0;
                }else if(first_layout.size.equals("3 * 4")){
                    ////piccount = 2;
                }
                else if(first_layout.size.equals("4 * 5")){
                    ////piccount = 3;
                }
                else if(first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            }
            else if(first_layout.price.equals("more than 60,000")){
                if(first_layout.size.equals(2.5 * 2.5)){
                    //piccount = 0;
                }else if(first_layout.size.equals("3 * 4")){
                    ////piccount = 2;
                }
                else if(first_layout.size.equals("4 * 5")){
                    ////piccount = 3;
                }
                else if(first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            }
        }
        else if (first_layout.category.equals("Dining Rooms")) {
            if (first_layout.price.equals("10,000 - 20,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    ////piccount = 1;


                }else if(first_layout.size.equals("3 * 4")){
                    ////piccount = 2;
                }
                else if(first_layout.size.equals("4 * 5")){
                    ////piccount = 3;
                }
                else if(first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            }
            else if(first_layout.price.equals("20,000 - 40,000")){
                if(first_layout.size.equals("3 * 3")){
                    ////piccount = 0;
                }else if(first_layout.size.equals("3 * 4")){
                    ////piccount = 2;
                }
                else if(first_layout.size.equals("4 * 5")){
                    ////piccount = 3;
                }
                else if(first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            }
            else if(first_layout.price.equals("40,000 - 60,000")){
                if(first_layout.size.equals(2.5 * 2.5)){
                    //piccount = 0;
                }else if(first_layout.size.equals("3 * 4")){
                    ////piccount = 2;
                }
                else if(first_layout.size.equals("4 * 5")){
                    ////piccount = 3;
                }
                else if(first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            }
            else if(first_layout.price.equals("more than 60,000")){
                if(first_layout.size.equals(2.5 * 2.5)){
                    //piccount = 0;
                }else if(first_layout.size.equals("3 * 4")){
                    ////piccount = 2;
                }
                else if(first_layout.size.equals("4 * 5")){
                    ////piccount = 3;
                }
                else if(first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            }
        }
        else if (first_layout.category.equals("Children Rooms")) {
            if (first_layout.price.equals("10,000 - 20,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    ////piccount = 1;
                }else if(first_layout.size.equals("3 * 4")){
                    ////piccount = 2;
                }
                else if(first_layout.size.equals("4 * 5")){
                    ////piccount = 3;
                }
                else if(first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            }
            else if(first_layout.price.equals("20,000 - 40,000")){
                if(first_layout.size.equals(2.5 * 2.5)){
                    ////piccount = 0;
                }else if(first_layout.size.equals("3 * 4")){
                    ////piccount = 2;
                }
                else if(first_layout.size.equals("4 * 5")){
                    ////piccount = 3;
                }
                else if(first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            }
            else if(first_layout.price.equals("40,000 - 60,000")){
                if(first_layout.size.equals(2.5 * 2.5)){
                    ////piccount = 0;
                }else if(first_layout.size.equals("3 * 4")){
                    ////piccount = 2;
                }
                else if(first_layout.size.equals("4 * 5")){
                    ////piccount = 3;
                }
                else if(first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            }
            else if(first_layout.price.equals("more than 60,000")){
                if(first_layout.size.equals(2.5 * 2.5)){
                    //piccount = 0;
                }else if(first_layout.size.equals("3 * 4")){
                    ////piccount = 2;
                }
                else if(first_layout.size.equals("4 * 5")){
                    ////piccount = 3;
                }
                else if(first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            }
        }
////////////////////////////////////////////////////////////////////////////////////////////////////


}
}
