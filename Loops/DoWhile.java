package Loops;
import java.util.*;
public class DoWhile {
    public static void main(String[] args) {
//         int counter = 0;
//         do{
//             System.out.println("Hello World");
//             counter++;
//         } while(counter<=10);


     // Break Statement - to exit the loop
     
    //  for(int i =1; i<=5; i++){
    //     if(i==3){
    //         break;
    //     }
    //     System.out.println(i);
    //  }
    //    System.out.println("I am out of the loop");


    // // print the number until it is multiple of 10

    //   Scanner sc = new Scanner(System.in);

    //   do{
    //     System.out.print("Entet your number: ");
    //     int n = sc.nextInt();
    //     if(n%10==0){
    //         break;
    //     }
    //     System.out.println(n);
    //   } while(true);
    

    // // Continue Statement  
    // for(int i =1; i<=5; i++){
    //     if(i==3){
    //         continue;
    //     }
    //     System.out.println(i);
    // }

    //Display all numbers entered by user except multiples of 10

      Scanner sc = new Scanner(System.in);
      do{
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        if(n%10==0){
            continue;
        }
        System.out.println("Number was : " +n);
      } while(true);
  }
}
