import java.util.Scanner;

public class Zadanie5v2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj masę obiektu w kilogramach:");
        double masa = scanner.nextDouble();
        double ciezar = masa * 9.8;
        System.out.println("Ciężar obiektu wynosi: " + ciezar + " N");

        if (ciezar > 1000) {
            System.out.println("Obiekt jest zbyt ciężki");
        } else if (ciezar < 10) {
            System.out.println("Obiekt jest za lekki");
        } else {
            System.out.println("Obiekt ma odpowiednią masę");
        }
    }
}
