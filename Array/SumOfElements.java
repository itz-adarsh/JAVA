package Array;

public class SumOfElements {
    public static int sumElements(int num[]){
        int sum=0;
        for(int i=0; i<num.length; i++){
            sum=sum+num[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int num[]={10,20,30,40};
        int result=sumElements(num);
        System.out.println("Sum of elements : "+result);
    }
}
