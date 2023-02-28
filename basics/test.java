import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e,f;
        System.out.println("Enter three digit number: ");
        a = sc.nextInt();
        b = a/100;
        c = a%100;
        d = c/10;
        e = c%10;
        f = b+d+e;
        System.out.println(f);

    }
}