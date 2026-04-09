package CoditionalStatement;

public class LargestOfThree {
    public static void main(String[] args) {
       int A = 4, B = 6, C = 3;
    if((A>=B) && (A>=C)){
        System.out.println("Largest is A");
    }
    else if(B>=C){
        System.out.println("Largest is B");
    }
    else{
        System.out.println("Largest is C");
    } 
    } 
}
