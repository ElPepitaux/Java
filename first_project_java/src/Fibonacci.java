public class Fibonacci {
    public static void main (String[]args) {
        int nb = Integer.parseInt(args[0]);
        int rec = recursiveFibonacci(10);
        int it = iterativeFibonacci(10);
        System.out.printf("Suite de fibonacci %d\n", 10);
        System.out.printf("Recursive: %d\n", rec);
        System.out.printf("Iterative: %d\n", it);
    }
    public static int recursiveFibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
    public static int iterativeFibonacci(int n) {
        int v = 0;
        int x = 1;
        int tmp;
        for (int i = 1; i <= n; i++) {
            tmp = v;
            v = x;
            x = tmp + x;
        }
        return v;
    }
}