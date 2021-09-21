package org.launchcode;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ein;

        System.out.println("Geben sie eine zahl zwischen 3 und 6 ein: ");

        ein = scan.nextInt();

        if((ein >= 3) && (ein <= 6)){
            for(int hor = 0; hor <= ein; hor++){
                String out = "";
                for(int vert = 0; vert <= ein; vert++){
                    out += "*";
                }
                System.out.println(out);
            }
        }else {
            System.err.println("Achtung, falsche Eingabe!");
        }
        System.out.println("und fertig!");

        scan.close();
    }
}

/*
1:    Der erste Text wäre: "Geben sie eine zahl zwischen 3 und 6 ein:
      Der erste zur Laufzeit generierte output wäre: "*****"

2:    Die "for Schleife" wird nochmals ausgeführt:

                String out = "";                            => out wird Initialisiert
                for(int vert = 0; vert <= ein; vert++){     => erneute for schleife (5x)
                    out += "*";                             => an out wird (5) mal * angehängt
                }
                System.out.println(out);                    => out wird auf einer linie ausgegeben

3:    v.1 => Die Variabeln werden unten im Debugfenster Angezeigt.
      v.2 => Links von der Variable wird mit grauer Schrift ihr Wert angezeigt.
      v.3 => Beim Draufklicken poppt der Wert darunter auf.
 */
