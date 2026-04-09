package String;
import java.util.*;
public class Palindrome {
    public static boolean checkPalindrome(String str){
        // int n = str.length();
        // for(int i=0; i<str.length()/2; i++){
        //     if(str.charAt(i) != str.charAt(n-1-i));
        //         return false;
        // }
        // return true;
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(checkPalindrome(str)){
            System.out.println("Palindrome");
        }
    }
}
