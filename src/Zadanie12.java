import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int kilometry;
        System.out.println("Podaj kilometry");
        kilometry = klawiatura.nextInt();
        klawiatura.nextLine();

        int litry;
        System.out.println("Podaj litry");
        litry = klawiatura.nextInt();
        klawiatura.nextLine();

        double kilometrynalitrze=kilometry/litry;
        System.out.println("Na litrze przjechales "+ kilometrynalitrze);
    }
}
