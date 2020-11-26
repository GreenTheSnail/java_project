package com.company;
//class for data input
import java.util.Scanner;

public class Master_in {
    private int x, y, z, t;
    private boolean isNumber, isNumber2, isNumber3, isNumber4; //booleans for input loop
    public void input() {
        System.out.println("Výška úvěru:");
        Scanner obj1 = new Scanner(System.in);
        do {
            if (obj1.hasNextInt()) {
                x = obj1.nextInt();
                isNumber = true;
            }
            else{
                System.out.println("Výška úvěru musí obsahovat jenom čísla bez mezer. Zkuste ještě jednou:");
                isNumber = false;
                obj1.next();
            }
        } while (!(isNumber));

        System.out.println("Úroková míra:");
        Scanner obj2 = new Scanner(System.in);
        do {
            if (obj2.hasNextInt()) {
                y = obj2.nextInt();
                isNumber2 = true;
            }
            else {
                System.out.println("Úroková míra musí obsahovat jenom čísla bez mezer. Zkuste ještě jednou:");
                isNumber2 = false;
                obj2.next();
            }
        } while (!(isNumber2));

        System.out.println("Doba splácení:");
        Scanner obj3 = new Scanner(System.in);
        do {
            if (obj3.hasNextInt()) {
                z = obj3.nextInt();
                isNumber3 = true;
            }
            else {
                System.out.println("Doba splácení musí obsahovat jenom čísla bez mezer. Zkuste ještě jednou:");
                isNumber3 = false;
                obj3.next();
            }
        } while (!(isNumber3));

        System.out.println("Interval:");
        Scanner obj4 = new Scanner(System.in);
        do {
            if (obj4.hasNextInt()) {
                t = obj4.nextInt();
                isNumber4 = true;

            }
            else{
                System.out.println("Interval musí obsahovat jenom čísla bez mezer. Zkuste ještě jednou:");
                isNumber4 = false;
                obj4.next();
            }
        } while (!(isNumber4));
    }

            public int vyska_uveru () {
            return x; //x is for returning of Výška úvěru
        }

            public int urokova_mira () {
            return y; //y is for returning of Úroková míra
        }

            public int doba_splaceni () {
            return z; //z is for returning of Doba splácení
        }

            public int interval () {
            return t; //t is for returning of Interval
        }

}