import java.util.Scanner;

public class Zadanie1v2 {
    public static void main(String[] args) {

        String[] romanNumerals = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę z przedziału od 1 do 10: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 10) {
            System.out.println("Błąd: podana liczba nie mieści się w przedziale od 1 do 10.");
        } else {
            String romanNumeral = romanNumerals[number];
            System.out.println("Liczba rzymska to: " + romanNumeral);
        }
    }
}
