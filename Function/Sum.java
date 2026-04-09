package Function;
import java.util.*;
public class Sum {
    public static int calculateSum(int a, int b){  // parameters or formal parameters
        return a+b;
    }
    public static int calculateSum(int a,int b,int c){
        return a+b+c;
    }
    public static float calculateSum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
       
        System.out.println(calculateSum(3,5)); // arguments or actual parameters
        System.out.println(calculateSum(3,5,8));
        System.out.println(calculateSum(3.2f,4.8f));
    }
}
// Above is also example of function overloading