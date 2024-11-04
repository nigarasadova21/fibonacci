import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num= scanner.nextInt();
        if(num == 1) {
            System.out.println(1);
            return;
        }
        int num1=0,num2=1, num3=0;
        for(int i=1; i<num; i++) {
            num3=num2+num1;
            num1=num2;
            num2=num3;
        }
        System.out.println(num3);
        scanner.close();
    }
}

//(2)


//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        int n= scanner.nextInt();
//        int a=0;
//        boolean ispalindrome=true;
//        for (int i = 0; i < n; i++) {
//
//        }

