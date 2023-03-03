import java.util.Scanner;

public class Zadanie11v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nazwiska = new String[3];
        int[] czasy = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Podaj nazwisko " + (i + 1) + ". biegacza: ");
            nazwiska[i] = scanner.nextLine();

            System.out.print("Podaj czas ukończenia biegu przez " + nazwiska[i] + " (w minutach): ");
            czasy[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int i = 0; i < 2; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (czasy[i] > czasy[j]) {
                    int temp = czasy[i];
                    czasy[i] = czasy[j];
                    czasy[j] = temp;

                    String temp2 = nazwiska[i];
                    nazwiska[i] = nazwiska[j];
                    nazwiska[j] = temp2;
                }
            }
        }

        System.out.println("Kolejność na mecie:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + nazwiska[i]);
        }
    }
}
