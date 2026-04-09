package Loops;
import java.util.*;
public class ForLoop {
    public static void main(String[] args) {
        // for(int i=1; i<=10; i++){
        //     System.out.println("Hello World");
        // }


        // Print square pattern

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
   // or
        int line = 1;
        while ((line<=4)){
            System.out.println("****");
            line++;
        }

    }
}
