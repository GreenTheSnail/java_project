package com.company;
//class for calculating of all fee payments
public class Zaplacene_uroky {
    private double x;
    public void calcul (double cel, double vys) {
        //sp is for splatka, in is for interval
        x = cel - vys;
    }
    public double total () {
        x = Math.round(x * 100.0) / 100.0;
        return x; //x is for returning of Zaplacene_uroky
    }
}