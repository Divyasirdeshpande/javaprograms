import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length, inches, feet;
        System.out.println(" Enter length in meter:");
        length = sc.nextDouble();
        inches = length*12;
        feet = length*3.28084;
        System.out.println(" The length in inches:"+inches);
        System.out.println("The length in feet: "+feet);

    }
    
}
