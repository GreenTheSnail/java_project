package com.company;
//class for data input
import java.util.Scanner;

public class Master_in {
    private int x, y, z, t;
    public void input() {
        System.out.println("Výška úvěru:");
        Scanner obj1 = new Scanner(System.in);
        x = obj1.nextInt();
        System.out.println("Úroková míra:");
        Scanner obj2 = new Scanner(System.in);
        y = obj2.nextInt();
        System.out.println("Doba splácení:");
        Scanner obj3 = new Scanner(System.in);
        z = obj3.nextInt();
        System.out.println("Interval:");
        Scanner obj4 = new Scanner(System.in);
        t = obj4.nextInt();
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