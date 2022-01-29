package AOOPw1l1;

/* 
Write a function int freq(String sentence, char c) that returns the number of times the character c appears in the String sentence.
e.g. freq(“hello world”,‘l’) would return 3 because l appears twice in hello and once in world.
*/
import java.util.*;

public class Task8 {
    public static void main(String[] args){
        Scanner stringInput = new Scanner(System.in);
        System.out.println("Check the frequency of a given string");
        System.out.println("Type the sentence \n");
        String str = stringInput.nextLine().toLowerCase();
        System.out.println("Type the character you wish to test the frequency of");
        char character = stringInput.nextLine().toLowerCase().charAt(0);
        int frequency = 0;

        for(int i = 0; i < str.length(); i++){
            if(character == str.charAt(i)){
                ++frequency;
            }
        }
        System.out.println("Frequency of " + character + " is " + frequency);

    }
}
