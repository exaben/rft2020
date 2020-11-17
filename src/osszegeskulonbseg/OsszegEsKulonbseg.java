/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osszegeskulonbseg;

/**
 *
 * @author Bence
 */
public class OsszegEsKulonbseg {
    /*
    a metódus bekér két egész számot, majd összeadja és visszatéríti az összeget
    */  
    static int osszeg(int x, int y){  
        int sum;
        sum=x+y;
        return sum;
    }

  
    public static void main(String[] args) {
        /*
        a két egész változó létrehozása és értékadás, majd az eredmény kiírása
        */
        int a=13;
        int b=3;
        System.out.println("A két szám összege: " + osszeg(a,b)); //itt meghívom a metódust
    }
    
}
