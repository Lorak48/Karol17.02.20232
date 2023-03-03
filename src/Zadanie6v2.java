import java.util.Scanner;

public class Zadanie6v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę sekund: ");
        int seconds = scanner.nextInt();

        int minutes = seconds / 60;
        int hours = seconds / 3600;
        int days = seconds / 86400;

        if (days > 0) {
            System.out.printf("%d sekund to %d dni, %d minut i %d sekund\n", seconds, days, minutes % 60, seconds % 60);
        } else if (hours > 0) {
            System.out.printf("%d sekund to %d godzin, %d minut i %d sekund\n", seconds, hours, minutes % 60, seconds % 60);
        } else if (minutes > 0) {
            System.out.printf("%d sekund to %d minut i %d sekund\n", seconds, minutes, seconds % 60);
        } else {
            System.out.printf("%d sekund to %d sekund\n", seconds, seconds);
        }
    }
}
