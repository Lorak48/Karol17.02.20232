import java.util.Scanner;

public class Zadanie19 {
    public static void main(String[] args) {

        int liczbaankietowanych = 12467;
        double procentosobzjednymnapojemT = 0.14;
        double procentosobsmakcytrusu = 0.64;
        double final1 = liczbaankietowanych * procentosobzjednymnapojemT;
        double final2 = liczbaankietowanych * procentosobsmakcytrusu;

        System.out.println("przybliżona liczba ankietowanych osób, które kupują przynajmniej jeden napój \n" +
                "energetyczny tygodniowo: " + final1);

        System.out.println("przybliżona liczba ankietowanych osób, które preferują napoje energetyczne o \n" +
                "smaku cytrusowym: " + final2);


    }
}