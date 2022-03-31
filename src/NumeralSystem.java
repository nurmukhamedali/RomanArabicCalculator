import java.util.ArrayList;
import java.util.HashMap;

public class NumeralSystem {
    public static String ArabicToRoman(int number) {
        if (number < 1 || number > 3999)
            return "Invalid Roman Number Value";
        String s = "";
        for (RomanNumeralSymbol digit: RomanNumeralSymbol.values()) {
            s = s + digit.name().repeat(number / digit.arabic);
            number %= digit.arabic;
        }
        return s;
    }
    public static Integer RomanToArabic(String number){
        /** Linearly moves from most significant to last
         * 1st cycle checks is Roman number combined(Ex. IV, IX, XL).
         * 2nd cycle checks single Roman digits
         * every cycle adds value to result value
         * for INVALID number raises -1 */
        number += " "; // for pass index out of range. Bad code, but I don't care TODO #refactoring
        int result = 0;
        for (int i = 0, j = 2; i < number.length() - 1; i++, j++) {
            boolean is2Symbol = false;
            String temp = number.substring(i, j);
            for (RomanNumeralSymbol digit: RomanNumeralSymbol.values()) {
                is2Symbol = is2Symbol || digit.name().equals(temp);
            }
            if (is2Symbol) {
                i++;
                j++;
            } else {
                temp = number.substring(i, j - 1);
                for (RomanNumeralSymbol digit: RomanNumeralSymbol.values()) {
                    is2Symbol = is2Symbol || digit.name().equals(temp);
                }
            }
            if (is2Symbol){
                result += RomanNumeralSymbol.valueOf(temp).arabic;
            } else {
                return -1;
            }
        }
        if (number.length() == 1){
            result += RomanNumeralSymbol.valueOf(number).arabic;
        }
        return result;
    }
    public static boolean IsRoman(String text) {
        boolean isFullTextRoman = true;
        for (String c: text.split("")) {
            boolean isDigitRoman = false;
            for (RomanNumeralSymbol symbol : RomanNumeralSymbol.values()) {
                if (symbol.name().equals(c)) {
                    isDigitRoman = true;
                    break;
                }
            }
            isFullTextRoman &= isDigitRoman;
        }
        return isFullTextRoman;
    }
}


