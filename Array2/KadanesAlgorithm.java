package Array2;
import java.util.*;
public class KadanesAlgorithm {
    public static void maxSubarraySum(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            currSum +=numbers[i];

            // maxSum=Math.max(currSum,maxSum);
            if(maxSum<currSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        System.out.println("Max Subarray Sum is : "+maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        maxSubarraySum(numbers);
    }
}





// //-----------------------
// // if we update the currSum first then it will return 0 when all elements are negative so we have to store the maxElement of array beacuse maxElement will be the maxSum of subaaray
//     if(numbers[i]>maxElement){
//         maxElement=numbers[i];
//     }
//     if(currSum<0){
//             currSum=0;
//     }
//     if(maxSum<currSum){
//         maxSum=currSum;
//     }
//     if(maxSum==0){
//         maxSum=maxElement;
//     }

