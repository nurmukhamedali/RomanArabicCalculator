public class RomanArabic {
    private final String romanValue;
    private final Integer arabicValue;
    private String type;

    public RomanArabic(String romanValue){
        this.romanValue = romanValue;
        this.type = "Roman";
        this.arabicValue = NumeralSystem.RomanToArabic(this.romanValue);
    }
    public RomanArabic(Integer arabicValue){
        this.arabicValue = arabicValue;
        this.type = "Integer";
        this.romanValue = NumeralSystem.ArabicToRoman(this.arabicValue);
    }

    public String getRomanValue() {
        return romanValue;
    }

    public Integer getArabicValue() {
        return arabicValue;
    }

    public String getType() {
        return type;
    }

    private RomanArabic declareProduct(int value, String type){
        RomanArabic product = new RomanArabic(value);
        try {
            if (this.type.equals(type)) {
                product.type = this.type;
                return product;
            } else throw new Exception("Different format exception: \n\tFirst operand: " + this.type + "\n\tSecond operand: " + type);
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public RomanArabic add(RomanArabic other) {
        return declareProduct(this.arabicValue + other.arabicValue, other.type);
    }

    public RomanArabic subtract(RomanArabic other) {
        return declareProduct(this.arabicValue - other.arabicValue, other.type);
    }

    public RomanArabic multiply(RomanArabic other) {
        return declareProduct(this.arabicValue + other.arabicValue, other.type);
    }

    public RomanArabic divide(RomanArabic other) {
        return declareProduct(this.arabicValue - other.arabicValue, other.type);
    }
}
