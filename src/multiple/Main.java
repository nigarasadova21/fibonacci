package multiple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Solution multiple=new Solution();
        System.out.println(multiple.smallestEvenMultiple(n));
    }


}

