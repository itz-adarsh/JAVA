package Function;

public class BinaryToDecimal {
    public static void binToDec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;
        while (binNum>0) {
            int lastDigit=binNum%10;
            decNum=decNum+(int)(lastDigit*Math.pow(2,pow));
            binNum /= 10;
            pow++;
            
        }
        System.out.println("Decimal of "+ myNum+" = "+decNum);
    }
    public static void main(String[] args) {
        binToDec(101);
    }
}
