package Array;
import java.util.*;
public class LinearSearch {
    public static int linearSearch(int numbers[], int key){
        for(int i=0 ; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int linearSearch(String menu[], String find){
        for(int i=0; i<menu.length; i++){
            if(menu[i].equals(find)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        String menu[]={"dosa","idli","puri","chole"};
        String find="puri";
        int key=10; 
        int index=linearSearch(numbers, key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Key is at index : "+index);
        }

        int index1=linearSearch(menu, find);
        if(index1==-1){
            System.out.println("Not Present in the menu");
        }
        else{
            System.out.println("Present in the menu at : "+index1);
        }
    }
    
}
