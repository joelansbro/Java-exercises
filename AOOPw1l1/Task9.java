package AOOPw1l1;

/*
Using your freq function create a loop that prints out how many time each character in the alphabet appears in a string.
*/

import java.util.*;

public class Task9{  
     public static void main(String[] args) {  
        Scanner stringInput = new Scanner(System.in);
        System.out.println("Type the sentence \n");
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
}