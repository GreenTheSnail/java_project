package com.company;

//class for calculating of all payments
public class Celkem_zaplaceno {
    private double x;

    public void calcul(double sp, int d, double in) {
        //sp is for splatka, in is for interval, d is for doba
        x = sp * in * d;
    }

    public double total() {
        x = Math.round(x * 100.0) / 100.0;
        return x; //x is for returning of Celkem_zaplaceno
    }
}
