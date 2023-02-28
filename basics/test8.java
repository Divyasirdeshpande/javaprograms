import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        char ch;
        System.out.println(" enter any character:");
        ch = sc.next().charAt(0);
        x = ch;
        if (x>=65 && x<=90) {
            System.out.println(" It is a uppercase character");
        } else if (x>=97 && x<=122) {
            System.out.println(" It is lowercase character");
        }else if (x>=48 && x<=57) {
            System.out.println(" It is an integer value");
        }else{
            System.out.println(" I don't know this character ");
        }    
    }
}
