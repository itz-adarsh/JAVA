/*
Conversion happens when:
a. type compatible
b. destination type > source type 

it is also called as widening conversion and implicit conversion

byte->short->int->float->long->double
 */
import java.util.*;
public class TypeConvrersion {
    public static void main(String[] args) {
        int a =25;
        long b = a;

        // long c = 10;
        // int  d = c ; // long to int is not allowed because of destination size is smaller than source size 
        System.out.println(b);

        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);
    }
}
