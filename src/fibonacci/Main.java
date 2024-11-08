package fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Solution fibonacci = new Solution();
        System.out.println(fibonacci.fib(x));
    }
}