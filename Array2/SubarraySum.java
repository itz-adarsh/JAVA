package Array2;
import java.util.*;
public class SubarraySum {
    public static void sumSubarry(int numbers[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
               currentSum=0;
                for(int k=i; k<=j; k++){
                    currentSum +=numbers[k];
                }
                System.out.println(currentSum);
                if(maxSum<currentSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("Max Sum = "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        sumSubarry(numbers);
    }
}
