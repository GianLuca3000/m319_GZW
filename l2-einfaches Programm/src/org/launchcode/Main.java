package org.launchcode;


import java.io.Console;
import java.util.Scanner;

public class Main {

    public static int iZ1;
    public static int iZ2;
    public static int iZ3;

    public static void main(String[] args) {
        do {
            iZ1 = numGet();
            iZ2 = numGet();
            iZ3 = numGet();

            if (iZ1 > iZ2){
                change(12);
            }
            if (iZ2 > iZ3){
                change(23);
            }
            if (iZ1 > iZ2){
                change(12);
            }

            System.out.format("%d is smaller than %d is smaller than %d", iZ1, iZ2, iZ3);
        }while (iZ1 != iZ2 && iZ1 != iZ3);
    }

    public static void change(int x){
        int tempHolder;
        switch (x){
            case 12:
                tempHolder = iZ1;
                iZ1 = iZ2;
                iZ2 = tempHolder;
                break;
            case 23:
                tempHolder = iZ2;
                iZ2 = iZ3;
                iZ3 = tempHolder;
                break;
        }

    }

    public static int numGet(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please insert a number:");
        return scan.nextInt();
    }
}
