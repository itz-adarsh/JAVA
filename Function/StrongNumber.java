package Function;
import java.util.*;
public class StrongNumber {
    public static int fact(int num){
        if(num==0 || num==1){
            return 1;
        }
        else{
            return num*fact(num-1);
        }   
    }
    public static boolean checkStrong(int n){
        int sum=0;
        int original=n;
        while (n>0) {
            int lastDigit=n%10;
            sum=sum+fact(lastDigit); 
            n=n/10; 
        }
        if(sum==original){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(checkStrong(n)){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not a Strong number");
        }
    }
}
