import java.util.Scanner;

public class Zadanie16v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int purchasedBooks;
        int points = 0;

        System.out.print("Podaj liczbę zakupionych książek w tym miesiącu: ");
        purchasedBooks = scanner.nextInt();

        switch (purchasedBooks) {
            case 0:
                points = 0;
                break;
            case 1:
                points = 5;
                break;
            case 2:
                points = 15;
                break;
            case 3:
                points = 30;
                break;
            default:
                points = 60;
                break;
        }

        System.out.println("Liczba przyznanych punktów: " + points);
    }
}
