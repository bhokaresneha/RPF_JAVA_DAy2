/*Problem  Statement=>
*Programs With While Loop
1. Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
* */

import java.util.Scanner;

public class SumOfNaturalNoUsingWhileloop
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter the positive Integer ");
        n=sc.nextInt();
        int x=1;
        while(x <= n)
        {
            sum = sum + x;
          //  System.out.print(x+ "+");
            x++;
        }
        System.out.println();
        System.out.println("Sum Of Natural Numbers is =>"+sum);

    }

}
