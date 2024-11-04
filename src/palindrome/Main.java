package palindrome;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Solution sl1=new Solution();
        System.out.println(sl1.isPalindrome(x));

    }
}
