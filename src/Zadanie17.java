import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);

        int rachunek;
        System.out.println("Podaj cene");
        rachunek = klawiatura.nextInt();
        klawiatura.nextLine();

        double podatek=rachunek*0.0675;
        double napiwek=rachunek*0.20;
        double cena=rachunek+podatek+napiwek;
        System.out.println();
    }
}
