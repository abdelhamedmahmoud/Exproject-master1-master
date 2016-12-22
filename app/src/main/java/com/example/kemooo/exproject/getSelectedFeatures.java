package com.example.kemooo.exproject;

/**
 * Created by MRABAH on 20/12/2016.
 */

public class getSelectedFeatures {
    public static void getFeatures() {
        if (first_layout.category.equals("Bed Rooms")) {
            if (first_layout.price.equals("10,000 - 20,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl101};
                            CustomSwipeAdapter.textView.setText(R.string.bl101_details);
                        } else {
                            CustomSwipeAdapter.textView.setText("Not Found");
                        }
                    } else {
                        CustomSwipeAdapter.textView.setText("Not Found");
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl102};
                            CustomSwipeAdapter.textView.setText(R.string.bl102_details);
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl103, R.drawable.bl106};
                            CustomSwipeAdapter.textView.setText(R.string.bl103_details);//how?
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    } else if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl104, R.drawable.bl105};
                            CustomSwipeAdapter.textView.setText(R.string.bl103_details);//how?
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl107};
                            CustomSwipeAdapter.textView.setText(R.string.bl103_details);
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl108};
                            CustomSwipeAdapter.textView.setText(R.string.bl108_details);
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl109, R.drawable.bl110};
                            CustomSwipeAdapter.textView.setText(R.string.bl109_details);//how?
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    } else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    CustomSwipeAdapter.textView.setText("Not found");
                }
            } else if (first_layout.price.equals("20,000 - 40,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl201};
                            CustomSwipeAdapter.textView.setText(R.string.bl201_details);
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl202, R.drawable.bl203};
                            CustomSwipeAdapter.textView.setText(R.string.bl202_details);//how?
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    } else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl204, R.drawable.bl205};
                            CustomSwipeAdapter.textView.setText(R.string.bl204_details);//how?
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl206};
                            CustomSwipeAdapter.textView.setText(R.string.bl206_details);
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    } else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl207};
                            CustomSwipeAdapter.textView.setText(R.string.bl207_details);
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    } else if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl208};
                            CustomSwipeAdapter.textView.setText(R.string.bl208_details);
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    } else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl209};
                            CustomSwipeAdapter.textView.setText(R.string.bl209_details);
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    } else if (second_layout.wood.equals("Cedar")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl210};
                            CustomSwipeAdapter.textView.setText(R.string.bl210_details);
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    } else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                }
            } else if (first_layout.price.equals("40,000 - 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    CustomSwipeAdapter.textView.setText("Not found");
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Oak") && second_layout.color.equals("off-white")) {
                        second_layout.kemo = new int[]{R.drawable.bl301};
                        CustomSwipeAdapter.textView.setText(R.string.bl301_details);
                    } else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Oak") && second_layout.color.equals("Woody")) {
                        second_layout.kemo = new int[]{R.drawable.bl302};
                        CustomSwipeAdapter.textView.setText(R.string.bl302_details);
                    } else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Cedar") && second_layout.color.equals("Woody")) {
                        second_layout.kemo = new int[]{R.drawable.bl303};
                        CustomSwipeAdapter.textView.setText(R.string.bl303_details);
                    } else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                }
            } else if (first_layout.price.equals("more than 60,000")) {

                if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Cedar") && second_layout.color.equals("Woody")) {
                        second_layout.kemo = new int[]{R.drawable.bl401};
                        CustomSwipeAdapter.textView.setText(R.string.bl401_details);
                    } else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Oak") && second_layout.color.equals("Woody")) {
                        second_layout.kemo = new int[]{R.drawable.bl402};
                        CustomSwipeAdapter.textView.setText(R.string.bl402_details);
                    } else if (second_layout.wood.equals("Cedar") && second_layout.color.equals("Black")) {
                        second_layout.kemo = new int[]{R.drawable.bl403};
                        CustomSwipeAdapter.textView.setText(R.string.bl403_details);
                    } else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                } else {
                    CustomSwipeAdapter.textView.setText("Not found");
                }
            }
        } else if (first_layout.category.equals("Living Rooms")) {
            if (first_layout.price.equals("10,000 - 20,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll101};
                            CustomSwipeAdapter.textView.setText(R.string.ll101_details);
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll102};
                            CustomSwipeAdapter.textView.setText(R.string.ll102_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll103};
                            CustomSwipeAdapter.textView.setText(R.string.ll103_details);
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll104};
                            CustomSwipeAdapter.textView.setText(R.string.ll104_details);
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll105};
                            CustomSwipeAdapter.textView.setText(R.string.ll105_details);
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    }

                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll107};
                            CustomSwipeAdapter.textView.setText(R.string.ll107_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll108};
                            CustomSwipeAdapter.textView.setText(R.string.ll108_details);
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    } else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll106, R.drawable.ll109};
                            CustomSwipeAdapter.textView.setText(R.string.ll106_details);//how??
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    } else if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll110};
                            CustomSwipeAdapter.textView.setText(R.string.ll110_details);
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    } else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                }
            } else if (first_layout.price.equals("20,000 - 40,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody") || second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
                            CustomSwipeAdapter.textView.setText(R.string.ll201_details);//how?
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll203, R.drawable.ll204, R.drawable.ll205};
                            CustomSwipeAdapter.textView.setText(R.string.ll203_details);//how?
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    } else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll206};
                            CustomSwipeAdapter.textView.setText(R.string.ll206_details);
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll207};
                            CustomSwipeAdapter.textView.setText(R.string.ll207_details);
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll208};
                            CustomSwipeAdapter.textView.setText(R.string.ll208_details);
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    } else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.color.equals("off-white")) {
                        if (second_layout.wood.equals("Oak")) {
                            second_layout.kemo = new int[]{R.drawable.ll209};
                            CustomSwipeAdapter.textView.setText(R.string.ll209_details);
                        } else if (second_layout.wood.equals("Cedar")) {
                            second_layout.kemo = new int[]{R.drawable.ll210};
                            CustomSwipeAdapter.textView.setText(R.string.ll210_details);
                        } else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    } else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                }
            } else if (first_layout.price.equals("40,000 - 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if(second_layout.wood.equals("Cedar") && second_layout.color.equals("off-white")){
                        second_layout.kemo = new int[]{R.drawable.ll301,R.drawable.ll308};
                        CustomSwipeAdapter.textView.setText(R.string.ll301_details);//how?
                    }else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if(second_layout.wood.equals("Oak")){
                        if(second_layout.color.equals("Black")){
                            second_layout.kemo = new int[]{R.drawable.ll302};
                            CustomSwipeAdapter.textView.setText(R.string.ll302_details);
                        }else if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.ll303};
                            CustomSwipeAdapter.textView.setText(R.string.ll303_details);
                        }else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if(second_layout.wood.equals("Oak")&& second_layout.color.equals("Woody")){
                        second_layout.kemo = new int[]{R.drawable.ll305,R.drawable.ll306,R.drawable.ll307};
                        CustomSwipeAdapter.textView.setText(R.string.ll303_details);//how?
                    }else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if(second_layout.wood.equals("Mahogany")){
                        if(second_layout.color.equals("Black")){
                            second_layout.kemo = new int[]{R.drawable.ll304};
                            CustomSwipeAdapter.textView.setText(R.string.ll304_details);
                        }else {
                            CustomSwipeAdapter.textView.setText("Not found");
                        }
                    }else if(second_layout.wood.equals("Cedar" )&& second_layout.color.equals("off-white")){
                        second_layout.kemo = new int[]{R.drawable.ll309};
                        CustomSwipeAdapter.textView.setText(R.string.ll309_details);
                    }else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                }
            } else if (first_layout.price.equals("more than 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    CustomSwipeAdapter.textView.setText("Not found");
                } else if (first_layout.size.equals("3 * 4")) {
                    if(second_layout.wood.equals("Cedar" )&& second_layout.color.equals("Woody")){
                        second_layout.kemo = new int[]{R.drawable.ll401};
                        CustomSwipeAdapter.textView.setText(R.string.ll401_details);
                    }else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if(second_layout.wood.equals("Cedar" )&& second_layout.color.equals("Woody")){
                        second_layout.kemo = new int[]{R.drawable.ll402};
                        CustomSwipeAdapter.textView.setText(R.string.ll402_details);
                    }else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if(second_layout.wood.equals("Cedar" )&& second_layout.color.equals("Woody")){
                        second_layout.kemo = new int[]{R.drawable.ll403,R.drawable.bl401};
                        CustomSwipeAdapter.textView.setText(R.string.ll403_details);//how?
                    }else {
                        CustomSwipeAdapter.textView.setText("Not found");
                    }
                }
            }
        } else if (first_layout.category.equals("Dining Rooms")) {
            if (first_layout.price.equals("10,000 - 20,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    ////piccount = 1;


                } else if (first_layout.size.equals("3 * 4")) {
                    ////piccount = 2;
                } else if (first_layout.size.equals("4 * 5")) {
                    ////piccount = 3;
                } else if (first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            } else if (first_layout.price.equals("20,000 - 40,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    ////piccount = 0;
                } else if (first_layout.size.equals("3 * 4")) {
                    ////piccount = 2;
                } else if (first_layout.size.equals("4 * 5")) {
                    ////piccount = 3;
                } else if (first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            } else if (first_layout.price.equals("40,000 - 60,000")) {
                if (first_layout.size.equals(2.5 * 2.5)) {
                    //piccount = 0;
                } else if (first_layout.size.equals("3 * 4")) {
                    ////piccount = 2;
                } else if (first_layout.size.equals("4 * 5")) {
                    ////piccount = 3;
                } else if (first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            } else if (first_layout.price.equals("more than 60,000")) {
                if (first_layout.size.equals(2.5 * 2.5)) {
                    //piccount = 0;
                } else if (first_layout.size.equals("3 * 4")) {
                    ////piccount = 2;
                } else if (first_layout.size.equals("4 * 5")) {
                    ////piccount = 3;
                } else if (first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            }
        } else if (first_layout.category.equals("Children Rooms")) {
            if (first_layout.price.equals("10,000 - 20,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    ////piccount = 1;
                } else if (first_layout.size.equals("3 * 4")) {
                    ////piccount = 2;
                } else if (first_layout.size.equals("4 * 5")) {
                    ////piccount = 3;
                } else if (first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            } else if (first_layout.price.equals("20,000 - 40,000")) {
                if (first_layout.size.equals(2.5 * 2.5)) {
                    ////piccount = 0;
                } else if (first_layout.size.equals("3 * 4")) {
                    ////piccount = 2;
                } else if (first_layout.size.equals("4 * 5")) {
                    ////piccount = 3;
                } else if (first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            } else if (first_layout.price.equals("40,000 - 60,000")) {
                if (first_layout.size.equals(2.5 * 2.5)) {
                    ////piccount = 0;
                } else if (first_layout.size.equals("3 * 4")) {
                    ////piccount = 2;
                } else if (first_layout.size.equals("4 * 5")) {
                    ////piccount = 3;
                } else if (first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            } else if (first_layout.price.equals("more than 60,000")) {
                if (first_layout.size.equals(2.5 * 2.5)) {
                    //piccount = 0;
                } else if (first_layout.size.equals("3 * 4")) {
                    ////piccount = 2;
                } else if (first_layout.size.equals("4 * 5")) {
                    ////piccount = 3;
                } else if (first_layout.size.equals("5 * 5")) {
                    ////piccount = 0;
                }
            }
        }
    }
}




