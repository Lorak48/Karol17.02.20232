import java.util.Scanner;
public class Zadanie8 {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        int p1;
        System.out.println("podaj 1 wymiar");
        p1 = klawiatura.nextInt();
        klawiatura.nextLine();

        int p2;
        System.out.println("podaj 2 wymiar");
        p2 = klawiatura.nextInt();
        klawiatura.nextLine();

        int p3;
        System.out.println("podaj 3 wymiar");
        p3 = klawiatura.nextInt();
        klawiatura.nextLine();

        int p4;
        System.out.println("podaj 4 wymiar");
        p4 = klawiatura.nextInt();
        klawiatura.nextLine();



        int pcalkowite= p1+p2+p3+p4;
        int jedna=pcalkowite /4;

        System.out.println("powierzchnia 1"+ p1);
        System.out.println("powierzchnia 2"+ p2);
        System.out.println("powierzchnia 3"+p3);
        System.out.println("powierzchnia 4"+p4);
        System.out.println("powierzchnia calkowita  "+pcalkowite);
        System.out.println("powierzchnia na jedna osobe  "+jedna);


        p1 = klawiatura.nextInt();






    }
}