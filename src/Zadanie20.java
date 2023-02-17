import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double cukier = 1.5;
        double maslo = 1;
        double maka = 2.75;

        int oczekiwania;
        System.out.println("Podaj oczekiwaną liczbe ciastek: ");
        oczekiwania = klawiatura.nextInt();
        double cukier1 = cukier / 48;
        double maslo1 = maslo / 48 ;
        double maka1 = maka / 48;


        double oczekiwaniaCukier = cukier1 * oczekiwania;
        double oczekiwaniaMaslo = maslo1 * oczekiwania;
        double oczekiwaniaMaka = maka1 * oczekiwania;
        System.out.println("Oczekiwana liczba szklanek na " + oczekiwania + " ciastek to: " + oczekiwaniaCukier +" cukru "+ oczekiwaniaMaslo +" masla "+ oczekiwaniaMaka + " maki");

    }
}