import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args){
    Scanner klawiatura = new Scanner(System.in);

    int dysk;
    System.out.println("Wprowadz cene dysku");
    dysk = klawiatura.nextInt();
    klawiatura.nextLine();

    double zysk=dysk*0.4;
    System.out.println("Zysk to "+zysk);
    }
}
