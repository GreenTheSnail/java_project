package com.company;


import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
    Master_in master_in = new Master_in();
    master_in.input();

    Pravidelna_splatka pravidelna_splatka = new Pravidelna_splatka();
    pravidelna_splatka.calcul((double)master_in.vyska_uveru(),(double)master_in.urokova_mira(),(double)master_in.doba_splaceni(),(double)master_in.interval());
    System.out.println("Pravidelná splátka:");
    System.out.println(pravidelna_splatka.splatka());

    Celkem_zaplaceno celkem_zaplaceno = new Celkem_zaplaceno();
    celkem_zaplaceno.calcul(pravidelna_splatka.splatka(),master_in.doba_splaceni(), (double)master_in.interval());
    System.out.println("Celkem zaplaceno:");
    System.out.println(celkem_zaplaceno.total());

    Zaplacene_uroky zaplacene_uroky = new Zaplacene_uroky();
    zaplacene_uroky.calcul(celkem_zaplaceno.total(),(double)master_in.vyska_uveru());
    System.out.println("Zaplacené úroky:");
    System.out.println(zaplacene_uroky.total());

    System.out.println("Rozložení celkové splátky hypotéky (Kč):");
    System.out.println("Jistina: " + master_in.vyska_uveru() + "("+Math.round(master_in.vyska_uveru() / celkem_zaplaceno.total()*100)+"%)");
    System.out.println("Úroky: " + zaplacene_uroky.total() + "("+Math.round(zaplacene_uroky.total() / celkem_zaplaceno.total()*100)+"%)");

        Master_out master_out = new Master_out();
        master_out.output(master_in.vyska_uveru(), pravidelna_splatka.splatka(), master_in.urokova_mira(), master_in.doba_splaceni(), master_in.interval());
    }
}
