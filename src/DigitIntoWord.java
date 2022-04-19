/*Problem Statements=>
*If Else Statement Problems
1. Read a single Digit Number and write in word

* */




import java.util.Scanner;
public class DigitIntoWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No ");
        int num = sc.nextInt();
        if(num == 0 ){
            System.out.println("You Entered zero");
        }
        else if (num == 1) {
            System.out.println("You Entered one");
        } else if (num == 2) {
            System.out.println("You Entered Two");
        }
        else if (num == 3) {
            System.out.println("You Entered Three");
        } else if (num == 4) {
            System.out.println("You Entered Four");
        } else if (num == 5) {
            System.out.println("You Entered Five");
        } else if (num == 6) {
            System.out.println("You Entered Six");
        } else if (num == 7) {
            System.out.println("You Entered Seven");
        } else if (num == 8) {
            System.out.println("You Entered Eight");
        }  else if (num == 9) {
            System.out.println("You Entered Nine");
        }
        else {
            System.out.println("Enter Valid No");
        }

    }
}
