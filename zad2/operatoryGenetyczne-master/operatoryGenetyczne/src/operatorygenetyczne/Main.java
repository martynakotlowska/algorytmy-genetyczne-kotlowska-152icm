/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorygenetyczne;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // dodanie osobnikow do populacji
    public static void main(String[] args) {
        OperatoryGenetyczne operatoryGenetyczne=new OperatoryGenetyczne();
        Populacja populacja=operatoryGenetyczne.getPopulacja();
        System.out.println("funkcja fitnes() dla kazdego osobnika populacji");
        int j=1;
        ArrayList<Populacja> wszystkiePopulacje=new ArrayList<>();
        wszystkiePopulacje.add(populacja);
     //   wysPop(populacja,operatoryGenetyczne);
        ArrayList<Osobnik> osobniki =populacja.getOsobniki();
        ArrayList<int[]> newChrom=operatoryGenetyczne.krzyzowanie(osobniki.get(0).getChromosom(),osobniki.get(2).getChromosom(),2);
        ArrayList<int[]> newChrom2=operatoryGenetyczne.krzyzowanie(osobniki.get(1).getChromosom(),osobniki.get(3).getChromosom(),5);
        Populacja populacja2=new Populacja(new Osobnik[]{new Osobnik(newChrom.get(0)),new Osobnik(newChrom.get(1)),new Osobnik(newChrom2.get(0)),new Osobnik(newChrom2.get(1))});
        wszystkiePopulacje.add(populacja2);
        Populacja populacja3=new Populacja();
        for (Osobnik i:osobniki){
            Osobnik newOsobnik= new Osobnik(operatoryGenetyczne.mutacja(i.getChromosom(),5));
            populacja3.osobniki.add(newOsobnik);
        }
        wszystkiePopulacje.add(populacja3);
        int z=1;
        for (Populacja i:wszystkiePopulacje)
        {
            System.out.println("Populacja "+z+":");
            wysPop(i,operatoryGenetyczne);
            z++;
        }

    }
    // wyswietlenie osobnikow 
    public static void wysPop(Populacja populacja,OperatoryGenetyczne operatoryGenetyczne){
        populacja.getOsobniki().forEach(i->
        {
            System.out.println("Osobnik :");
            int [] chrom=null;
            chrom=i.getChromosom();
            operatoryGenetyczne.wysChrom(chrom);
            System.out.println(operatoryGenetyczne.fitness(chrom)+"\n\n\n");
        });
    }
}
