package AOOPw1l1;
import java.util.*;
import java.io.*;

// Change the program in Task 3 to print only the sum or average based on whether the first line in the file is average or sum.

public class Task4 {
    public static void main(String[] args){
        int total = 0;
        int totalaverage = 0;
        String answer;
        String sum = "sum";
        String average = "average";
        List<Integer> numList = new ArrayList();

        try(Scanner readFile = new Scanner(new File("AOOPw1l1/Task4.txt"))){
            if(readFile.hasNextLine()){
                answer = readFile.nextLine();
                System.out.println(answer);

                if(answer.equals(sum)){
                    while(readFile.hasNextLine()){
                        int nextNum = readFile.nextInt();
                        numList.add(nextNum);
                    }
                    for(int i = 0; i < numList.size(); i++){
                        total += numList.get(i);
                    }
                    System.out.println(total);
                }

                else if(answer.equals(average)){
                    while(readFile.hasNextLine()){
                        int nextNum = readFile.nextInt();
                        numList.add(nextNum);
                    }
                    for(int i = 0; i < numList.size(); i++){
                        total += numList.get(i);
                    }
                    totalaverage = total / numList.size();
                    System.out.println(totalaverage);
                }
                
                else{
                    System.out.println("Didn't work");
                }
            }
            
            
        }
        catch(FileNotFoundException e){
            System.out.println("Error! File not found");
        }
    }
}
