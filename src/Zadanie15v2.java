import java.util.Scanner;

public class Zadanie15v2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numChecks;
        double baseFee = 10.0, checkFee;

        System.out.print("Podaj liczbę czeków wystawionych w tym miesiącu: ");
        numChecks = input.nextInt();

        if (numChecks < 20) {
            checkFee = numChecks * 0.1;
        } else if (numChecks >= 20 && numChecks <= 39) {
            checkFee = numChecks * 0.08;
        } else if (numChecks >= 40 && numChecks <= 59) {
            checkFee = numChecks * 0.06;
        } else {
            checkFee = numChecks * 0.04;
        }

        double totalFee = baseFee + checkFee;
        System.out.printf("Opłaty za obsługę czeków w tym miesiącu wynoszą %.2f zł.\n", totalFee);

        input.close();
    }
}
