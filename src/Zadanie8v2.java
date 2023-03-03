import java.util.Scanner;

public class Zadanie8v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę zakupionych pakietów: ");
        int liczbaPakietow = scanner.nextInt();

        double cenaPakietu = 99.0;
        double cenaPoRabacie = 0.0;
        int rabat = 0;

        if (liczbaPakietow >= 10 && liczbaPakietow <= 19) {
            rabat = 20;
        } else if (liczbaPakietow >= 20 && liczbaPakietow <= 49) {
            rabat = 30;
        } else if (liczbaPakietow >= 50 && liczbaPakietow <= 99) {
            rabat = 40;
        } else if (liczbaPakietow >= 100) {
            rabat = 50;
        }

        cenaPoRabacie = cenaPakietu * liczbaPakietow * (100 - rabat) / 100.0;

        System.out.println("Rabat: " + rabat + "%");
        System.out.println("Łączna kwota po rabacie: " + cenaPoRabacie + " zł");
    }
}
