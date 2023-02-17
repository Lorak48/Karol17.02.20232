import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double kwotapoczatkowa;
        System.out.println("Podaj kwote poczatkowo zdeponowana na koncie: ");
        kwotapoczatkowa = klawiatura.nextDouble();

        double rocznastopa;
        System.out.println("Podaj roczna stope oprocentowania: ");
        rocznastopa = klawiatura.nextDouble();

        double kapitalizacjaodsetek;
        System.out.println("Podaj ile razy w roku odsetki są kapitalizowane (np. przy kapitalizacji miesięcznej wpisz 12, \n" +
                "a przy kapitalizacji kwartalnej — 4)");
        kapitalizacjaodsetek = klawiatura.nextDouble();

        int liczbalat;
        System.out.println("Podaj liczbe lat przez jakie środki będą znajdować się na koncie i generować odsetki");
        liczbalat = klawiatura.nextInt();

        double RnaN = rocznastopa / kapitalizacjaodsetek;
        double RnaN1 = RnaN + 1;
        double NrazyTpotegaa = kapitalizacjaodsetek * liczbalat;
        double power = Math.pow(RnaN1, NrazyTpotegaa);
        double kwotaiipotega = kwotapoczatkowa * power;

        System.out.println("Po " + liczbalat + " latach na koncie znajdzie sie: " + kwotaiipotega);

    }
}