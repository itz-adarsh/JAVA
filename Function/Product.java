package Function;
import java.util.*;
public class Product {
    public static int calculateProduct(int num1,int num2){
        int multiply=num1*num2;
            return multiply;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int  result=calculateProduct(a,b);
            System.out.println("Product of "+a +" and "+b +" is :"+result);
    }
}
