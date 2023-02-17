import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);

        String miasto;
        System.out.println("Podaj nazwe miasta");
        miasto = klawiatura.nextLine();
        klawiatura.nextLine();

        char result = miasto.charAt(0);
        System.out.println(result);
        System.out.println(miasto.toUpperCase());
        System.out.println(miasto.toLowerCase());

    }
}
