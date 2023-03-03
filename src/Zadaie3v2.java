import java.util.Scanner;

public class Zadaie3v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wagę w kilogramach: ");
        double weight = scanner.nextDouble();
        System.out.print("Podaj wzrost w metrach: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Twoja waga jest optymalna.");
        } else if (bmi < 18.5) {
            System.out.println("Masz niedowagę.");
        } else {
            System.out.println("Masz nadwagę.");
        }
    }
}

