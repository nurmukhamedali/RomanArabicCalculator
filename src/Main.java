import java.util.Scanner;

public class Main {
    public static void testNumeralSystem(){
        Scanner scn = new Scanner(System.in);
        boolean hasError = false;
        while (!hasError){
            String[] numeral = scn.nextLine().split(",");
            String result = NumeralSystem.ArabicToRoman(Integer.parseInt(numeral[0]));
            if(result.equals(numeral[1])){
                boolean equality = Integer.parseInt(numeral[0]) == NumeralSystem.RomanToArabic(result);
                if (equality)
                    System.out.println(true);
                else {
                    hasError = true;
                    System.out.println("Is " + numeral[1] + ": " + NumeralSystem.RomanToArabic(result) + " == " + numeral[0] + "?");
                }
            } else {
                hasError = true;
                System.out.println("Is " + numeral[0] + ": " + result + " == " + numeral[1] + "?");
            }
        }
    }
    public static void main(String[] args) {
        String x = NumeralSystem.ArabicToRoman(6);
        String y = NumeralSystem.ArabicToRoman(6);

        RomanArabic xr = new RomanArabic(x);
        RomanArabic yr = new RomanArabic(x);

        RomanArabic result = BinaryOperation.ADD.execute(xr, yr);

        System.out.println(result.getRomanValue());
    }

}
