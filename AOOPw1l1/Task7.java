package AOOPw1l1;

/* 
Write a java function called isPrime that takes an int and return a boolean indicating whether than number is prime.
Test the function by printing all the prime number between 2 and 10000.
*/
import java.util.*;

public class Task7 {
    
    public static void main(String[] args){
        Scanner numInput = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime");
        int num = numInput.nextInt();
        System.out.println("It is " + isPrime(num) + " that " + num + " is prime");
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
 }

}
