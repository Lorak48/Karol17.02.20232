import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);

        int age;
        System.out.println("mam");
        age = klawiatura.nextInt();
        klawiatura.nextLine();
        String name;
        System.out.println("Nazywam sie");
        name = klawiatura.nextLine();
        klawiatura.nextLine();
        double annualPay;
        System.out.println("I chce zarabiac");
        annualPay = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("mam"+age+"lat");
        System.out.println("nazywam sie" + name);
        System.out.println("chce zarabiac" + annualPay);
    }
}
