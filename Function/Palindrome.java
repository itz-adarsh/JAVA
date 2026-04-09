package Function;
import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(int n){
        int rev=0;
        int original=n;
        while (n>0){ 
            int lastdigit=n%10;
            rev=rev*10+lastdigit;
             n=n/10;
        }
        if(original==rev){
            return true;
        }
       return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(isPalindrome(n)){
            System.out.println(+n+" Is Palindrome Number");
        }
    }
}
