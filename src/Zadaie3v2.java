import javax.print.attribute.HashDocAttributeSet;
import java.util.Scanner;

public class Zadaie3v2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double kg;
        System.out.println("Podaj swoja wage w kg");
        kg = klawiatura.nextInt();
        klawiatura.nextLine();
        double m;
        System.out.println("Podaj swoj wzrost w m ");
        m = klawiatura.nextInt();

        double bmi=kg/(m*2);

        if ((bmi>=18.5)&&(bmi<=25));

    }
}
