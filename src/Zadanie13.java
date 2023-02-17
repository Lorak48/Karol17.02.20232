import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int ciastka;
        System.out.println("Podaj ilosc ciastek");
        ciastka = klawiatura.nextInt();
        klawiatura.nextLine();

        double kalorie=ciastka*7.5;
        System.out.println("zjadles  "+kalorie+" kcal ");
    }
}
