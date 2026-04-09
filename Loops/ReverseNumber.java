package Loops;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // while(num>0){
        //    int lastDigit = num%10;
        //    System.out.print(lastDigit);
        //    num = num/10;
        // }
        // System.out.println();

      // Reverse the given number 
      int num = 10899;
      int rev = 0;
      while(num>0){
        int lastDigit = num%10;
        rev = (rev*10) + lastDigit;
        num=num/10;
      }
        System.out.println(rev);
    }
}
