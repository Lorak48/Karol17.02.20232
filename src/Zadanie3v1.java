import java.util.Scanner;

public class Zadanie3v1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;

        while (number < 10 || number > 24) {
            System.out.print("Wpisz liczbę z przedziału od 10 do 24: ");
            number = input.nextInt();
        }

        System.out.println("Wprowadzona liczba:");
    }
}
