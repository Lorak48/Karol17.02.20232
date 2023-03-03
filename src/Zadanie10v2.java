import java.util.Scanner;

public class Zadanie10v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę kalorii w produkcie: ");
        int kalorie = scanner.nextInt();

        System.out.print("Podaj liczbę gramów tłuszczu w produkcie: ");
        int tłuszcz = scanner.nextInt();

        int kalorieZTłuszczu = tłuszcz * 9;
        int procentTłuszczu = (kalorieZTłuszczu * 100) / kalorie;

        if (kalorieZTłuszczu > kalorie) {
            System.out.println("Błąd: Liczba kalorii pochodzących z tłuszczu nie może być większa niż łączna liczba kalorii w produkcie.");
        } else {
            System.out.printf("Procent kalorii pochodzących z tłuszczu: %d%%\n", procentTłuszczu);

            if (procentTłuszczu < 30) {
                System.out.println("Produkt jest niskotłuszczowy.");
            }
        }
    }
}
