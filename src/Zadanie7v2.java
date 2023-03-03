import java.util.*;

public class Zadanie7v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[3];

        System.out.println("Podaj trzy imiona:");

        for (int i = 0; i < 3; i++) {
            names[i] = input.nextLine();
        }

        Arrays.sort(names);

        System.out.println("Posortowane imiona:");
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
        }
    }
}
