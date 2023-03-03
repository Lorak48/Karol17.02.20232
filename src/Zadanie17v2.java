import java.util.Scanner;

public class Zadanie17v2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean wegetarianie = false;
        boolean weganie = false;
        boolean bezglutenowi = false;
        System.out.print("Czy któraś z osób jest na diecie wegetariańskiej? ");
        String odpowiedz = input.nextLine();
        if (odpowiedz.equalsIgnoreCase("tak")) {
            wegetarianie = true;
        }
        System.out.print("Czy któraś z osób jest na diecie wegańskiej? ");
        odpowiedz = input.nextLine();
        if (odpowiedz.equalsIgnoreCase("tak")) {
            weganie = true;
        }
        System.out.print("Czy któraś z osób jest na diecie bezglutenowej? ");
        odpowiedz = input.nextLine();
        if (odpowiedz.equalsIgnoreCase("tak")) {
            bezglutenowi = true;
        }
        System.out.println("Możecie wybrać się do następujących restauracji:");
        if (!wegetarianie || (wegetarianie && (weganie || bezglutenowi))) {
            System.out.println("Luksusowe Burgery u Jarka");
        }
        if (wegetarianie || bezglutenowi) {
            System.out.println("Pizzeria przy Dworcowej");
        }
        if (wegetarianie && weganie && bezglutenowi) {
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");
            System.out.println("Włoskie Specjały");
        } else if (wegetarianie && weganie) {
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");
        } else if (wegetarianie && bezglutenowi) {
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");
            System.out.println("Włoskie Specjały");
        } else if (weganie && bezglutenowi) {
            System.out.println("Kawiarnia na Rogu");
            System.out.println("Kuchnia u Szefa");
        }
    }

}
