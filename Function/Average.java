package Function;
import java.util.*;
public class Average {
    public static float calAvg(int a,int b,int c){
        float avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        float result=calAvg(a,b,c);
        System.out.println(result);
    }
}
