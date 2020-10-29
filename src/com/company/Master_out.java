package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

//class for output and saving txt on disk
public class Master_out {
    double ur, um, uv; //ur is for Úrok, um is for Úmor, uv is for Úvěr
    public void output(int vys, double spl, double mir, int dob, int inter) throws IOException {
       //vys if for Výška úvěru, spl is for Splátka, mir is for Úroková míra, dob is for Doba splácení, inter is for Interval
        String[][] kalendar = new String[dob * inter + 1][5];
        kalendar[0][0] = "Poř.";
        kalendar[0][1] = "Splátka";
        kalendar[0][2] = "Úrok";
        kalendar[0][3] = "Úmor";
        kalendar[0][4] = "Úvěr";
        uv = (double)vys;

           for (int y = 0; y < dob * inter; y++) {
               kalendar[y+1][1] = String.valueOf(spl);
               if(y<9){
               kalendar[y+1][0] = String.valueOf(y+1)+".  ";
               }
               else if(y<99) {
                   kalendar[y+1][0] = String.valueOf(y+1)+". ";
               }
               else{
                   kalendar[y+1][0] = String.valueOf(y+1)+".";
               }
              ur = uv * mir/(double)inter/100;
              um = spl - ur;
              uv = uv - um;

              kalendar[y+1][2] = String.valueOf(Math.round(ur * 100.0) / 100.0);
              kalendar[y+1][3] = String.valueOf(Math.round(um * 100.0) / 100.0);
              kalendar[y+1][4] = String.valueOf(Math.round(uv * 100.0) / 100.0);
           }


        for (String[] strings : kalendar) {
            System.out.println();
            for (String string : strings) {
                System.out.print(string + "     ");
            }
        }
        File file = new File("textFile.txt");
        if(!file.exists())
            file.createNewFile();
        PrintWriter pw = new PrintWriter(file);

        for (String[] strings : kalendar) {
            pw.println();
            for (String string : strings) {
               pw.print(string + "    ");
            }
        }
        pw.close();
    }
}
