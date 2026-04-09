package Pattern;
import java.util.*;
public class HollowRectangle {
   
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int rowCount=sc.nextInt();
    int colCount=sc.nextInt();
        for(int i=1; i<=rowCount; i++){
            if(i==0 || i==rowCount-1){
                for(int j=1; j<=colCount; j++){
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");
                for(int space=1; space<=colCount-1;i++){
                    System.out.print("*");
                }
                System.out.print("*");
            }
            System.out.println();
        }
   } 
}
