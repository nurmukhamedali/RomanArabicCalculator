public enum Digit {
    ONE(1, "I"),
    TWO(2, "II"),
    THREE(3, "III"),
    FOUR(4, "IV"),
    FIVE(5, "V"),
    SIX(6, "VI"),
    SEVEN(7, "VII"),
    EIGHT(8, "VIII"),
    NINE(9, "IX"),
    TEN(10, "X");
    public int arabic;
    public String roman;
    Digit(int arabic, String roman){
        this.arabic = arabic;
        this.roman = roman;
    }
}

