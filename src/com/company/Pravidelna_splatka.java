package com.company;
//class for calculating of payments

import java.lang.Math;

public class Pravidelna_splatka {
    private double i, v, a;

    public void calcul(double vys, double ur, double dob, double in) {
        //vys is for vyska_uveru, ur is for urokova_mira, dob is for doba_splaceni, in is for interval
        i = ur / in / 100;
        v = 1 / (1 + i);
        a = (i * vys) / (1 - Math.pow(v, in * dob));
    }

    public double splatka() {
        a = Math.round(a * 100.0) / 100.0;
        return a; //a is for returning of splatka
    }

}
