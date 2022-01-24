package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
    }
    public static void Time(){
        ArrayList<Double> Default = new ArrayList<Double>();
        LinkedList<Double> Link = new LinkedList<Double>();
        final int Size = 1000000;
        final int Get = 100000;
        for(int i=0;i<Size;i++) {
            Default.add(Math.random());
            Link.add(Math.random());
        }
        for (int i = 0; i<Get;i++){
            Default.get((int) Math.random()*(Size-1));
        }
        for (int i = 0;i<Get;i++){
            Link.get((int) Math.random()*(Size-1));
        }
    }
}

