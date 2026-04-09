package Array;

public class CountOneZero {
    public static void oneZeroCount(int numbers[]){
        int oneCount=0;
        int zeroCount=0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==0){
                zeroCount++;
            }
            if(numbers[i]==1){
                oneCount++;
            }
        } 
        System.out.println("Numbers of 0s : "+zeroCount);
        System.out.println("Number of 1s : "+oneCount);
    }
    public static void main(String[] args) {
        int numbers[]={1,0,1,1,0,1,0,0};
        oneZeroCount(numbers);
    }
}
