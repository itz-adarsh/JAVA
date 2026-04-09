package Function;
import java.util.*;
public class SumOfDigit {
    public static int digitSum(int n){
        int sum=0;
        while (n>0){
            int lastDigit=n%10;
            sum=sum+lastDigit;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=digitSum(n);
        System.out.println("Sum of digits of number is : "+result);
    }
}
