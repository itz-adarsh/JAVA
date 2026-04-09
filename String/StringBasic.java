package String;
import java.util.*;
public class StringBasic {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");
        
        // string are immutable
        // taking user input
        // Scanner sc = new Scanner(System.in);
        // String name;
        // // name = sc.next(); // will take only single word not after spaces
        // name = sc.nextLine();
        // System.out.println(name);

        // // Length of string 
        // String fullName = "Adarsh Kumar";
        // System.out.println(fullName.length());

        // Concatenation
        String firstName = "Adarsh";
        String lastName = "Kumar";
        // String name= firstName.concat(lastName);
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // // charAt() method == to find the letter at any index
        // System.out.println(fullName.charAt(0));

        printLetters(fullName);

    }
}
