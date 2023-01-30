public class FizzBuzz {
    public static void main (String []args) {
        for(int i = 1; i <= 200; i++) {
            if (i % 5 == 0 && i % 3 != 0)
                System.out.printf("%d -> Buzz\n", i);
            if (i % 5 != 0 && i % 3 == 0)
                System.out.printf("%d -> Fizz\n", i);
            if (i % 5 == 0 && i % 3 == 0)
                System.out.printf("%d -> FizzBuzz\n", i);
            if (i % 5 != 0 && i % 3 != 0)
                System.out.printf("%d\n", i);
        }
    }
}