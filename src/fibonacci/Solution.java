package fibonacci;

public class Solution {
    public int fib(int num) {

        if (num == 1) {
            return 1;
        }

        int num1 = 0, num2 = 1, num3 = 0;
        for (int i = 1; i < num; i++) {
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }

        return num3;
    }
}
