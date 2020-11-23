package osszegeskulonbseg;

public class OsszegEsKulonbseg {
    /*
     a metódus bekér két egész számot, majd összeadja/kivonja/összeszorozza/elosztja egymással a két számot és visszatéríti az értéket
    */  
    static int osszeg(int x, int y){  
        int sum;
        sum=x+y;
        return sum;
    }
    static int kivonas(int x, int y){  
        int sum;
        sum=x-y;
        return sum;
    }
    static int szorzas(int x, int y){  
        int szor;
        szor=x*y;
        return szor;
    }
      static int osztas(int x, int y){  
        int oszt;
        oszt=x/y;
        return oszt;
    }

    public static void main(String[] args) {
        /*
        a két egész változó létrehozása és értékadás, majd az eredmény kiírása
        */
        int a=13;
        int b=3;
        System.out.println("A két szám összege: " + osszeg(a,b)); //itt meghívom a metódust
        System.out.println("A két szám különbsége: " + kivonas(a,b)); //itt meghívom a metódust
        System.out.println("A két szám szorzata: " + szorzas(a,b)); //itt meghívom a metódust
        System.out.println("A két szám hányadosa: " + osztas(a,b)); //itt meghívom a metódust
    }
}
