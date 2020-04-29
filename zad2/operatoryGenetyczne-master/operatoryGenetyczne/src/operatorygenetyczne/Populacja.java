/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorygenetyczne;

import java.util.ArrayList;

/**
 *
 * @author marty
 */
public class Populacja {
    
    //dodawanie osobnikow do populacji
    public ArrayList<Osobnik> osobniki;

    public Populacja() {
        this.osobniki=new ArrayList<Osobnik>();
    }

    public Populacja(Osobnik [] os)
    {
        this.osobniki=new ArrayList<Osobnik>();
        for(Osobnik i:os)
            osobniki.add(i);
    }

    public ArrayList<Osobnik> getOsobniki(){
    return osobniki;
    }
}
