package palindrome;

public class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        int b=0;
        while (x>0){
            b=b*10+x%10;
            x/=10;  //x=x/10

        }
        return a==b;
    }


}
