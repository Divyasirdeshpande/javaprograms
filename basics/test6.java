import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println(" Enter a number: ");
        a = sc.nextInt();
        if (a%2==0) {
            System.out.println(" The number is even");
        } else if (a%2==1) {
            System.out.println(" The number is odd");
        }
    }
    
}
