package Array;
import java.util.*;
public class ArrayBasics {
    public static void main(String[] args) {
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);

        System.out.println("Length of array = "+marks.length);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("Phy : "+marks[0]);
        System.out.println("Chem : "+marks[1]);
        System.out.println("Math : "+marks[2]);
        // marks[2]=100;
        // System.out.println("Math : "+marks[2]);

        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage = "+percentage+"%");
        
        // // Taking user input in array
        // int n=sc.nextInt();
        // int arr[]=new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i]=sc.nextInt();
        // }
        // for(int i=0; i<n; i++){
        //     System.out.print(arr[i]+" ");
        // }
    
    }
}
