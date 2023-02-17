import java.util.Scanner;

public class zadanie18 {
    public static void main(String[] args) {

        int iloscakcji = 600;
        double cenazakcji = 21.77;
        double prowizaja = 0.02;
        double cenaakcji = cenazakcji * iloscakcji;
        double cenazprowizja = cenaakcji * prowizaja;
        double cenazprowizja2 = cenazprowizja + cenaakcji;

        System.out.println("laczna cena bez prowizji to: " + cenaakcji + " ilosc prowizji to 2% " + "cena z prowizja " + cenazprowizja2);
    }
}