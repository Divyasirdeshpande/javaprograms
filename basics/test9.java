import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        char ch;
        System.out.println(" Enter any alphabet: ");
        ch = sc.next().charAt(0);
        x = ch;
        if (x == 'a' || x=='e' || x=='i' || x=='o'|| x=='u'|| x=='A'|| x=='E' || x=='O' || x=='I' || x=='U') {
            System.out.println(" it is vowel");
        } else {
            System.out.println(" it is consonant");
            
        }
    }
}
