import java.util.Scanner;
public class Zadanie11 {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);

        int wartosc;
        System.out.println("Podaj wartosc");
        wartosc = klawiatura.nextInt();
        klawiatura.nextLine();

        double procent1= wartosc*0.2;
        double procent2= wartosc*0.4;
        double cale= procent1+procent2;

        System.out.println("wartosc 1 "+ procent1);
        System.out.println("wartosc 2 "+ procent2);
        System.out.println("Calkowita wartosc"+ cale);
    }
}
