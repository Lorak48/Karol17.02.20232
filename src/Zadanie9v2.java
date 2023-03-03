import java.util.Scanner;

public class Zadanie9v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wagę przesyłki w kilogramach: ");
        double waga = scanner.nextDouble();

        System.out.print("Podaj odległość w kilometrach: ");
        double odleglosc = scanner.nextDouble();

        double koszt;

        if (waga <= 1) {
            koszt = 1.1;
        } else if (waga <= 3) {
            koszt = 2.2;
        } else if (waga <= 5) {
            koszt = 3.7;
        } else {
            koszt = 3.8;
        }

        koszt *= Math.ceil(odleglosc / 500);

        System.out.println("Koszt przesyłki: " + koszt + " zł");
    }
}
