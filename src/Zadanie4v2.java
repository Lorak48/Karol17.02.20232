import java.util.Scanner;

public class Zadanie4v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wynik z pierwszego testu:");
        double wynik1 = scanner.nextDouble();
        System.out.println("Podaj wynik z drugiego testu:");
        double wynik2 = scanner.nextDouble();
        System.out.println("Podaj wynik z trzeciego testu:");
        double wynik3 = scanner.nextDouble();

        double srednia = (wynik1 + wynik2 + wynik3) / 3;
        System.out.println("Średnia wyników testów: " + srednia);

        int ocena = 0;
        if (srednia >= 90 && srednia <= 100) {
            ocena = 5;
        } else if (srednia >= 80 && srednia <= 89) {
            ocena = 4;
        } else if (srednia >= 70 && srednia <= 79) {
            ocena = 3;
        } else if (srednia >= 60 && srednia <= 69) {
            ocena = 2;
        } else {
            ocena = 1;
        }
        System.out.println("Ocena: " + ocena);

        System.out.println("Podaj masę obiektu w kilogramach:");
        double masa = scanner.nextDouble();
        double ciezar = masa * 9.8;
        if (ciezar > 1000) {
            System.out.println("Obiekt jest zbyt ciężki.");
        } else if (ciezar < 10) {
            System.out.println("Obiekt jest za lekki.");
        } else {
            System.out.println("Ciężar obiektu: " + ciezar + " niutonów.");
        }
    }
}
