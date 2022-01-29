package AOOPw1l1;

/*
Instead of using a hardcoded string extend your program so it reads the contents of file called message.txt and prints the frequency of each character in the alphabet.
*/


import java.util.*;
import java.io.*;

public class Task10{  
     public static void main(String[] args) {  
         try{
            File textList = new File("AOOPw1l1/task10.txt");
            Scanner stringInput = new Scanner(textList);
            String str = stringInput.nextLine().toLowerCase();
    
            int[] freq = new int[str.length()];  
            int i, j;  
              
            //Converts given string into character array  
            char string[] = str.toCharArray();  
              
            for(i = 0; i <str.length(); i++) {  
                freq[i] = 1;  
                for(j = i+1; j <str.length(); j++) {  
                    if(string[i] == string[j]) {  
                        freq[i]++;  
                          
                        //Set string[j] to 0 to avoid printing visited character  
                        string[j] = '0';  
                    }  
                }  
            }  
              
            //Displays the each character and their corresponding frequency  
            System.out.println("Characters and their corresponding frequencies");  
            for(i = 0; i <freq.length; i++) {  
                if(string[i] != ' ' && string[i] != '0')  
                    System.out.println(string[i] + "-" + freq[i]);  
            } 
         }
         catch(FileNotFoundException e){
             System.out.println("Error! File not found");
         }
         
    }  
}