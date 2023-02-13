import java.util.Scanner;

public class Code {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("enter number of equ ");
        int j = scanner.nextInt();
        int fE = fibonachiEque(j);
        System.out.println(fE);
        int k = scanner.nextInt();
        int fact = factorials(k);
        System.out.println(fact);

    }


    public static int fibonachiEque(int j) {
        int fibonachiEque = 0;
        for (int i = 1; i < j; i++) {
            fibonachiEque +=  i;
        }
        return fibonachiEque;
    }

    public static int factorials(int k) {
        int fact = 1;
        for (int i = 2; i <= k; i++) {
            fact *= i;

        }

        return fact;
    }
}