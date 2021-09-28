package org.launchcode;


import java.io.Console;
import java.util.Scanner;

public class I2 {

    //Die Variablen werden deklariert
    public static int iZ1;
    public static int iZ2;
    public static int iZ3;

    public static void main(String[] args) {
        var p = new I2();
        do {
            //Initialisieren der jeweiligen Nummern
            iZ1 = p.numGet();
            iZ2 = p.numGet();
            iZ3 = p.numGet();

            //Die Werte werden sinvoll getauscht
            if (iZ1 > iZ2){
                p.change(12);
            }
            if (iZ2 > iZ3){
                p.change(23);
            }
            if (iZ1 > iZ2){
                p.change(12);
            }

            //Das Resultat wird ausgegeben
            System.out.format("%d is smaller than %d is smaller than %d", iZ1, iZ2, iZ3);

        //Das ganze wird widerholt bis die zahl 1 gleich einer anderen zahl ist
        }while (iZ1 != iZ2 && iZ1 != iZ3);
    }

    public void change(int x/* x sagt uns welche werte vertauscht werden*/){
        int tempHolder;
        switch (x){
            case 12:
                //der erstewert wird gespeichert
                tempHolder = iZ1;
                //die erste Variable erhält den werd der zweiten
                iZ1 = iZ2;
                //die zweite variable erhält den vorher gespeicherten wert der ersten
                iZ2 = tempHolder;
                break;
            case 23:
                tempHolder = iZ2;
                iZ2 = iZ3;
                iZ3 = tempHolder;
                break;
        }

    }

    public int numGet(){
        //neuer Scanner wird deklariert
        Scanner scan = new Scanner(System.in);

        //nummer wird eingescannt
        System.out.println("Please insert a number:");
        return scan.nextInt();
    }
}
