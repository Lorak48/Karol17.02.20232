import java.util.Scanner;

public class Zadanie12v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Wybierz nośnik (powietrze, woda, stal): ");
        String nosnik = input.nextLine();

        System.out.print("Podaj odległość w metrach: ");
        double odleglosc = input.nextDouble();

        double czas = 0.0;

        switch (nosnik) {
            case "powietrze":
                czas = odleglosc / 343.0;
                break;
            case "woda":
                czas = odleglosc / 1490.0;
                break;
            case "stal":
                czas = odleglosc / 5100.0;
                break;
            default:
                System.out.println("Niepoprawny nośnik.");
                System.exit(0);
        }

        System.out.printf("Czas potrzebny na pokonanie odległości w %s wynosi: %.2f s", nosnik, czas);
    }
}
