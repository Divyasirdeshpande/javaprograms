import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,reverse,remainder,d,e;
        System.out.println(" Enter three digit number: ");
        a = sc.nextInt();
        reverse =0;
        while (a !=0) {
            remainder = a%10;
            reverse = reverse*10+remainder;
            a =a/10;
            
        }
        System.out.println("Reverse of given number is "+reverse);


    }
    
}
