package AOOPw1l1;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

//Write a program that reads 10 numbers from the user and prints out the sum and average of the numbers.

public class Task2 {
    public static void main(String[] args){
        List<Integer> numList = new ArrayList();
        Scanner numInput = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.println("Enter number "+ i);
            int nextNum = numInput.nextInt();
            numList.add(nextNum);
        }
        int total = 0;
        for(int i = 0; i < numList.size(); i++){
            total += numList.get(i);
        }
        System.out.println(total);

    }

}
