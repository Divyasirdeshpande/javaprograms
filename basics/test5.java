import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, a,b;
        System.out.println("Enter a number:");
        num =sc.nextInt();
        if (num%5==0 ) {
            System.out.println(" The number is divisible by 5");
        } else if (num %11==0) {
            System.out.println(" The number is divisible by 11");
            
        } else{
            System.out.println("The number is not divisible by 5 or 11.");
            
        }
    }
    
}
