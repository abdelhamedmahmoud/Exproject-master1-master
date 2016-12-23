package com.example.kemooo.exproject;

/**
 * Created by MRABAH on 20/12/2016.
 */


public class getSelectedFeatures {

    static String roomName;
    static Boolean NotfoundState=false;


    public static void getFeatures() {
        if (first_layout.category.equals("Bed Rooms")) {
            if (first_layout.price.equals("10,000 - 20,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl101};
                            roomName=""+(R.string.bl101_details);
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl102};
                            roomName=""+R.string.bl102_details;

                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl103, R.drawable.bl106};
                            roomName=""+R.string.bl103_details;
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl104, R.drawable.bl105};
                            roomName=""+R.string.bl103_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl107};
                            roomName=""+R.string.bl103_details;
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl108};
                            roomName=""+R.string.bl108_details;

                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl109, R.drawable.bl110};
                            roomName=""+R.string.bl109_details;
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    second_layout.kemo = new int[]{R.drawable.white};
                    NotfoundState=true;
                }
            } else if (first_layout.price.equals("20,000 - 40,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl201};
                            roomName=""+R.string.bl201_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl202, R.drawable.bl203};
                            roomName=""+R.string.bl202_details;
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl204, R.drawable.bl205};
                            roomName=""+R.string.bl204_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl206};
                            roomName=""+R.string.bl206_details;
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl207};
                            roomName=""+R.string.bl207_details;
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl208};
                            roomName=""+R.string.bl208_details;
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl209};
                            roomName=""+R.string.bl209_details;

                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else if (second_layout.wood.equals("Cedar")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl210};
                            roomName=""+R.string.bl210_details;

                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                }
            } else if (first_layout.price.equals("40,000 - 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    CustomSwipeAdapter.textView.setText("Not found");
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Oak") && second_layout.color.equals("off-white")) {
                        second_layout.kemo = new int[]{R.drawable.bl301};
                        roomName=""+R.string.bl301_details;

                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Oak") && second_layout.color.equals("Woody")) {
                        second_layout.kemo = new int[]{R.drawable.bl302};
                        roomName=""+R.string.bl302_details;
                        CustomSwipeAdapter.textView.setText(R.string.bl302_details);
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Cedar") && second_layout.color.equals("Woody")) {
                        second_layout.kemo = new int[]{R.drawable.bl303};
                        roomName=""+R.string.bl303_details;
                        CustomSwipeAdapter.textView.setText(R.string.bl303_details);
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                }
            } else if (first_layout.price.equals("more than 60,000")) {

                if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Cedar") && second_layout.color.equals("Woody")) {
                        second_layout.kemo = new int[]{R.drawable.bl401};
                        roomName=""+R.string.bl401_details;

                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Oak") && second_layout.color.equals("Woody")) {
                        second_layout.kemo = new int[]{R.drawable.bl402};
                        roomName=""+R.string.bl402_details;

                    } else if (second_layout.wood.equals("Cedar") && second_layout.color.equals("Black")) {
                        second_layout.kemo = new int[]{R.drawable.bl403};
                        roomName=""+R.string.bl403_details;

                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else {
                    second_layout.kemo = new int[]{R.drawable.white};
                    NotfoundState=true;
                }
            }
        } else if (first_layout.category.equals("Living Rooms")) {
            if (first_layout.price.equals("10,000 - 20,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll101};
                            roomName=""+R.string.ll101_details;

                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll102};
                            roomName=""+R.string.ll102_details;

                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll103};
                            roomName=""+R.string.ll103_details;

                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll104};
                            roomName=""+R.string.ll104_details;

                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll105};
                            roomName=""+R.string.ll105_details;

                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    }

                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll107};
                            roomName=""+R.string.ll107_details;

                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll108};
                            roomName=""+R.string.ll108_details;

                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll106, R.drawable.ll109};
                            roomName=""+R.string.ll106_details;
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll110};
                            roomName=""+R.string.ll110_details;

                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                }
            } else if (first_layout.price.equals("20,000 - 40,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody") || second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
                            roomName=""+R.string.ll201_details;
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll203, R.drawable.ll204, R.drawable.ll205};
                            roomName=""+R.string.ll203_details;
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll206};
                            roomName=""+R.string.ll206_details;

                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll207};
                            roomName=""+R.string.ll207_details;

                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll208};
                            roomName=""+R.string.ll208_details;

                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.color.equals("off-white")) {
                        if (second_layout.wood.equals("Oak")) {
                            second_layout.kemo = new int[]{R.drawable.ll209};
                            roomName=""+R.string.ll209_details;

                        } else if (second_layout.wood.equals("Cedar")) {
                            second_layout.kemo = new int[]{R.drawable.ll210};
                            roomName=""+R.string.ll210_details;

                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                }
            } else if (first_layout.price.equals("40,000 - 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if(second_layout.wood.equals("Cedar") && second_layout.color.equals("off-white")){
                        second_layout.kemo = new int[]{R.drawable.ll301,R.drawable.ll308};
                        roomName=""+R.string.ll301_details;
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if(second_layout.wood.equals("Oak")){
                        if(second_layout.color.equals("Black")){
                            second_layout.kemo = new int[]{R.drawable.ll302};
                            roomName=""+R.string.ll302_details;

                        }else if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.ll303};
                            roomName=""+R.string.ll303_details;

                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if(second_layout.wood.equals("Oak")&& second_layout.color.equals("Woody")){
                        second_layout.kemo = new int[]{R.drawable.ll305,R.drawable.ll306,R.drawable.ll307};
                        roomName=""+R.string.ll303_details;
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if(second_layout.wood.equals("Mahogany")){
                        if(second_layout.color.equals("Black")){
                            second_layout.kemo = new int[]{R.drawable.ll304};
                            roomName=""+R.string.ll304_details;

                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    }else if(second_layout.wood.equals("Cedar" )&& second_layout.color.equals("off-white")){
                        second_layout.kemo = new int[]{R.drawable.ll309};
                        roomName=""+R.string.ll309_details;

                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                }
            } else if (first_layout.price.equals("more than 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    second_layout.kemo = new int[]{R.drawable.white};
                    NotfoundState=true;
                } else if (first_layout.size.equals("3 * 4")) {
                    if(second_layout.wood.equals("Cedar" )&& second_layout.color.equals("Woody")){
                        second_layout.kemo = new int[]{R.drawable.ll401};
                        roomName=""+R.string.ll401_details;

                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if(second_layout.wood.equals("Cedar" )&& second_layout.color.equals("Woody")){
                        second_layout.kemo = new int[]{R.drawable.ll402};
                        roomName=""+R.string.ll402_details;

                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if(second_layout.wood.equals("Cedar" )&& second_layout.color.equals("Woody")){
                        second_layout.kemo = new int[]{R.drawable.ll403,R.drawable.bl401};
                        roomName=""+R.string.ll403_details;
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                }
            }
        } else if (first_layout.category.equals("Dining Rooms")) {
            if (first_layout.price.equals("10,000 - 20,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if(second_layout.wood.equals("Pine")){
                        if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.dl101};
                            roomName=""+R.string.dl101_details;
                        }else if(second_layout.color.equals("Black")){
                            second_layout.kemo = new int[]{R.drawable.dl102};
                            roomName=""+R.string.dl102_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }

                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }


                } else if (first_layout.size.equals("3 * 4")) {
                    if(second_layout.wood.equals("Mahogany")){
                        if(second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl103};
                            roomName = "" + R.string.dl103_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    }else if(second_layout.wood.equals("Pine")){
                        if(second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl104,R.drawable.dl105,R.drawable.dl106};
                            roomName = "" + R.string.dl104_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if(second_layout.wood.equals("Pine")){
                        if(second_layout.color.equals("Black")){
                            second_layout.kemo = new int[]{R.drawable.dl107};
                            roomName = "" + R.string.dl107_details;
                        }else if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.dl108};
                            roomName = "" + R.string.dl108_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }

                } else if (first_layout.size.equals("5 * 5")) {
                    if(second_layout.wood.equals("Mahogany") && second_layout.color.equals("Woody")){
                        second_layout.kemo = new int[]{R.drawable.dl109,R.drawable.dl110};
                        roomName = "" + R.string.dl109_details;
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }

                }
            } else if (first_layout.price.equals("20,000 - 40,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if(second_layout.wood.equals("Beech") && second_layout.color.equals("off-white")){
                        second_layout.kemo = new int[]{R.drawable.dl201,R.drawable.dl201,R.drawable.dl202};
                        roomName = "" + R.string.dl201_details;
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }

                } else if (first_layout.size.equals("3 * 4")) {
                    if(second_layout.wood.equals("Beech")){
                        if(second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl203,R.drawable.dl205};
                            roomName = "" + R.string.dl203_details;
                        }else if(second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl204};
                            roomName = "" + R.string.dl204_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if(second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl206, R.drawable.dl207};
                            roomName = "" + R.string.dl206_details;
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if(second_layout.wood.equals("Beech")){
                        if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.dl208};
                            roomName = "" + R.string.dl206_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else if(second_layout.wood.equals("Beech")){
                        if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.dl209,R.drawable.dl210};
                            roomName = "" + R.string.dl209_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            } else if (first_layout.price.equals("40,000 - 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if(second_layout.wood.equals("Cedar")){
                        if(second_layout.color.equals("Black")){
                            second_layout.kemo = new int[]{R.drawable.dl301};
                            roomName = "" + R.string.dl301_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else if(second_layout.wood.equals("Oak")){
                        if(second_layout.color.equals("Woody")){
                            second_layout.kemo = new int[]{R.drawable.dl302};
                            roomName = "" + R.string.dl302_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if(second_layout.wood.equals("Oak")){
                        if(second_layout.color.equals("Gray")){
                            second_layout.kemo = new int[]{R.drawable.dl303};
                            roomName = "" + R.string.dl303_details;
                        }else if(second_layout.color.equals("Woody")){
                            second_layout.kemo = new int[]{R.drawable.dl304,R.drawable.dl305,R.drawable.dl306,R.drawable.dl307};
                            roomName = "" + R.string.dl304_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if(second_layout.wood.equals("Oak")&& second_layout.color.equals("off-white")){
                        second_layout.kemo = new int[]{R.drawable.dl308,R.drawable.dl309};
                        roomName = "" + R.string.dl308_details;
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if(second_layout.wood.equals("Oak")&& second_layout.color.equals("Woody")){
                        second_layout.kemo = new int[]{R.drawable.dl310};
                        roomName = "" + R.string.dl310_details;
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            } else if (first_layout.price.equals("more than 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    second_layout.kemo = new int[]{R.drawable.white};
                    NotfoundState = true;
                } else if (first_layout.size.equals("3 * 4")) {
                    if(second_layout.wood.equals("Cedar")){
                        if(second_layout.color.equals("Woody")){
                            second_layout.kemo = new int[]{R.drawable.dl401,R.drawable.dl402,R.drawable.dl403};
                            roomName = "" + R.string.dl403_details;
                        }else if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.dl405,R.drawable.dl404};
                            roomName = "" + R.string.dl405_details;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if(second_layout.wood.equals("Cedar")&& second_layout.color.equals("Woody")){
                        second_layout.kemo = new int[]{R.drawable.dl406,R.drawable.dl407,R.drawable.dl408};
                        roomName = "" + R.string.dl406_details;
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if(second_layout.wood.equals("Cedar")){
                        if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.dl409};
                            roomName = "" + R.string.dl409_details;
                        }else if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.dl410};
                            roomName = "" + R.string.dl410_details;

                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            }
        } else if (first_layout.category.equals("Children Rooms")) {
            if (first_layout.price.equals("10,000 - 20,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if(second_layout.wood.equals("Pine")){
                        if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.cl101,R.drawable.cl102};
                            roomName = "" + R.string.cl101_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if(second_layout.wood.equals("Mahogany")){
                        if(second_layout.color.equals("Black")){
                            second_layout.kemo = new int[]{R.drawable.cl103};
                            roomName = "" + R.string.cl103_details;
                        }else if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.cl104};
                            roomName = "" + R.string.cl104_details;

                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if(second_layout.wood.equals("Pine") && second_layout.color.equals("Woody")){
                        second_layout.kemo = new int[]{R.drawable.cl105,R.drawable.cl106};
                        roomName = "" + R.string.cl105_details;
                    }else if(second_layout.wood.equals("Mahogany") && second_layout.color.equals("off-white")){
                        second_layout.kemo = new int[]{R.drawable.cl107,R.drawable.cl108,R.drawable.cl109};
                        roomName = "" + R.string.cl107_details;
                    }
                    else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if(second_layout.wood.equals("Pine") && second_layout.color.equals("off-white")){
                        second_layout.kemo = new int[]{R.drawable.cl110};
                        roomName = "" + R.string.cl110_details;
                    }
                    else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            } else if (first_layout.price.equals("20,000 - 40,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if(second_layout.wood.equals("Beech")){
                        if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.cl201,R.drawable.cl202,R.drawable.cl203};
                            roomName = "" + R.string.cl201_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if(second_layout.wood.equals("Mahogany")){
                        if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.cl204};
                            roomName = "" + R.string.cl204_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else if(second_layout.wood.equals("Beech")){
                        if(second_layout.color.equals("Woody")){
                            second_layout.kemo = new int[]{R.drawable.cl205};
                            roomName = "" + R.string.cl205_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }

                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if(second_layout.wood.equals("Mahogany") && second_layout.color.equals("Woody")){
                        second_layout.kemo = new int[]{R.drawable.cl206,R.drawable.cl207,R.drawable.cl208};
                        roomName = "" + R.string.cl206_details;
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if(second_layout.wood.equals("Beech")){
                        if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.cl209};
                            roomName = "" + R.string.cl209_details;
                        }else if(second_layout.color.equals("Woody")){
                            second_layout.kemo = new int[]{R.drawable.cl210};
                            roomName = "" + R.string.cl210_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            } else if (first_layout.price.equals("40,000 - 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if(second_layout.wood.equals("Oak")){
                        if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.cl301};
                            roomName = "" + R.string.cl301_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else if(second_layout.wood.equals("Cedar")){
                        if(second_layout.color.equals("Woody")){
                            second_layout.kemo = new int[]{R.drawable.cl302};
                            roomName = "" + R.string.cl302_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if(second_layout.wood.equals("Oak")&& second_layout.color.equals("Woody")){
                        second_layout.kemo = new int[]{R.drawable.cl303,R.drawable.cl304,R.drawable.cl305};
                        roomName = "" + R.string.cl303_details;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if(second_layout.wood.equals("Mahogany")){
                        if(second_layout.color.equals("Black")){
                            second_layout.kemo = new int[]{R.drawable.cl306};
                            roomName = "" + R.string.cl306_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else if(second_layout.wood.equals("Cedar")){
                        if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.cl307};
                            roomName = "" + R.string.cl307_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if(second_layout.wood.equals("Oak")){
                        if(second_layout.color.equals("Woody")){
                            second_layout.kemo = new int[]{R.drawable.cl308,R.drawable.cl309};
                            roomName = "" + R.string.cl308_details;

                        }else if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.cl310};
                            roomName = "" + R.string.cl310_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            } else if (first_layout.price.equals("more than 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if(second_layout.wood.equals("Cedar") && second_layout.color.equals("Woody")){
                        second_layout.kemo = new int[]{R.drawable.cl401,R.drawable.cl402};
                        roomName = "" + R.string.cl401_details;
                    }else if(second_layout.wood.equals("Cedar") && second_layout.color.equals("off-white")){
                        second_layout.kemo = new int[]{R.drawable.cl403};
                        roomName = "" + R.string.cl403_details;
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if(second_layout.wood.equals("Cedar")){
                        if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.cl404,R.drawable.cl407};
                            roomName = "" + R.string.cl404_details;
                        }else if(second_layout.color.equals("Woody")){
                            second_layout.kemo = new int[]{R.drawable.cl405,R.drawable.cl406};
                            roomName = "" + R.string.cl404_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if(second_layout.wood.equals("Cedar")){
                        if(second_layout.color.equals("off-white")){
                            second_layout.kemo = new int[]{R.drawable.cl409};
                            roomName = "" + R.string.cl409_details;
                        }else if(second_layout.color.equals("Woody")){
                            second_layout.kemo = new int[]{R.drawable.cl408};
                            roomName = "" + R.string.cl408_details;
                        }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if(second_layout.wood.equals("Cedar")&& second_layout.color.equals("off-white")){
                        second_layout.kemo = new int[]{R.drawable.cl410};
                        roomName = "" + R.string.cl410_details;
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            }
        }
    }
}
//
//
//
//
