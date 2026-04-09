package String;

public class Substring {
    public static String substring(String str, int start, int end){
        String substr = "";
        for(int i=start; i<end; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(str.substring(0,5)); // inbuilt function for substring
        System.out.println(substring(str, 0, 5));
    }
}
