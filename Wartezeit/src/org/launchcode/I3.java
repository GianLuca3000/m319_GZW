package org.launchcode;

import java.io.Console;
import java.util.Scanner;

import java.util.*;

public class I3 {

    public static Scanner scan = new Scanner(System.in);
    public static I3 c = new I3();

    public static void main(String[] args) {
        System.out.println(c.outputSelector(c.calcTime(c.getKassen(), c.getKundenZeit())));
    }

    public String outputSelector(int time){
        switch (time){
            case 0:
                return "Es ist derzeit eine Kasse frei";
            case 1:
                return "Es wird in einer Minute eine Kasse frei";
            default:
                return "Es wird in " + time + " Minuten eine Kasse frei";
        }
    }

    public int getKassen(){

        System.out.println("Bitte anzahl Kassen eingeben:");
        return scan.nextInt();

    }

    public List<Integer> getKundenZeit(){

        List<Integer> timeList = new ArrayList<Integer>();

        int input;
        int counter = 1;

        System.out.println("Wenn Sie fertig sind drücken sie 0\nPro Kunde maximal 12 Stunden Zeit (720 min)\nZeit in Minuten eintragen");

        do {
            System.out.format("\nBitte die Zeit eintragen, welche der %d Kunde braucht oder 0 zum beenden:\n", counter);
            input = scan.nextInt();
            counter++;

            if (input > 0){
                timeList.add(input);
            }

        }while (input != 0);

        return timeList;
    }

    public int calcTime(int ka, List<Integer> ku){
        if (ka == ku.size()){
            return c.listMin(ku);
        }
        if (ka > ku.size()){
            return 0;
        }

        int[] kassen = new int[ka];

        while (ku.size() >= 1) {
            kassen[c.arrMinIndex(kassen)] += ku.get(0);
            ku.remove(0);
        }
        return c.arrMin(kassen);
    }

    public int listMin(List<Integer> lst){

        int min = 720;

        for (int i:lst) {
            if (i < min){
                min = i;
            }
        }

        return min;
    }

    public int arrMinIndex(int[] arr){

        List<Integer> lstArr = new ArrayList<Integer>();
        for (int i:arr) {
            lstArr.add(i);
        }

        return lstArr.indexOf(c.listMin(lstArr));
    }

    public int arrMin(int[] arr){

        List<Integer> lstArr = new ArrayList<Integer>();
        for (int i:arr) {
            lstArr.add(i);
        }

        return c.listMin(lstArr);
    }
}