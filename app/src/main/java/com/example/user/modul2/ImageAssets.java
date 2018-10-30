package com.example.user.modul2;

import java.util.ArrayList;
import java.util.List;




public class ImageAssets {
    public static List<Integer> heads = new ArrayList<Integer>(){{


            add(R.drawable.baju6);
            add(R.drawable.baju7);
            add(R.drawable.baju8);
            add(R.drawable.baju9);
            add(R.drawable.baju10);
            add(R.drawable.baju11);
            add(R.drawable.baju12);
            add(R.drawable.baju13);

            add(R.drawable.baju16);
            add(R.drawable.baju17);


        }};


    public static List<Integer> bodies = new ArrayList<Integer>(){{



        add(R.drawable.celana4);
        add(R.drawable.celana5);
        add(R.drawable.celana6);
        add(R.drawable.celana7);
        add(R.drawable.celana8);
        add(R.drawable.celana9);



    }};



    //method yang digunakan untuk memanggil variable head.....
    public static List<Integer> getHeads(){
        return heads;
    }

    //method yang digunakan untuk memanggil variable bodies.....
    public static List<Integer> getBodies(){
        return bodies;
    }

    //method yang digunakan untuk memanggil variable legs.....
//    public static List<Integer> getlegs(){
//        return legs;
//    }


    }

