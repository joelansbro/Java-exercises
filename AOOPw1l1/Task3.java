package AOOPw1l1;

import java.util.*;
import java.io.*;

// Change from the program from Task 2 to read in a series of numbers from a file called numbers.txt and then prints out the sum and average of the numbers

public class Task3 {
    public static void main(String[] args){
        try{
            File textList = new File("AOOPw1l1/task3.txt");
            Scanner numInput = new Scanner(textList);
            List<Integer> numList = new ArrayList();
            
            while(numInput.hasNextLine()){
                int nextNum = numInput.nextInt();
                numList.add(nextNum);
            }
            int total = 0;
            for(int i = 0; i < numList.size(); i++){
                total += numList.get(i);
            }
            System.out.println(total);
        }
        catch (FileNotFoundException e){
            System.out.println("Error! File Not Found");
        }
    }
}