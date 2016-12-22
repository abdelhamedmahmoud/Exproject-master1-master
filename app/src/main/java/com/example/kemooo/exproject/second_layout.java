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
//        if (first_layout.category.equals("Bed Rooms")) {
//            if (first_layout.price.equals("10,000 - 20,000")) {
//                if (first_layout.size.equals("3 * 3")) {
//                    if (wood.equals("Mahogany")) {
//                        if (color.equals("Woody")) {
//                            kemo = new int[]{R.drawable.bl101};
//                            CustomSwipeAdapter.textView.setText(R.string.bl101_details);
//                        } else {
//                            CustomSwipeAdapter.textView.setText("Not Found");
//                        }
//                    } else {
//                        CustomSwipeAdapter.textView.setText("Not Found");
//                    }
//                } else if (first_layout.size.equals("3 * 4")) {
//                    if (wood.equals("Beech")) {
//                        if (color.equals("off-white")) {
//                            kemo = new int[]{R.drawable.bl102};
//                            CustomSwipeAdapter.textView.setText(R.string.bl102_details);
//                        } else if (color.equals("Woody")) {
//                            kemo = new int[]{R.drawable.bl103, R.drawable.bl106};
//                            CustomSwipeAdapter.textView.setText(R.string.bl103_details);//how?
//                        } else {
//                            CustomSwipeAdapter.textView.setText("Not found");
//                        }
//                    } else if (wood.equals("Pine")) {
//                        if (color.equals("off-white")) {
//                            kemo = new int[]{R.drawable.bl104, R.drawable.bl105};
//                            CustomSwipeAdapter.textView.setText(R.string.bl103_details);//how?
//                        } else if (color.equals("Woody")) {
//                            kemo = new int[]{R.drawable.bl107};
//                            CustomSwipeAdapter.textView.setText(R.string.bl103_details);
//                        } else {
//                            CustomSwipeAdapter.textView.setText("Not found");
//                        }
//                    }
//                } else if (first_layout.size.equals("4 * 5")) {
//                    if (wood.equals("Mahogany")) {
//                        if (color.equals("Black")) {
//                            kemo = new int[]{R.drawable.bl108};
//                            CustomSwipeAdapter.textView.setText(R.string.bl108_details);
//                        } else if (color.equals("off-white")) {
//                            kemo = new int[]{R.drawable.bl109, R.drawable.bl110};
//                            CustomSwipeAdapter.textView.setText(R.string.bl109_details);//how?
//                        } else {
//                            CustomSwipeAdapter.textView.setText("Not found");
//                        }
//                    } else {
//                        CustomSwipeAdapter.textView.setText("Not found");
//                    }
//                } else if (first_layout.size.equals("5 * 5")) {
//                    CustomSwipeAdapter.textView.setText("Not found");
//                }
//            } else if (first_layout.price.equals("20,000 - 40,000")) {
//                if (first_layout.size.equals("3 * 3")) {
//                    if (wood.equals("Mahogany")) {
//                        if (color.equals("Woody")) {
//                            kemo = new int[]{R.drawable.bl201};
//                            CustomSwipeAdapter.textView.setText(R.string.bl201_details);
//                        } else if (color.equals("off-white")) {
//                            kemo = new int[]{R.drawable.bl202, R.drawable.bl203};
//                            CustomSwipeAdapter.textView.setText(R.string.bl202_details);//how?
//                        } else {
//                            CustomSwipeAdapter.textView.setText("Not found");
//                        }
//                    } else {
//                        CustomSwipeAdapter.textView.setText("Not found");
//                    }
//                } else if (first_layout.size.equals("3 * 4")) {
//                    if (wood.equals("Beech")) {
//                        if (color.equals("Woody")) {
//                            kemo = new int[]{R.drawable.bl204, R.drawable.bl205};
//                            CustomSwipeAdapter.textView.setText(R.string.bl204_details);//how?
//                        } else if (color.equals("off-white")) {
//                            kemo = new int[]{R.drawable.bl206};
//                            CustomSwipeAdapter.textView.setText(R.string.bl206_details);
//                        } else {
//                            CustomSwipeAdapter.textView.setText("Not found");
//                        }
//                    } else {
//                        CustomSwipeAdapter.textView.setText("Not found");
//                    }
//                } else if (first_layout.size.equals("4 * 5")) {
//                    if (wood.equals("Oak")) {
//                        if (color.equals("off-white")) {
//                            kemo = new int[]{R.drawable.bl207};
//                            CustomSwipeAdapter.textView.setText(R.string.bl207_details);
//                        } else {
//                            CustomSwipeAdapter.textView.setText("Not found");
//                        }
//                    } else if (wood.equals("Beech")) {
//                        if (color.equals("Woody")) {
//                            kemo = new int[]{R.drawable.bl208};
//                            CustomSwipeAdapter.textView.setText(R.string.bl208_details);
//                        } else {
//                            CustomSwipeAdapter.textView.setText("Not found");
//                        }
//                    } else {
//                        CustomSwipeAdapter.textView.setText("Not found");
//                    }
//                } else if (first_layout.size.equals("5 * 5")) {
//                    if (wood.equals("Oak")) {
//                        if (color.equals("Woody")) {
//                            kemo = new int[]{R.drawable.bl209};
//                            CustomSwipeAdapter.textView.setText(R.string.bl209_details);
//                        } else {
//                            CustomSwipeAdapter.textView.setText("Not found");
//                        }
//                    } else if (wood.equals("Cedar")) {
//                        if (color.equals("Woody")) {
//                            kemo = new int[]{R.drawable.bl210};
//                            CustomSwipeAdapter.textView.setText(R.string.bl210_details);
//                        } else {
//                            CustomSwipeAdapter.textView.setText("Not found");
//                        }
//                    } else {
//                        CustomSwipeAdapter.textView.setText("Not found");
//                    }
//                }
//            } else if (first_layout.price.equals("40,000 - 60,000")) {
//                if (first_layout.size.equals("3 * 3")) {
//                    CustomSwipeAdapter.textView.setText("Not found");
//                } else if (first_layout.size.equals("3 * 4")) {
//                    if (wood.equals("Oak") && color.equals("off-white")) {
//                        kemo = new int[]{R.drawable.bl301};
//                        CustomSwipeAdapter.textView.setText(R.string.bl301_details);
//                    } else {
//                        CustomSwipeAdapter.textView.setText("Not found");
//                    }
//                } else if (first_layout.size.equals("4 * 5")) {
//                    if (wood.equals("Oak") && color.equals("Woody")) {
//                        kemo = new int[]{R.drawable.bl302};
//                        CustomSwipeAdapter.textView.setText(R.string.bl302_details);
//                    } else {
//                        CustomSwipeAdapter.textView.setText("Not found");
//                    }
//                } else if (first_layout.size.equals("5 * 5")) {
//                    if (wood.equals("Cedar") && color.equals("Woody")) {
//                        kemo = new int[]{R.drawable.bl303};
//                        CustomSwipeAdapter.textView.setText(R.string.bl303_details);
//                    } else {
//                        CustomSwipeAdapter.textView.setText("Not found");
//                    }
//                }
//            } else if (first_layout.price.equals("more than 60,000")) {
//
//                if (first_layout.size.equals("4 * 5")) {
//                    if (wood.equals("Cedar") && color.equals("Woody")) {
//                        kemo = new int[]{R.drawable.bl401};
//                        CustomSwipeAdapter.textView.setText(R.string.bl401_details);
//                    } else {
//                        CustomSwipeAdapter.textView.setText("Not found");
//                    }
//                } else if (first_layout.size.equals("5 * 5")) {
//                    if (wood.equals("Oak") && color.equals("Woody")) {
//                        kemo = new int[]{R.drawable.bl402};
//                        CustomSwipeAdapter.textView.setText(R.string.bl402_details);
//                    } else if (wood.equals("Cedar") && color.equals("Black")) {
//                        kemo = new int[]{R.drawable.bl403};
//                        CustomSwipeAdapter.textView.setText(R.string.bl403_details);
//                    } else {
//                        CustomSwipeAdapter.textView.setText("Not found");
//                    }
//                } else {
//                    CustomSwipeAdapter.textView.setText("Not found");
//                }
//            }
//        }
//        else if (first_layout.category.equals("Living Rooms")) {
//            if (first_layout.price.equals("10,000 - 20,000")) {
//                if (first_layout.size.equals("3 * 3")) {
//                    ////piccount = 1;
//                }else if(first_layout.size.equals("3 * 4")){
//                    ////piccount = 2;
//                }
//                else if(first_layout.size.equals("4 * 5")){
//                    ////piccount = 3;
//                }
//                else if(first_layout.size.equals("5 * 5")) {
//                    ////piccount = 0;
//                }
//            }
//            else if(first_layout.price.equals("20,000 - 40,000")){
//                if(first_layout.size.equals(2.5 * 2.5)){
//                    ////piccount = 0;
//                }else if(first_layout.size.equals("3 * 4")){
//                    ////piccount = 2;
//                }
//                else if(first_layout.size.equals("4 * 5")){
//                    ////piccount = 3;
//                }
//                else if(first_layout.size.equals("5 * 5")) {
//                    ////piccount = 0;
//                }
//            }
//            else if(first_layout.price.equals("40,000 - 60,000")){
//                if(first_layout.size.equals(2.5 * 2.5)){
//                    ////piccount = 0;
//                }else if(first_layout.size.equals("3 * 4")){
//                    ////piccount = 2;
//                }
//                else if(first_layout.size.equals("4 * 5")){
//                    ////piccount = 3;
//                }
//                else if(first_layout.size.equals("5 * 5")) {
//                    ////piccount = 0;
//                }
//            }
//            else if(first_layout.price.equals("more than 60,000")){
//                if(first_layout.size.equals(2.5 * 2.5)){
//                    //piccount = 0;
//                }else if(first_layout.size.equals("3 * 4")){
//                    ////piccount = 2;
//                }
//                else if(first_layout.size.equals("4 * 5")){
//                    ////piccount = 3;
//                }
//                else if(first_layout.size.equals("5 * 5")) {
//                    ////piccount = 0;
//                }
//            }
//        }
//        else if (first_layout.category.equals("Dining Rooms")) {
//            if (first_layout.price.equals("10,000 - 20,000")) {
//                if (first_layout.size.equals("3 * 3")) {
//                    ////piccount = 1;
//
//
//                }else if(first_layout.size.equals("3 * 4")){
//                    ////piccount = 2;
//                }
//                else if(first_layout.size.equals("4 * 5")){
//                    ////piccount = 3;
//                }
//                else if(first_layout.size.equals("5 * 5")) {
//                    ////piccount = 0;
//                }
//            }
//            else if(first_layout.price.equals("20,000 - 40,000")){
//                if(first_layout.size.equals("3 * 3")){
//                    ////piccount = 0;
//                }else if(first_layout.size.equals("3 * 4")){
//                    ////piccount = 2;
//                }
//                else if(first_layout.size.equals("4 * 5")){
//                    ////piccount = 3;
//                }
//                else if(first_layout.size.equals("5 * 5")) {
//                    ////piccount = 0;
//                }
//            }
//            else if(first_layout.price.equals("40,000 - 60,000")){
//                if(first_layout.size.equals(2.5 * 2.5)){
//                    //piccount = 0;
//                }else if(first_layout.size.equals("3 * 4")){
//                    ////piccount = 2;
//                }
//                else if(first_layout.size.equals("4 * 5")){
//                    ////piccount = 3;
//                }
//                else if(first_layout.size.equals("5 * 5")) {
//                    ////piccount = 0;
//                }
//            }
//            else if(first_layout.price.equals("more than 60,000")){
//                if(first_layout.size.equals(2.5 * 2.5)){
//                    //piccount = 0;
//                }else if(first_layout.size.equals("3 * 4")){
//                    ////piccount = 2;
//                }
//                else if(first_layout.size.equals("4 * 5")){
//                    ////piccount = 3;
//                }
//                else if(first_layout.size.equals("5 * 5")) {
//                    ////piccount = 0;
//                }
//            }
//        }
//        else if (first_layout.category.equals("Children Rooms")) {
//            if (first_layout.price.equals("10,000 - 20,000")) {
//                if (first_layout.size.equals("3 * 3")) {
//                    ////piccount = 1;
//                }else if(first_layout.size.equals("3 * 4")){
//                    ////piccount = 2;
//                }
//                else if(first_layout.size.equals("4 * 5")){
//                    ////piccount = 3;
//                }
//                else if(first_layout.size.equals("5 * 5")) {
//                    ////piccount = 0;
//                }
//            }
//            else if(first_layout.price.equals("20,000 - 40,000")){
//                if(first_layout.size.equals(2.5 * 2.5)){
//                    ////piccount = 0;
//                }else if(first_layout.size.equals("3 * 4")){
//                    ////piccount = 2;
//                }
//                else if(first_layout.size.equals("4 * 5")){
//                    ////piccount = 3;
//                }
//                else if(first_layout.size.equals("5 * 5")) {
//                    ////piccount = 0;
//                }
//            }
//            else if(first_layout.price.equals("40,000 - 60,000")){
//                if(first_layout.size.equals(2.5 * 2.5)){
//                    ////piccount = 0;
//                }else if(first_layout.size.equals("3 * 4")){
//                    ////piccount = 2;
//                }
//                else if(first_layout.size.equals("4 * 5")){
//                    ////piccount = 3;
//                }
//                else if(first_layout.size.equals("5 * 5")) {
//                    ////piccount = 0;
//                }
//            }
//            else if(first_layout.price.equals("more than 60,000")){
//                if(first_layout.size.equals(2.5 * 2.5)){
//                    //piccount = 0;
//                }else if(first_layout.size.equals("3 * 4")){
//                    ////piccount = 2;
//                }
//                else if(first_layout.size.equals("4 * 5")){
//                    ////piccount = 3;
//                }
//                else if(first_layout.size.equals("5 * 5")) {
//                    ////piccount = 0;
//                }
//            }
//        }
//        if(first_layout.category.equals("Bed Rooms")&& wood.equals("3 * 3")&& first_layout.price.equals("10,000 - 20,000")){
//            kemo = new int[]{R.drawable.bl201};
        }
////////////////////////////////////////////////////////////////////////////////////////////////////


}

