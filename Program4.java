/*
Purvansh Barodia
Program 4
Write a compound interest based program to find the maturity amount of fixed deposit done in the
bank based on principal amount, rate of interest and number of years entered by the user.
*/
package program.pkg4;
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount: ");
        float p = sc.nextFloat();
        System.out.println("Enter Rate of Interest: ");
        float r = sc.nextFloat();
        System.out.println("Enter Number of Years: ");
        float n = sc.nextFloat();
        
        double Maturity_Amount = p *( Math.pow((1+(r/100)),n));
        System.out.println();
        System.out.format("Principal Amount: %.2f \nRate of Interest: %.2f \nYears: %.2f \nMaturity Amount: %.2f",p,r,n,Maturity_Amount);
/*
Enter Principal Amount: 
10000
Enter Rate of Interest: 
5
Enter Number of Years: 
3

Principal Amount: 10000.00 
Rate of Interest: 5.00 
Years: 3.00 
Maturity Amount: 11576.25        
*/

    }
    
}
