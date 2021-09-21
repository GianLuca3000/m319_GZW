// Defines package
package ch.tbz;

// Imports libraries
import ch.tbz.lib.Input;

import static java.lang.System.*;   // System-IO Library for abbriviation purpose to static functions
import static java.lang.Math.*;     // Mathematic Library for abbriviation purpose to static functions

import java.math.BigDecimal;
import java.util.*;                 // Random is part of this library

// Imports Input functions
import static ch.tbz.lib.Input.*;       // All the functions can be used now!

//Every program must be placed in a class ...
public class Main {

    // Our main function which runs the program12
    public static void main(String[] args ) {
        //yes or no Instance (quit or again)
        String rep;
        //Loop which allows us to reset
        do {
            char op = inputChar("What do you want to calculate?\n(+, -, *, / or %)");
            //Switch to detect Operator
            switch (op){
                case '+':
                    System.out.println( "Result: " + (Input('a') + Input('b')));
                    break;
                case '-':
                    System.out.println( "Result: " + (Input('a') - Input('b')));
                    break;
                case '*':
                    System.out.println( "Result: " + (Input('a') * Input('b')));
                    break;
                case '/':
                    System.out.println( "Result: " + (Input('a') / Input('b')));
                    break;
                case '%':
                    System.out.println( "Result: " + (Input('a') % Input('b')));
                    break;
                default:
                    System.out.println("Invalid operator!");
            }
            rep = inputString( "Do you want to calculate again?\n(YES/NO)");
        }while ( rep.equals("YES"));

    }

    //Reads the input number
    public static Double Input(char x){
        if (x == 'a'){
            return inputDouble("Please insert the first number: ");
        }
        return inputDouble("Please insert the second number: ");
    }

}
