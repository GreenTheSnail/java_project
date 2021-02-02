package com.company;
//class for data input

import java.util.Scanner;

public class Master_in {
    private int x, y, z, t;
    private boolean isNumber1, isNumber2, isNumber3, isNumber4; //booleans for input loop
    private String str1, str2, str3, str4; //strings to delete spaces

    public void input() {
        System.out.println("Výška úvěru:");
        Scanner obj1 = new Scanner(System.in);
        do {
            str1 = obj1.nextLine();
            str1 = str1.replaceAll(" ", "");
            isNumber1 = true;
            try {
                x = Integer.parseInt(str1);

            } catch (NumberFormatException | NullPointerException nfe) {
                System.out.println("Výška úvěru musí obsahovat jenom čísla. Zkuste ještě jednou:");
                isNumber1 = false;
            }
        } while (!(isNumber1));

        System.out.println("Úroková míra:");
        Scanner obj2 = new Scanner(System.in);

        do {
            str2 = obj2.nextLine();
            str2 = str2.replaceAll(" ", "");
            isNumber2 = true;
            try {
                y = Integer.parseInt(str2);

            } catch (NumberFormatException | NullPointerException nfe) {
                System.out.println("Úroková míra musí obsahovat jenom čísla. Zkuste ještě jednou:");
                isNumber2 = false;
            }
        } while (!(isNumber2));

        System.out.println("Doba splácení:");
        Scanner obj3 = new Scanner(System.in);
        do {
            str3 = obj3.nextLine();
            str3 = str3.replaceAll(" ", "");
            isNumber3 = true;
            try {
                z = Integer.parseInt(str3);

            } catch (NumberFormatException | NullPointerException nfe) {
                System.out.println("Doba splácení musí obsahovat jenom čísla. Zkuste ještě jednou:");
                isNumber3 = false;
            }
        } while (!(isNumber3));

        System.out.println("Interval:");
        Scanner obj4 = new Scanner(System.in);
        do {
            str4 = obj4.nextLine();
            str4 = str4.replaceAll(" ", "");
            isNumber4 = true;
            try {
                t = Integer.parseInt(str4);

            } catch (NumberFormatException | NullPointerException nfe) {
                System.out.println("Interval musí obsahovat jenom čísla. Zkuste ještě jednou:");
                isNumber4 = false;
            }
        } while (!(isNumber4));
    }

    public int vyska_uveru() {
        return x; //x is for returning of Výška úvěru
    }

    public int urokova_mira() {
        return y; //y is for returning of Úroková míra
    }

    public int doba_splaceni() {
        return z; //z is for returning of Doba splácení
    }

    public int interval() {
        return t; //t is for returning of Interval
    }

}