import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week_no;
        System.out.println(" Enter a week number: ");
        week_no= sc.nextInt();
        if (week_no == 1) {
            System.out.println(" It's Monday!");
        } else if (week_no == 2) {
            System.out.println(" It's Tuesday!");
        } else if (week_no == 3) {
            System.out.println(" It's Wednesday!");
        } else if (week_no==4) {
            System.out.println(" It's Thursday!");
        } else if (week_no==5) {
            System.out.println(" It's Friday!");
        } else if (week_no==6) {
            System.out.println(" It's Saturday!");
        }else if (week_no==7){
            System.out.println(" It's Sunday!");
        } else{
            System.out.println(" It is not week no.");
        } 
            
        }
    }
    


