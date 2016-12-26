package com.example.kemooo.exproject;

/**
 * Created by MRABAH on 20/12/2016.
 */


public class getSelectedFeatures {

    static String roomName;
    static Boolean NotfoundState = false;


    public static void getFeatures() {
        if (first_layout.category.equals("Bed Rooms")) {
            if (first_layout.price.equals("10,000 - 20,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl101, R.drawable.bl111};
                            roomName = "" + (R.string.bl101_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl125};
                            roomName = "" + (R.string.bl125_details);
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl132};
                            roomName = "" + (R.string.bl132_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl118};
                            roomName = "" + (R.string.bl118_details);
                        }
                    } else if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl112};
                            roomName = "" + (R.string.bl101_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl126};
                            roomName = "" + (R.string.bl126_details);
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl133};
                            roomName = "" + (R.string.bl133_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl119};
                            roomName = "" + (R.string.bl119_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl102, R.drawable.bl134};
                            roomName = "" + R.string.bl134_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl103, R.drawable.bl106, R.drawable.bl113};
                            roomName = "" + R.string.bl113_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl127};
                            roomName = "" + (R.string.bl127_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl120};
                            roomName = "" + (R.string.bl120_details);
                        }
                    } else if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl104, R.drawable.bl105, R.drawable.bl135};
                            roomName = "" + R.string.bl135_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl107, R.drawable.bl114};
                            roomName = "" + R.string.bl114_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl128};
                            roomName = "" + (R.string.bl128_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl121};
                            roomName = "" + (R.string.bl121_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl108, R.drawable.bl122};
                            roomName = "" + R.string.bl122_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl109, R.drawable.bl110, R.drawable.bl136};
                            roomName = "" + R.string.bl109_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl129};
                            roomName = "" + (R.string.bl129_details);
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl115};
                            roomName = "" + (R.string.bl115_details);
                        }
                    } else if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl116};
                            roomName = "" + (R.string.bl116_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl130};
                            roomName = "" + (R.string.bl130_details);
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl137};
                            roomName = "" + R.string.bl137_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl123};
                            roomName = "" + R.string.bl123_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl108};
                            roomName = "" + R.string.bl108_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl109, R.drawable.bl138};
                            roomName = "" + R.string.bl109_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl131};
                            roomName = "" + (R.string.bl131_details);
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl117};
                            roomName = "" + (R.string.bl117_details);
                        }
                    } else if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl107};
                            roomName = "" + (R.string.bl107_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl110};
                            roomName = "" + (R.string.bl110_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl124};
                            roomName = "" + (R.string.bl124_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            } else if (first_layout.price.equals("20,000 - 40,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl201, R.drawable.bl211};
                            roomName = "" + R.string.bl201_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl202, R.drawable.bl232};
                            roomName = "" + R.string.bl202_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl225};
                            roomName = "" + (R.string.bl225_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl218};
                            roomName = "" + (R.string.bl218_details);
                        }
                    } else if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl212};
                            roomName = "" + (R.string.bl212_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl226};
                            roomName = "" + (R.string.bl226_details);
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl233};
                            roomName = "" + R.string.bl233_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl219};
                            roomName = "" + (R.string.bl219_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl204, R.drawable.bl205, R.drawable.bl213};
                            roomName = "" + R.string.bl204_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl206, R.drawable.bl234};
                            roomName = "" + R.string.bl206_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl220};
                            roomName = "" + (R.string.bl220_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl227};
                            roomName = "" + (R.string.bl227_details);
                        }
                    } else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl114};
                            roomName = "" + (R.string.bl114_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl228};
                            roomName = "" + (R.string.bl228_details);
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl235};
                            roomName = "" + (R.string.bl235_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl221};
                            roomName = "" + (R.string.bl221_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl207, R.drawable.bl236};
                            roomName = "" + R.string.bl236_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl229};
                            roomName = "" + (R.string.bl229_details);
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl215};
                            roomName = "" + (R.string.bl214_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl222};
                            roomName = "" + (R.string.bl222_details);
                        }
                    } else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl208, R.drawable.bl216};
                            roomName = "" + R.string.bl216_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl230};
                            roomName = "" + (R.string.bl230_details);
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl237};
                            roomName = "" + (R.string.bl237_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl223};
                            roomName = "" + (R.string.bl223_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl209, R.drawable.bl217};
                            roomName = "" + R.string.bl209_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl238};
                            roomName = "" + (R.string.bl238_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl224};
                            roomName = "" + (R.string.bl224_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl231};
                            roomName = "" + (R.string.bl231_details);
                        }
                    } else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl210};
                            roomName = "" + R.string.bl210_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }
                }
            } else if (first_layout.price.equals("40,000 - 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl311};
                            roomName = "" + R.string.bl311_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl332};
                            roomName = "" + (R.string.bl332_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl318};
                            roomName = "" + (R.string.bl318_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl325};
                            roomName = "" + (R.string.bl325_details);
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl312};
                            roomName = "" + R.string.bl312_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl333};
                            roomName = "" + (R.string.bl333_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl319};
                            roomName = "" + (R.string.bl319_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl326};
                            roomName = "" + (R.string.bl326_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl301, R.drawable.bl334};
                            roomName = "" + R.string.bl334_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl313};
                            roomName = "" + (R.string.bl313_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl320};
                            roomName = "" + (R.string.bl320_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl327};
                            roomName = "" + (R.string.bl327_details);
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl335};
                            roomName = "" + R.string.bl335_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl314};
                            roomName = "" + (R.string.bl314_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl321};
                            roomName = "" + (R.string.bl320_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl328};
                            roomName = "" + (R.string.bl328_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl302, R.drawable.bl336};
                            roomName = "" + R.string.bl336_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl329};
                            roomName = "" + (R.string.bl329_details);
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl315};
                            roomName = "" + (R.string.bl315_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl322};
                            roomName = "" + (R.string.bl322_details);
                        }
                    } else if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl337};
                            roomName = "" + R.string.bl336_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl330};
                            roomName = "" + (R.string.bl329_details);
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl316};
                            roomName = "" + (R.string.bl314_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl323};
                            roomName = "" + (R.string.bl322_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl317};
                            roomName = "" + R.string.bl317_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl338};
                            roomName = "" + (R.string.bl338_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl324};
                            roomName = "" + (R.string.bl324_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl331};
                            roomName = "" + (R.string.bl331_details);
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            } else if (first_layout.price.equals("more than 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl411};
                            roomName = "" + R.string.bl411_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl432};
                            roomName = "" + (R.string.bl432_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl418};
                            roomName = "" + (R.string.bl418_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl425};
                            roomName = "" + (R.string.bl425_details);
                        }
                    } else if (second_layout.wood.equals("Cedar")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl412};
                            roomName = "" + R.string.bl412_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl433};
                            roomName = "" + (R.string.bl433_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl419};
                            roomName = "" + (R.string.bl419_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl426};
                            roomName = "" + (R.string.bl426_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Cedar")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl434};
                            roomName = "" + R.string.bl434_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl413};
                            roomName = "" + (R.string.bl413_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl420};
                            roomName = "" + (R.string.bl420_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl427};
                            roomName = "" + (R.string.bl427_details);
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl435};
                            roomName = "" + R.string.bl435_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl414};
                            roomName = "" + (R.string.bl414_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl421};
                            roomName = "" + (R.string.bl420_details);
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl428};
                            roomName = "" + (R.string.bl428_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Cedar")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl402, R.drawable.bl435};
                            roomName = "" + R.string.bl436_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl428};
                            roomName = "" + (R.string.bl429_details);
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl415};
                            roomName = "" + (R.string.bl415_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl421};
                            roomName = "" + (R.string.bl422_details);
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl416};
                            roomName = "" + R.string.bl416_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.bl435};
                            roomName = "" + (R.string.bl435_details);
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Cedar")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.bl402};
                            roomName = "" + R.string.bl402_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.bl403};
                            roomName = "" + R.string.bl403_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            }
        } else if (first_layout.category.equals("Living Rooms")) {
            if (first_layout.price.equals("10,000 - 20,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll101, R.drawable.ll132};
                            roomName = "" + R.string.ll101_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll102, R.drawable.ll111};
                            roomName = "" + R.string.ll102_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll103, R.drawable.ll118};
                            roomName = "" + R.string.ll103_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll125};
                            roomName = "" + (R.string.bl101_details);
                        }
                    } else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll133};
                            roomName = "" + R.string.ll133_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll112};
                            roomName = "" + R.string.ll112_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll119};
                            roomName = "" + R.string.ll119_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll126};
                            roomName = "" + (R.string.bl126_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll104, R.drawable.ll113};
                            roomName = "" + R.string.ll104_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll105, R.drawable.ll134};
                            roomName = "" + R.string.ll105_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll120};
                            roomName = "" + R.string.ll120_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll127};
                            roomName = "" + R.string.ll127_details;
                        }
                    } else if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll135};
                            roomName = "" + R.string.ll133_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll114};
                            roomName = "" + R.string.ll112_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll121};
                            roomName = "" + R.string.ll119_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll128};
                            roomName = "" + (R.string.bl126_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll107, R.drawable.ll136};
                            roomName = "" + R.string.ll136_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll115};
                            roomName = "" + R.string.ll115_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll122};
                            roomName = "" + R.string.ll122_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll129};
                            roomName = "" + (R.string.bl129_details);
                        }
                    } else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll107, R.drawable.ll137};
                            roomName = "" + R.string.ll107_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll108, R.drawable.ll123};
                            roomName = "" + R.string.ll108_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll116};
                            roomName = "" + R.string.ll116_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll130};
                            roomName = "" + (R.string.bl130_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll106, R.drawable.ll109};
                            roomName = "" + R.string.ll106_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll138};
                            roomName = "" + R.string.ll138_details;

                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll117};
                            roomName = "" + R.string.ll117_details;

                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll110};
                            roomName = "" + R.string.ll110_details;

                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll124};
                            roomName = "" + R.string.ll124_details;

                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;

                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.bl131};
                            roomName = "" + (R.string.bl131_details);
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            } else if (first_layout.price.equals("20,000 - 40,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll201, R.drawable.ll211};
                            roomName = "" + R.string.ll201_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll232};
                            roomName = "" + R.string.ll232_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll218};
                            roomName = "" + R.string.ll218_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll225};
                            roomName = "" + R.string.ll225_details;
                        }
                    } else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll202, R.drawable.ll212};
                            roomName = "" + R.string.ll202_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll233};
                            roomName = "" + R.string.ll233_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll219};
                            roomName = "" + R.string.ll219_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll226};
                            roomName = "" + R.string.ll226_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll203, R.drawable.ll204, R.drawable.ll213};
                            roomName = "" + R.string.ll203_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll234};
                            roomName = "" + R.string.ll234_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll220};
                            roomName = "" + R.string.ll220_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll227};
                            roomName = "" + R.string.ll227_details;
                        }
                    } else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll205, R.drawable.ll214};
                            roomName = "" + R.string.ll205_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll235};
                            roomName = "" + R.string.ll235_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll221};
                            roomName = "" + R.string.ll221_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll228};
                            roomName = "" + R.string.ll228_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll206, R.drawable.ll222};
                            roomName = "" + R.string.ll206_details;

                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll207, R.drawable.ll236};
                            roomName = "" + R.string.ll207_details;

                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll208, R.drawable.ll215};
                            roomName = "" + R.string.ll208_details;

                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll229};
                            roomName = "" + R.string.ll229_details;
                        }
                    } else if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll223};
                            roomName = "" + R.string.ll206_details;

                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll237};
                            roomName = "" + R.string.ll207_details;

                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll216};
                            roomName = "" + R.string.ll208_details;

                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll230};
                            roomName = "" + R.string.ll229_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll209, R.drawable.ll238};
                            roomName = "" + R.string.ll209_details;

                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll224};
                            roomName = "" + R.string.ll224_details;

                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;

                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll210};
                            roomName = "" + R.string.ll210_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll217};
                            roomName = "" + R.string.ll217_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll231};
                            roomName = "" + R.string.ll231_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            } else if (first_layout.price.equals("40,000 - 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll301, R.drawable.ll308, R.drawable.ll332};
                            roomName = "" + R.string.ll301_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll318};
                            roomName = "" + R.string.ll318_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll311};
                            roomName = "" + R.string.ll311_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll325};
                            roomName = "" + R.string.ll325_details;
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll333};
                            roomName = "" + R.string.ll333_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll319};
                            roomName = "" + R.string.ll319_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll312};
                            roomName = "" + R.string.ll312_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll326};
                            roomName = "" + R.string.ll326_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll302, R.drawable.ll313};
                            roomName = "" + R.string.ll302_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll303, R.drawable.ll334};
                            roomName = "" + R.string.ll334_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll220};
                            roomName = "" + R.string.ll220_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll227};
                            roomName = "" + R.string.ll227_details;
                        }
                    } else if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll322};
                            roomName = "" + R.string.ll322_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll335};
                            roomName = "" + R.string.ll335_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll214};
                            roomName = "" + R.string.ll214_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll228};
                            roomName = "" + R.string.ll228_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll305, R.drawable.ll306, R.drawable.ll307};
                            roomName = "" + R.string.ll305_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll322};
                            roomName = "" + R.string.ll322_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll336};
                            roomName = "" + R.string.ll336_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll329};
                            roomName = "" + R.string.ll329_details;
                        }
                    } else if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll337};
                            roomName = "" + R.string.ll336_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll323};
                            roomName = "" + R.string.ll323_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll315, R.drawable.ll316};
                            roomName = "" + R.string.ll316_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll330};
                            roomName = "" + R.string.ll330_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll304};
                            roomName = "" + R.string.ll304_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll338};
                            roomName = "" + R.string.ll338_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll317};
                            roomName = "" + R.string.ll317_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll309};
                            roomName = "" + R.string.ll309_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll324};
                            roomName = "" + R.string.ll324_details;
                        } else if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll331};
                            roomName = "" + R.string.ll331_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            } else if (first_layout.price.equals("more than 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll411};
                            roomName = "" + R.string.ll411_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll418};
                            roomName = "" + R.string.ll418_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll425};
                            roomName = "" + R.string.ll425_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll432};
                            roomName = "" + R.string.ll432_details;
                        }
                    } else if (second_layout.wood.equals("Cedar")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll412};
                            roomName = "" + R.string.ll412_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll419};
                            roomName = "" + R.string.ll419_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll426};
                            roomName = "" + R.string.ll426_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll433};
                            roomName = "" + R.string.ll433_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Cedar")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll401, R.drawable.ll413};
                            roomName = "" + R.string.ll401_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll420};
                            roomName = "" + R.string.ll420_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll427};
                            roomName = "" + R.string.ll427_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll434};
                            roomName = "" + R.string.ll434_details;
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll414};
                            roomName = "" + R.string.ll414_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll421};
                            roomName = "" + R.string.ll421_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll428};
                            roomName = "" + R.string.ll428_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll435};
                            roomName = "" + R.string.ll435_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Cedar")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll402, R.drawable.ll415};
                            roomName = "" + R.string.ll402_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll422};
                            roomName = "" + R.string.ll422_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll429};
                            roomName = "" + R.string.ll429_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll436};
                            roomName = "" + R.string.ll436_details;
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll416};
                            roomName = "" + R.string.ll416_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll423};
                            roomName = "" + R.string.ll423_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll430};
                            roomName = "" + R.string.ll430_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll437};
                            roomName = "" + R.string.ll437_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Cedar")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll403};
                            roomName = "" + R.string.ll403_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.ll431};
                            roomName = "" + R.string.ll431_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.ll417};
                            roomName = "" + R.string.ll417_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.ll424};
                            roomName = "" + R.string.ll424_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.ll438};
                            roomName = "" + R.string.ll438_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            }
        } else if (first_layout.category.equals("Dining Rooms")) {
            if (first_layout.price.equals("10,000 - 20,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl111};
                            roomName = "" + R.string.dl111_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl102, R.drawable.dl118};
                            roomName = "" + R.string.dl102_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl125};
                            roomName = "" + R.string.dl125_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl101, R.drawable.dl132};
                            roomName = "" + R.string.dl132_details;
                        }
                    } else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl112};
                            roomName = "" + R.string.dl112_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl119};
                            roomName = "" + R.string.dl119_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl126};
                            roomName = "" + R.string.dl126_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl133};
                            roomName = "" + R.string.dl133_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl103, R.drawable.dl113};
                            roomName = "" + R.string.dl103_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl120};
                            roomName = "" + R.string.dl120_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl127};
                            roomName = "" + R.string.dl127_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl134};
                            roomName = "" + R.string.dl134_details;
                        }
                    } else if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl114};
                            roomName = "" + R.string.dl114_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl121};
                            roomName = "" + R.string.dl121_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl128};
                            roomName = "" + R.string.dl128_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl135};
                            roomName = "" + R.string.dl135_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl115};
                            roomName = "" + R.string.dl115_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl122};
                            roomName = "" + R.string.dl122_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl129};
                            roomName = "" + R.string.dl129_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl136};
                            roomName = "" + R.string.dl136_details;
                        }
                    } else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl116};
                            roomName = "" + R.string.dl116_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl123};
                            roomName = "" + R.string.dl123_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl130};
                            roomName = "" + R.string.dl130_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl109, R.drawable.dl137};
                            roomName = "" + R.string.dl109_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl131};
                            roomName = "" + R.string.dl131_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl138};
                            roomName = "" + R.string.dl138_details;
                        }
                    } else if (second_layout.wood.equals("Pine")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl117};
                            roomName = "" + R.string.dl117_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl124};
                            roomName = "" + R.string.dl124_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl110};
                            roomName = "" + R.string.dl110_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            } else if (first_layout.price.equals("20,000 - 40,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl211};
                            roomName = "" + R.string.dl211_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl202, R.drawable.dl218};
                            roomName = "" + R.string.dl202_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl225};
                            roomName = "" + R.string.dl225_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl201, R.drawable.dl202, R.drawable.dl232};
                        }
                    } else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl212};
                            roomName = "" + R.string.dl212_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl219};
                            roomName = "" + R.string.dl219_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl226};
                            roomName = "" + R.string.dl226_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl233};
                            roomName = "" + R.string.dl233_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl213};
                            roomName = "" + R.string.dl213_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl220};
                            roomName = "" + R.string.dl220_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl227};
                            roomName = "" + R.string.dl227_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl234, R.drawable.dl204};
                            roomName = "" + R.string.dl234_details;
                        }
                    } else if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl214, R.drawable.dl203, R.drawable.dl205};
                            roomName = "" + R.string.dl214_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl221};
                            roomName = "" + R.string.dl221_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl228};
                            roomName = "" + R.string.dl228_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl235};
                            roomName = "" + R.string.dl235_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl215, R.drawable.dl206, R.drawable.dl207};
                            roomName = "" + R.string.dl206_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl222};
                            roomName = "" + R.string.dl222_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl229};
                            roomName = "" + R.string.dl229_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl236};
                            roomName = "" + R.string.dl236_details;
                        }
                    } else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl216};
                            roomName = "" + R.string.dl216_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl223};
                            roomName = "" + R.string.dl223_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl230};
                            roomName = "" + R.string.dl230_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl237, R.drawable.dl204};
                            roomName = "" + R.string.dl234_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {

                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl217};
                            roomName = "" + R.string.dl217_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl224};
                            roomName = "" + R.string.dl224_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl231};
                            roomName = "" + R.string.dl231_details;
                        }else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl208,R.drawable.dl238};
                            roomName = "" + R.string.dl206_details;
                        }
                    } else if (second_layout.wood.equals("Mahogany")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl209, R.drawable.dl210};
                            roomName = "" + R.string.dl209_details;
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            } else if (first_layout.price.equals("40,000 - 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl311, R.drawable.dl302};
                            roomName = "" + R.string.dl311_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl318};
                            roomName = "" + R.string.dl318_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl325};
                            roomName = "" + R.string.dl325_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl332};
                            roomName = "" + R.string.dl332_details;
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl312};
                            roomName = "" + R.string.dl312_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl319, R.drawable.dl301};
                            roomName = "" + R.string.dl319_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl326};
                            roomName = "" + R.string.dl326_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl333};
                            roomName = "" + R.string.dl333_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl313, R.drawable.dl304, R.drawable.dl305, R.drawable.dl306, R.drawable.dl307};
                            roomName = "" + R.string.dl313_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl320};
                            roomName = "" + R.string.dl320_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl327};
                            roomName = "" + R.string.dl327_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl334, R.drawable.dl304};
                            roomName = "" + R.string.dl334_details;
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl314, R.drawable.dl303, R.drawable.dl305};
                            roomName = "" + R.string.dl314_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl321};
                            roomName = "" + R.string.dl321_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl328, R.drawable.dl303};
                            roomName = "" + R.string.dl328_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl335};
                            roomName = "" + R.string.dl335_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Beech")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl315, R.drawable.dl304, R.drawable.dl305, R.drawable.dl306, R.drawable.dl307};
                            roomName = "" + R.string.dl315_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl322};
                            roomName = "" + R.string.dl322_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl329};
                            roomName = "" + R.string.dl329_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl336, R.drawable.dl304};
                            roomName = "" + R.string.dl336_details;
                        }
                    } else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl316, R.drawable.dl310};
                            roomName = "" + R.string.dl316_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl323};
                            roomName = "" + R.string.dl323_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl330};
                            roomName = "" + R.string.dl330_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl337,R.drawable.dl309};
                            roomName = "" + R.string.dl337_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Oak")) {
                        if( second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl317,R.drawable.dl310};
                            roomName = "" + R.string.dl310_details;
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl324};
                            roomName = "" + R.string.dl324_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl331};
                            roomName = "" + R.string.dl331_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl338, R.drawable.dl308};
                            roomName = "" + R.string.dl337_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            } else if (first_layout.price.equals("more than 60,000")) {
                if (first_layout.size.equals("3 * 3")) {
                    if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl401, R.drawable.dl411};
                            roomName = "" + R.string.dl411_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl418};
                            roomName = "" + R.string.dl402_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl425};
                            roomName = "" + R.string.dl425_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl432, R.drawable.dl404};
                        }
                    } else if (second_layout.wood.equals("Cedar")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl412, R.drawable.dl403, R.drawable.dl402};
                            roomName = "" + R.string.dl403_details;
                        } else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl419, R.drawable.dl401};
                            roomName = "" + R.string.dl419_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl426};
                            roomName = "" + R.string.dl426_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl433, R.drawable.dl405};
                            roomName = "" + R.string.dl433_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("3 * 4")) {
                    if (second_layout.wood.equals("Cedar")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl413,R.drawable.dl401};
                            roomName = "" + R.string.dl413_details;
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl420};
                            roomName = "" + R.string.dl420_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl427};
                            roomName = "" + R.string.dl427_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl434, R.drawable.dl404};
                            roomName = "" + R.string.dl404_details;
                        }
                    }else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl414};
                            roomName = "" + R.string.dl414_details;
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl421};
                            roomName = "" + R.string.dl421_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl428};
                            roomName = "" + R.string.dl428_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl435};
                            roomName = "" + R.string.dl435_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("4 * 5")) {
                    if (second_layout.wood.equals("Cedar")) {
                        if(second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl415,R.drawable.dl406, R.drawable.dl407, R.drawable.dl408};
                            roomName = "" + R.string.dl406_details;
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl422};
                            roomName = "" + R.string.dl422_details;
                        } else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl429};
                            roomName = "" + R.string.dl429_details;
                        } else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl436};
                            roomName = "" + R.string.dl436_details;
                        }
                    }else if (second_layout.wood.equals("Oak")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl416};
                            roomName = "" + R.string.dl416_details;
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl423};
                            roomName = "" + R.string.dl423_details;
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl430};
                            roomName = "" + R.string.dl430_details;
                        }else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl437};
                            roomName = "" + R.string.dl437_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                } else if (first_layout.size.equals("5 * 5")) {
                    if (second_layout.wood.equals("Cedar")) {
                        if (second_layout.color.equals("Woody")) {
                            second_layout.kemo = new int[]{R.drawable.dl417};
                            roomName = "" + R.string.dl417_details;
                        }else if (second_layout.color.equals("Black")) {
                            second_layout.kemo = new int[]{R.drawable.dl424};
                            roomName = "" + R.string.dl424_details;
                        }else if (second_layout.color.equals("Gray")) {
                            second_layout.kemo = new int[]{R.drawable.dl431};
                            roomName = "" + R.string.dl431_details;
                        }else if (second_layout.color.equals("off-white")) {
                            second_layout.kemo = new int[]{R.drawable.dl438};
                            roomName = "" + R.string.dl438_details;
                        }
                    } else {
                        second_layout.kemo = new int[]{R.drawable.white};
                        NotfoundState = true;
                    }
                }
            }
        }else if (first_layout.category.equals("Children Rooms")) {
                if (first_layout.price.equals("10,000 - 20,000")) {
                    if (first_layout.size.equals("3 * 3")) {
                        if (second_layout.wood.equals("Pine")) {
                            if (second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl111};
                                roomName = "" + R.string.cl111_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl118};
                                roomName = "" + R.string.cl118_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl125};
                                roomName = "" + R.string.cl125_details;
                            }else if (second_layout.color.equals("off-white")) {
                                    second_layout.kemo = new int[]{R.drawable.cl132,R.drawable.cl101, R.drawable.cl102};
                                    roomName = "" + R.string.cl101_details;
                            }
                        }else if (second_layout.wood.equals("Mahogany")) {
                            if (second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl112};
                                roomName = "" + R.string.cl112_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl119};
                                roomName = "" + R.string.cl119_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl126};
                                roomName = "" + R.string.cl126_details;
                            }else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl133,R.drawable.cl101, R.drawable.cl102};
                                roomName = "" + R.string.cl101_details;
                            }
                    }else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else if (first_layout.size.equals("3 * 4")) {
                        if (second_layout.wood.equals("Mahogany")) {
                            if (second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl113};
                                roomName = "" + R.string.cl113_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl120,R.drawable.cl103};
                                roomName = "" + R.string.cl103_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl127};
                                roomName = "" + R.string.cl126_details;
                            } else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl134,R.drawable.cl104};
                                roomName = "" + R.string.cl104_details;
                            }
                        }else if(second_layout.wood.equals("Pine")){
                            if (second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl114};
                                roomName = "" + R.string.cl114_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl121};
                                roomName = "" + R.string.cl121_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl128};
                                roomName = "" + R.string.cl128_details;
                            } else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl135};
                                roomName = "" + R.string.cl135_details;
                            }
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else if (first_layout.size.equals("4 * 5")) {
                        if (second_layout.wood.equals("Pine")) {
                            if(second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl115,R.drawable.cl105, R.drawable.cl106};
                                roomName = "" + R.string.cl115_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl122};
                                roomName = "" + R.string.cl122_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl129};
                                roomName = "" + R.string.cl129_details;
                            } else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl136};
                                roomName = "" + R.string.cl136_details;
                            }
                        } else if (second_layout.wood.equals("Mahogany") ) {
                            if(second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl116};
                                roomName = "" + R.string.cl116_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl123};
                                roomName = "" + R.string.cl123_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl130};
                                roomName = "" + R.string.cl130_details;
                            }else if(second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl137};
                                roomName = "" + R.string.cl137_details;
                            }
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else if (first_layout.size.equals("5 * 5")) {
                        if (second_layout.wood.equals("Pine")) {
                            if(second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl117};
                                roomName = "" + R.string.cl117_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl124};
                                roomName = "" + R.string.cl124_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl131};
                                roomName = "" + R.string.cl131_details;
                            }else if( second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl138,R.drawable.cl110};
                                roomName = "" + R.string.cl110_details;
                            }
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }
                } else if (first_layout.price.equals("20,000 - 40,000")) {
                    if (first_layout.size.equals("3 * 3")) {
                        if (second_layout.wood.equals("Beech")) {
                            if(second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl211};
                                roomName = "" + R.string.cl211_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl218};
                                roomName = "" + R.string.cl218_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl225};
                                roomName = "" + R.string.cl225_details;
                            }else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl232,R.drawable.cl201, R.drawable.cl202, R.drawable.cl203};
                                roomName = "" + R.string.cl232_details;
                            }
                        }else if(second_layout.wood.equals("Mahogany")){
                                if(second_layout.color.equals("Woody")) {
                                    second_layout.kemo = new int[]{R.drawable.cl212};
                                    roomName = "" + R.string.cl212_details;
                                }else if (second_layout.color.equals("Black")) {
                                    second_layout.kemo = new int[]{R.drawable.cl219};
                                    roomName = "" + R.string.cl219_details;
                                }else if (second_layout.color.equals("Gray")) {
                                    second_layout.kemo = new int[]{R.drawable.cl226};
                                    roomName = "" + R.string.cl226_details;
                                }else if (second_layout.color.equals("off-white")) {
                                    second_layout.kemo = new int[]{R.drawable.cl233};
                                    roomName = "" + R.string.cl233_details;
                                }
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else if (first_layout.size.equals("3 * 4")) {
                        if (second_layout.wood.equals("Mahogany")) {
                            if(second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl213};
                                roomName = "" + R.string.cl213_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl220};
                                roomName = "" + R.string.cl220_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl227};
                                roomName = "" + R.string.cl227_details;
                            }else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl234};
                                roomName = "" + R.string.cl204_details;
                                }
                        } else if (second_layout.wood.equals("Beech")) {
                            if (second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl214,R.drawable.cl205};
                                roomName = "" + R.string.cl205_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl221};
                                roomName = "" + R.string.cl221_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl228};
                                roomName = "" + R.string.cl228_details;
                            }else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl235};
                                roomName = "" + R.string.cl235_details;
                            }
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else if (first_layout.size.equals("4 * 5")) {
                        if (second_layout.wood.equals("Mahogany")) {
                            if(second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl215,R.drawable.cl206, R.drawable.cl207, R.drawable.cl208};
                                roomName = "" + R.string.cl206_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl222};
                                roomName = "" + R.string.cl222_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl229};
                                roomName = "" + R.string.cl229_details;
                            }else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl236};
                                roomName = "" + R.string.cl236_details;
                            }
                        }else if (second_layout.wood.equals("Beech")) {
                            if (second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl216};
                                roomName = "" + R.string.cl216_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl223};
                                roomName = "" + R.string.cl223_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl230};
                                roomName = "" + R.string.cl230_details;
                            }else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl237};
                                roomName = "" + R.string.cl237_details;
                            }
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else if (first_layout.size.equals("5 * 5")) {
                        if (second_layout.wood.equals("Beech")) {
                             if (second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl217,R.drawable.cl210};
                                roomName = "" + R.string.cl210_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl224};
                                roomName = "" + R.string.cl224_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl231};
                                roomName = "" + R.string.cl231_details;
                            }else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl238};
                                roomName = "" + R.string.cl238_details;
                            }
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }
                } else if (first_layout.price.equals("40,000 - 60,000")) {
                    if (first_layout.size.equals("3 * 3")) {
                        if (second_layout.wood.equals("Oak")) {
                            if (second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl311};
                                roomName = "" + R.string.cl311_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl318};
                                roomName = "" + R.string.cl318_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl325};
                                roomName = "" + R.string.cl325_details;
                            }else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl332,R.drawable.cl301};
                                roomName = "" + R.string.cl301_details;
                            }
                        } else if (second_layout.wood.equals("Beech")) {
                            if (second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl312,R.drawable.cl302};
                                roomName = "" + R.string.cl312_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl319};
                                roomName = "" + R.string.cl319_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl326};
                                roomName = "" + R.string.cl326_details;
                            }else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl333};
                                roomName = "" + R.string.cl333_details;
                            }
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else if (first_layout.size.equals("3 * 4")) {
                        if (second_layout.wood.equals("Oak")) {
                            if(second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl313,R.drawable.cl303, R.drawable.cl304, R.drawable.cl305};
                                roomName = "" + R.string.cl303_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl320};
                                roomName = "" + R.string.cl320_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl327};
                                roomName = "" + R.string.cl327_details;
                            }else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl334};
                                roomName = "" + R.string.cl334_details;
                            }
                        }else if(second_layout.wood.equals("Beech")){
                                if(second_layout.color.equals("Woody")) {
                                    second_layout.kemo = new int[]{R.drawable.cl314};
                                    roomName = "" + R.string.cl314_details;
                                }else if (second_layout.color.equals("Black")) {
                                    second_layout.kemo = new int[]{R.drawable.cl321};
                                    roomName = "" + R.string.cl321_details;
                                }else if (second_layout.color.equals("Gray")) {
                                    second_layout.kemo = new int[]{R.drawable.cl328};
                                    roomName = "" + R.string.cl328_details;
                                }else if (second_layout.color.equals("off-white")) {
                                    second_layout.kemo = new int[]{R.drawable.cl335};
                                    roomName = "" + R.string.cl335_details;
                                }
                        }
                    } else if (first_layout.size.equals("4 * 5")) {
                        if (second_layout.wood.equals("Beech")) {
                            if(second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl315};
                                roomName = "" + R.string.cl315_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl322,R.drawable.cl306};
                                roomName = "" + R.string.cl306_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl329};
                                roomName = "" + R.string.cl329_details;
                            }else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl336};
                                roomName = "" + R.string.cl336_details;
                            }
                        } else if (second_layout.wood.equals("Oak")) {
                            if(second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl316};
                                roomName = "" + R.string.cl316_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl323};
                                roomName = "" + R.string.cl323_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl330};
                                roomName = "" + R.string.cl330_details;
                            }else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl337,R.drawable.cl307};
                                roomName = "" + R.string.cl307_details;
                            }
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else if (first_layout.size.equals("5 * 5")) {
                        if (second_layout.wood.equals("Oak")) {
                            if (second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl317,R.drawable.cl308, R.drawable.cl309};
                                roomName = "" + R.string.cl308_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl324};
                                roomName = "" + R.string.cl324_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl331};
                                roomName = "" + R.string.cl331_details;
                            } else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl338,R.drawable.cl310};
                                roomName = "" + R.string.cl310_details;
                            } else {
                                second_layout.kemo = new int[]{R.drawable.white};
                                NotfoundState = true;
                            }
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }
                } else if (first_layout.price.equals("more than 60,000")) {
                    if (first_layout.size.equals("3 * 3")) {
                        if (second_layout.wood.equals("Cedar") ) {
                            if(second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl411,R.drawable.cl401, R.drawable.cl402};
                                roomName = "" + R.string.cl401_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl418};
                                roomName = "" + R.string.cl418_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl425};
                                roomName = "" + R.string.cl425_details;
                            } else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl432};
                                roomName = "" + R.string.cl432_details;
                            }
                        } else if (second_layout.wood.equals("Oak")) {
                            if(second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl412};
                                roomName = "" + R.string.cl412_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl419};
                                roomName = "" + R.string.cl419_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl426};
                                roomName = "" + R.string.cl426_details;
                            } else if(second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl433};
                                roomName = "" + R.string.cl433_details;
                            }
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else if (first_layout.size.equals("3 * 4")) {
                        if (second_layout.wood.equals("Cedar")) {
                            if (second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl413,R.drawable.cl405, R.drawable.cl406};
                                roomName = "" + R.string.cl404_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl420};
                                roomName = "" + R.string.cl420_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl427};
                                roomName = "" + R.string.cl427_details;
                            }  else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl434,R.drawable.cl404, R.drawable.cl407};
                                roomName = "" + R.string.cl404_details;
                            }
                        }else if (second_layout.wood.equals("Oak")) {
                            if (second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl414};
                                roomName = "" + R.string.cl414_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl421};
                                roomName = "" + R.string.cl421_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl428};
                                roomName = "" + R.string.cl428_details;
                            }  else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl435};
                                roomName = "" + R.string.cl404_details;
                            }
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else if (first_layout.size.equals("4 * 5")) {
                        if (second_layout.wood.equals("Cedar")) {
                             if (second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl415,R.drawable.cl408};
                                roomName = "" + R.string.cl408_details;
                             }else if (second_layout.color.equals("Black")) {
                                 second_layout.kemo = new int[]{R.drawable.cl422};
                                 roomName = "" + R.string.cl422_details;
                             }else if (second_layout.color.equals("Gray")) {
                                 second_layout.kemo = new int[]{R.drawable.cl429};
                                 roomName = "" + R.string.cl429_details;
                             }else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl436};
                                roomName = "" + R.string.cl436_details;
                            }
                        }else if (second_layout.wood.equals("Oak")) {
                            if (second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl416};
                                roomName = "" + R.string.cl416_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl423};
                                roomName = "" + R.string.cl423_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl430};
                                roomName = "" + R.string.cl430_details;
                            }else if (second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl437};
                                roomName = "" + R.string.cl437_details;
                            }
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    } else if (first_layout.size.equals("5 * 5")) {
                        if (second_layout.wood.equals("Cedar")  ) {
                            if (second_layout.color.equals("Woody")) {
                                second_layout.kemo = new int[]{R.drawable.cl417};
                                roomName = "" + R.string.cl417_details;
                            }else if (second_layout.color.equals("Black")) {
                                second_layout.kemo = new int[]{R.drawable.cl423};
                                roomName = "" + R.string.cl425_details;
                            }else if (second_layout.color.equals("Gray")) {
                                second_layout.kemo = new int[]{R.drawable.cl431};
                                roomName = "" + R.string.cl431_details;
                            }else if(second_layout.color.equals("off-white")) {
                                second_layout.kemo = new int[]{R.drawable.cl438,R.drawable.cl410};
                                roomName = "" + R.string.cl410_details;
                            }
                        } else {
                            second_layout.kemo = new int[]{R.drawable.white};
                            NotfoundState = true;
                        }
                    }
                }
            }
        }
    }

