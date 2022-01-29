package AOOPw1l1;

/* 
The factorial of a number x is the product of the numbers 1 to x. The factorial operation is denoted by an ! mark.
Eg the factorial of 5 = 5! = 54321 = 120.
7! = 5040.

Write a function in java called factorial that takes an integer and return the factorial of that number.
*/
import java.util.*;

public class Task6 {

    
    public static void main(String[] args){
        Scanner numInput = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial");
        int num = numInput.nextInt();

        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " is " + factorial);
    }
    public static long multiplyNumbers(int num){
        if (num >= 1){
            return num * multiplyNumbers(num - 1);
        } else {
            return 1;
        }
    }
}
