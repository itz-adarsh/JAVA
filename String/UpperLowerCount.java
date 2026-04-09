package String;

public class UpperLowerCount {
    public static int upperLowerCount(String str){
        int upperCount = 0;
        int lowerCount = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                lowerCount++;
            }
            else if(ch>='A' && ch<='Z'){
            upperCount++;
            }
        }
        System.out.println(upperCount);
        return lowerCount;
    }
    public static void main(String[] args) {
        String str = "adrSHKumaR";
        System.out.println(upperLowerCount(str));
    }
}
