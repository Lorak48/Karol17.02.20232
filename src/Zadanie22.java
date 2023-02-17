import java.util.Scanner;

public class Zadanie22 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int akcja;
        System.out.println("ile akcji kupiles ");
        akcja = klawiatura.nextInt();
        klawiatura.nextLine();
        double kupno=akcja*32.87;
        double prowizja=kupno*0.2;
        double sprzedaz=akcja*33.92;
        double prowizja2=sprzedaz*0.2;
        double koszty=prowizja2+prowizja;
        double czy=koszty-sprzedaz;

        System.out.println("za akcje zaplacil "+kupno);
        System.out.println("prowizja to "+prowizja);
        System.out.println("za akcje dostal "+sprzedaz);
        System.out.println("prowizja to "+prowizja2);
        System.out.println("ostateczny wynik "+czy);


    }
}