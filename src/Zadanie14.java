import java.util.Scanner;

public class Zadanie14 {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int ocena1;
        System.out.println("Podaj ocene");
        ocena1 = klawiatura.nextInt();
        klawiatura.nextLine();
        int ocena2;
        System.out.println("Podaj ocene");
        ocena2 = klawiatura.nextInt();
        klawiatura.nextLine();
        int ocena3;
        System.out.println("Podaj ocene");
        ocena3 = klawiatura.nextInt();
        klawiatura.nextLine();


        double srednia=ocena1+ocena2+ocena3;
        double srednia1=srednia/3;
        System.out.println("Ocena 1"+ocena1+" ;0");
        System.out.println("Ocena 1"+ocena2+" ;0");
        System.out.println("Ocena 1"+ocena3+" ;0");
        System.out.println("Masz srednia"+srednia1+" ;0");

    }
}
