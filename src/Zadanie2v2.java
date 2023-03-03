import java.util.Scanner;

public class Zadanie2v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dzień: ");
        int day = scanner.nextInt();
        System.out.print("Podaj miesiąc (w formie liczby): ");
        int month = scanner.nextInt();
        System.out.print("Podaj dwie ostatnie cyfry roku: ");
        int year = scanner.nextInt();

        int product = day * month;

        if (product == year) {
            System.out.println("Data jest magiczna!");
        } else {
            System.out.println("Data nie jest magiczna.");
        }
    }
}
