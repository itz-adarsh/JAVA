package Loops;
import java.util.*;
public class WhileLoop {
    public static void main(String[] args) {
        // int counter = 0;
        // while(counter<100){
        //     System.out.println("Hello World!");
        //     counter++;
        // }

        // print from 1 to 10

        // int counter = 1;
        // while(counter<=10){
        //     System.out.println(counter);
        //     counter++;
        // }

        // // print from 1 to n
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int counter = 1;
        // while(counter<=n){
        //     System.out.print(counter + " ");
        //     counter++;
        // }
        // System.out.println();

        // Print sum of first n natural numbers

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum is : " + sum);
    }
}
