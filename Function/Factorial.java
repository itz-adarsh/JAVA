package Function;
import java.util.*;
public class Factorial {
    public static int calculateFactorial(int num){
         int f=1;
        for(int i=1; i<=num; i++){
            f=f*i;
        }
            return f;
    //    if(num==0 || num==1){
    //     return 1;
    //    }
    //    else{
    //     return num*calculateFactorial(num-1);
    //    }
    }

    public static int binCoeff(int n,int r){
        int fact_n=calculateFactorial(n);
        int fact_r=calculateFactorial(r);
        int fact_nmr=calculateFactorial(n-r);
        int binCoeff=fact_n/(fact_r*fact_nmr);
        return binCoeff;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int result=calculateFactorial(n);
        int result1=binCoeff(n,r);
        System.out.println("Factorial of "+n+" is : "+result);
        System.out.println("Binomial Coeffiecient of "+n+" and "+r+" is : "+result1);
    }
}
