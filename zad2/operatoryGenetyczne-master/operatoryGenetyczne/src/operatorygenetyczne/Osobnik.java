/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorygenetyczne;
import java.util.List;
import java.util.Random;

/**
 *
 * @author marty
 */


public class Osobnik {
   int [] chromosom;
    public Osobnik() {
        // tworzenie osobnikow o 10 genach randomowych
        this.chromosom=new int[10];
        Random generator =new Random();
        for(int i=0;i<chromosom.length-1;i++)
        {
        chromosom[i]=generator.nextInt(100);
        }
    }

    public Osobnik(int[] chromosom) {
        this.chromosom = chromosom;
    }

    public int[] getChromosom() {
        return chromosom;
    }
}