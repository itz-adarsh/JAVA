/*
variable = condition?statement1 : statement2
e.g. 
int larger = (5>3)?5:3
String type = (5%2==0)?"Even" : "Odd";

 */

package CoditionalStatement;

public class TernaryOperator {
    public static void main(String[] args) {
      int number = 4;
      String Type = (number%2==0)?"Even":"Odd";
      System.out.println(Type);

      int marks = 56;
      String status = (marks>=33)?"Pass":"Fail";
      System.out.println(status);
    }
}
