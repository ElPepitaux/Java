import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.Scanner;

public class GuessANumber {
    public static void main (String []args) {
        int nb = (RandomGenerator.getDefault().nextInt(0, 100));
        Scanner scan = new Scanner(System.in);
        System.out.print("Your guess ? ");
        int tries = 0;
        while (scan.hasNext()) {
            int guess = scan.nextInt();
            if (nb == guess)
                break;
            if (nb > guess)
                System.out.println("Too low!");
            else
                System.out.println("Too higth!");
            tries += 1;
            System.out.print("Your guess ? ");
        }
        System.out.printf("It took you % tries.", tries);
    }
}