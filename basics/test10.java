import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        char ch;
        System.out.println(" Enter any character : ");
        ch = sc.next().charAt(0);
        x=ch;
        if (x>=65 && x<=90) {
            System.out.println(" it is an uppercase alphabet");
        } else if ( x>=90 && x<=122) {
            System.out.println(" it is an lowercase character");
        } else if (x>=48 && x<=57) {
            System.out.println(" it is a digit value");
        }else{
            System.out.println(" it is a special character!");
        }
    }
    
}
