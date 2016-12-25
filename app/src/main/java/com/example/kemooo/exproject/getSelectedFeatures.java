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
                            second_layout.kemo = new int[]{R.drawable.bl101,R.drawable.bl111};
                            roomName=""+(R.string.bl101_details);
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl125};
                            roomName=""+(R.string.bl125_details);
                        }else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl132};
                            roomName=""+(R.string.bl132_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl118};
                            roomName=""+(R.string.bl118_details);
                        }
                    }else if(second_layout.wood.equals("Pine")){
                        if(second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl112};
                            roomName=""+(R.string.bl101_details);
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl126};
                            roomName=""+(R.string.bl126_details);
                        }else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl133};
                            roomName=""+(R.string.bl133_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl119};
                            roomName=""+(R.string.bl119_details);
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl102,R.drawable.bl134};
                            roomName=""+R.string.bl134_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl103, R.drawable.bl106,R.drawable.bl113};
                            roomName=""+R.string.bl113_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl127};
                            roomName=""+(R.string.bl127_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl120};
                            roomName=""+(R.string.bl120_details);
                        }
                    } else if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl104, R.drawable.bl105,R.drawable.bl135};
                            roomName=""+R.string.bl135_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl107,R.drawable.bl114};
                            roomName=""+R.string.bl114_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl128};
                            roomName=""+(R.string.bl128_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl121};
                            roomName=""+(R.string.bl121_details);
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl108,R.drawable.bl122};
                            roomName=""+R.string.bl122_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl109, R.drawable.bl110,R.drawable.bl136};
                            roomName=""+R.string.bl109_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl129};
                            roomName=""+(R.string.bl129_details);
                        }else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl115};
                            roomName=""+(R.string.bl115_details);
                        }
                    }else if(second_layout.wood.equals("Pine")){
                        if(second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl116};
                            roomName=""+(R.string.bl116_details);
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl130};
                            roomName=""+(R.string.bl130_details);
                        }else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl137};
                            roomName=""+R.string.bl137_details;
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl123};
                            roomName=""+R.string.bl123_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl108};
                            roomName=""+R.string.bl108_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl109, R.drawable.bl138};
                            roomName=""+R.string.bl109_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl131};
                            roomName=""+(R.string.bl131_details);
                        }else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl117};
                            roomName=""+(R.string.bl117_details);
                        }
                    }else if(second_layout.wood.equals("Pine")){
                        if(second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl107};
                            roomName=""+(R.string.bl107_details);
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl110};
                            roomName=""+(R.string.bl110_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl124};
                            roomName=""+(R.string.bl124_details);
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                }
            } else if (first_layout.price.equals("20,000 - 40,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl201,R.drawable.bl211};
                            roomName=""+R.string.bl201_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl202, R.drawable.bl232};
                            roomName=""+R.string.bl202_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl225};
                            roomName=""+(R.string.bl225_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl218};
                            roomName=""+(R.string.bl218_details);
                        }
                    }else if(second_layout.wood.equals("Beech")){
                        if(second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl212};
                            roomName=""+(R.string.bl212_details);
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl226};
                            roomName=""+(R.string.bl226_details);
                        }else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{ R.drawable.bl233};
                            roomName=""+R.string.bl233_details;
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl219};
                            roomName=""+(R.string.bl219_details);
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl204, R.drawable.bl205,R.drawable.bl213};
                            roomName=""+R.string.bl204_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl206,R.drawable.bl234};
                            roomName=""+R.string.bl206_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl220};
                            roomName=""+(R.string.bl220_details);
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl227};
                            roomName=""+(R.string.bl227_details);
                        }
                    }else if(second_layout.wood.equals("Mahogany")){
                        if(second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl114};
                            roomName=""+(R.string.bl114_details);
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl228};
                            roomName=""+(R.string.bl228_details);
                        }else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl235};
                            roomName=""+(R.string.bl235_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl221};
                            roomName=""+(R.string.bl221_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl207,R.drawable.bl236};
                            roomName=""+R.string.bl236_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl229};
                            roomName=""+(R.string.bl229_details);
                        }else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl215};
                            roomName=""+(R.string.bl214_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl222};
                            roomName=""+(R.string.bl222_details);
                        }
                    } else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl208,R.drawable.bl216};
                            roomName=""+R.string.bl216_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl230};
                            roomName=""+(R.string.bl230_details);
                        }else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl237};
                            roomName=""+(R.string.bl237_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl223};
                            roomName=""+(R.string.bl223_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl209,R.drawable.bl217};
                            roomName=""+R.string.bl209_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl238};
                            roomName=""+(R.string.bl238_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl224};
                            roomName=""+(R.string.bl224_details);
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl231};
                            roomName=""+(R.string.bl231_details);
                        }
                    } else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl210};
                            roomName=""+R.string.bl210_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                }
            } else if (first_layout.price.equals("40,000 - 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl311};
                            roomName=""+R.string.bl311_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl332};
                            roomName=""+(R.string.bl332_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl318};
                            roomName=""+(R.string.bl318_details);
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl325};
                            roomName=""+(R.string.bl325_details);
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl312};
                            roomName=""+R.string.bl312_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl333};
                            roomName=""+(R.string.bl333_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl319};
                            roomName=""+(R.string.bl319_details);
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl326};
                            roomName=""+(R.string.bl326_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Beech")) {
                        if(second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl301,R.drawable.bl334};
                            roomName = "" + R.string.bl334_details;
                        }else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl313};
                            roomName=""+(R.string.bl313_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl320};
                            roomName=""+(R.string.bl320_details);
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl327};
                            roomName=""+(R.string.bl327_details);
                        }
                    }else if (second_layout.wood.equals("Oak")) {
                        if(second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl335};
                            roomName = "" + R.string.bl335_details;
                        }else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl314};
                            roomName=""+(R.string.bl314_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl321};
                            roomName=""+(R.string.bl320_details);
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl328};
                            roomName=""+(R.string.bl328_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl302,R.drawable.bl336};
                            roomName=""+R.string.bl336_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl329};
                            roomName=""+(R.string.bl329_details);
                        }else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl315};
                            roomName=""+(R.string.bl315_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl322};
                            roomName=""+(R.string.bl322_details);
                        }
                    } else if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl337};
                            roomName=""+R.string.bl336_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl330};
                            roomName=""+(R.string.bl329_details);
                        }else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl316};
                            roomName=""+(R.string.bl314_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl323};
                            roomName=""+(R.string.bl322_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl317};
                            roomName=""+R.string.bl317_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl338};
                            roomName=""+(R.string.bl338_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl324};
                            roomName=""+(R.string.bl324_details);
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl331};
                            roomName=""+(R.string.bl331_details);
                        }
                    }else if (second_layout.wood.equals("Oak")) {
                        if(second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                }
            } else if (first_layout.price.equals("more than 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl411};
                            roomName=""+R.string.bl411_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl432};
                            roomName=""+(R.string.bl432_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl418};
                            roomName=""+(R.string.bl418_details);
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl425};
                            roomName=""+(R.string.bl425_details);
                        }
                    } else if (second_layout.wood.equals("Cedar")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl412};
                            roomName=""+R.string.bl412_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl433};
                            roomName=""+(R.string.bl433_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl419};
                            roomName=""+(R.string.bl419_details);
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl426};
                            roomName=""+(R.string.bl426_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Cedar")) {
                        if(second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl434};
                            roomName = "" + R.string.bl434_details;
                        }else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl413};
                            roomName=""+(R.string.bl413_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl420};
                            roomName=""+(R.string.bl420_details);
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl427};
                            roomName=""+(R.string.bl427_details);
                    }else if (second_layout.wood.equals("Oak")) {
                            if(second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.bl435};
                                roomName = "" + R.string.bl435_details;
                            }else if (second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.bl414};
                                roomName=""+(R.string.bl414_details);
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.bl421};
                                roomName=""+(R.string.bl420_details);
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.bl428};
                                roomName=""+(R.string.bl428_details);
                            }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                }else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Cedar")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl402,R.drawable.bl435};
                            roomName=""+R.string.bl436_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl428};
                            roomName=""+(R.string.bl429_details);
                        }else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl415};
                            roomName=""+(R.string.bl415_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl421};
                            roomName=""+(R.string.bl422_details);
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl416};
                            roomName=""+R.string.bl416_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl435};
                            roomName=""+(R.string.bl435_details);
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Cedar")) {
                        if(second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl402};
                            roomName = "" + R.string.bl402_details;
                        }else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }else if (second_layout.color.equals("Black")) {
                           second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if(second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl403};
                            roomName = "" + R.string.bl403_details;
                        }else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }else if (second_layout.color.equals("Gray")) {
                         second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
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
                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.bl101};
//                            roomName=""+(R.string.bl101_details);
                        }
                    }else if (second_layout.wood.equals("Mahogany")) {
                        if(second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.bl403};
//                            roomName = "" + R.string.bl403_details;
                        }else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.bl101};
//                            roomName=""+(R.string.bl101_details);
                        }else if (second_layout.color.equals("off-white")) {
//                            second_layout.kemo = new int[]{R.drawable.bl101};
//                            roomName=""+(R.string.bl101_details);
                        }else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.bl101};
//                            roomName=""+(R.string.bl101_details);
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll104};
                            roomName=""+R.string.ll104_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll105};
                            roomName=""+R.string.ll105_details;
                        }else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.bl101};
//                            roomName=""+(R.string.bl101_details);
                        }else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.bl101};
//                            roomName=""+(R.string.bl101_details);
                        }
                    }else if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("off-white")) {
//                            second_layout.kemo = new int[]{R.drawable.ll101};
//                            roomName=""+R.string.ll101_details;

                        } else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll102};
//                            roomName = "" + R.string.ll102_details;

                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll103};
//                            roomName = "" + R.string.ll103_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.bl101};
//                            roomName=""+(R.string.bl101_details);
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll107};
                            roomName=""+R.string.ll107_details;

                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll108};
                            roomName=""+R.string.ll108_details;

                        } else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll103};
//                            roomName = "" + R.string.ll103_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.bl101};
//                            roomName=""+(R.string.bl101_details);
                        }
                    }else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll107};
                            roomName = "" + R.string.ll107_details;

                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll108};
                            roomName = "" + R.string.ll108_details;

                        } else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll103};
//                            roomName = "" + R.string.ll103_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.bl101};
//                            roomName=""+(R.string.bl101_details);
                        }
                    }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll106, R.drawable.ll109};
                            roomName=""+R.string.ll106_details;
                        } else if (second_layout.color.equals("off-white")) {
//                            second_layout.kemo = new int[]{R.drawable.ll108};
//                            roomName = "" + R.string.ll108_details;

                        } else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll103};
//                            roomName = "" + R.string.ll103_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.bl101};
//                            roomName=""+(R.string.bl101_details);
                        }
                    } else if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll110};
                            roomName=""+R.string.ll110_details;

                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll108};
//                            roomName = "" + R.string.ll108_details;

                        } else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll103};
//                            roomName = "" + R.string.ll103_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.bl101};
//                            roomName=""+(R.string.bl101_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                }
            } else if (first_layout.price.equals("20,000 - 40,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
                            roomName = "" + R.string.ll201_details;
                        } else if (second_layout.color.equals("off-white")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        }
                    }else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName = "" + R.string.ll201_details;
                        } else if (second_layout.color.equals("off-white")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        }
                    } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState=true;
                        }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll203, R.drawable.ll204, R.drawable.ll205};
                            roomName=""+R.string.ll203_details;
                        } else if (second_layout.color.equals("off-white")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        }
                    }else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName = "" + R.string.ll201_details;
                        } else if (second_layout.color.equals("off-white")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
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

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        }
                    }else if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName = "" + R.string.ll201_details;
                        } else if (second_layout.color.equals("off-white")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll209};
                            roomName = "" + R.string.ll209_details;

                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;

                        } else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        }
                    }else if (second_layout.wood.equals("Beech")) {
                        if(second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll210};
                            roomName = "" + R.string.ll210_details;
                        }else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;

                        } else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                }
            } else if (first_layout.price.equals("40,000 - 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if(second_layout.wood.equals("Beech")){
                        if(second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll301, R.drawable.ll308};
                            roomName = "" + R.string.ll301_details;
                        }else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;

                        } else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        }
                    }else if(second_layout.wood.equals("Oak")){
                        if(second_layout.color.equals("off-white")) {
//                            second_layout.kemo = new int[]{R.drawable.ll301, R.drawable.ll308};
//                            roomName = "" + R.string.ll301_details;
                        }else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;

                        } else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        }
                    } else {
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

                        }else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        }
                    }else if(second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("off-white")) {
//                            second_layout.kemo = new int[]{R.drawable.ll301, R.drawable.ll308};
//                            roomName = "" + R.string.ll301_details;
                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;

                        } else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if(second_layout.wood.equals("Oak")){
                        if(second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll305, R.drawable.ll306, R.drawable.ll307};
                            roomName = "" + R.string.ll305_details;
                        }else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;
                        } else if (second_layout.color.equals("off-white")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;
                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        }
                    }else if(second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("off-white")) {
//                            second_layout.kemo = new int[]{R.drawable.ll301, R.drawable.ll308};
//                            roomName = "" + R.string.ll301_details;
                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;
                        } else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;
                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if(second_layout.wood.equals("Beech")){
                        if(second_layout.color.equals("Black")){
                            second_layout.kemo = new int[]{R.drawable.ll304};
                            roomName=""+R.string.ll304_details;
                        } else if (second_layout.color.equals("off-white")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;

                        } else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        }
                    }else if(second_layout.wood.equals("Oak" )){
                        if(second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll309};
                            roomName = "" + R.string.ll309_details;
                        }else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;

                        } else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                }
            } else if (first_layout.price.equals("more than 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll309};
                            roomName = "" + R.string.ll309_details;
                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;

                        } else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                        }
                    }else if(second_layout.wood.equals("Cedar")){
                    if (second_layout.color.equals("off-white")) {
//                        second_layout.kemo = new int[]{R.drawable.ll309};
//                        roomName = "" + R.string.ll309_details;
                    } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;

                    } else if (second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;

                    } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll202};
//                            roomName=""+R.string.ll201_details;
                    }
                }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
            } else if (first_layout.size.equals("3 * 4")) {
                    if(second_layout.wood.equals("Cedar" )){
                        if(second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll401};
                            roomName = "" + R.string.ll401_details;
                        }else if (second_layout.color.equals("off-white")) {
//                        second_layout.kemo = new int[]{R.drawable.ll309};
//                        roomName = "" + R.string.ll309_details;
                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;
                        }
                    }else if(second_layout.wood.equals("Oak" )){
                        if(second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll401};
//                            roomName = "" + R.string.ll401_details;
                        }else if (second_layout.color.equals("off-white")) {
//                        second_layout.kemo = new int[]{R.drawable.ll309};
//                        roomName = "" + R.string.ll309_details;
                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if(second_layout.wood.equals("Cedar" )){
                        if(second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll402};
                            roomName = "" + R.string.ll402_details;
                        }else if (second_layout.color.equals("off-white")) {
//                        second_layout.kemo = new int[]{R.drawable.ll309};
//                        roomName = "" + R.string.ll309_details;
                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;
                        }
                    }else if(second_layout.wood.equals("Oak" )){
                        if(second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll401};
//                            roomName = "" + R.string.ll401_details;
                        }else if (second_layout.color.equals("off-white")) {
//                        second_layout.kemo = new int[]{R.drawable.ll309};
//                        roomName = "" + R.string.ll309_details;
                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;
                        }
                    }else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState=true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if(second_layout.wood.equals("Cedar" )){
                        if(second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll403, R.drawable.bl401};
                            roomName = "" + R.string.ll403_details;
                        }else if (second_layout.color.equals("off-white")) {
//                        second_layout.kemo = new int[]{R.drawable.ll309};
//                        roomName = "" + R.string.ll309_details;
                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;
                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;
                        }
                    }else if(second_layout.wood.equals("Oak" )){
                        if(second_layout.color.equals("Woody")) {
//                            second_layout.kemo = new int[]{R.drawable.ll401};
//                            roomName = "" + R.string.ll401_details;
                        }else if (second_layout.color.equals("off-white")) {
//                        second_layout.kemo = new int[]{R.drawable.ll309};
//                        roomName = "" + R.string.ll309_details;
                        } else if (second_layout.color.equals("Black")) {
//                            second_layout.kemo = new int[]{R.drawable.ll207};
//                            roomName=""+R.string.ll207_details;

                        } else if (second_layout.color.equals("Gray")) {
//                            second_layout.kemo = new int[]{R.drawable.ll208};
//                            roomName=""+R.string.ll208_details;
                        }
                    } else {
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
}}
//
//
//
//
