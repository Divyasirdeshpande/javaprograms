import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year,b,c;
        System.out.println(" Enter a year: ");
        year = sc.nextInt();
        if (year%4==0) {
            System.out.println(" The year is leap year. ");

            
        }else{
            System.out.println("The year is not a leap year.");
        }

    }
    
}
