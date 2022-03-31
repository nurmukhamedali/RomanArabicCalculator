public enum BinaryOperation {
    ADD('+'){
        @Override
        public RomanArabic execute(RomanArabic operand1, RomanArabic operand2) {
            return operand1.add(operand2);
        }
    },
    SUB('-'){
        @Override
        public RomanArabic execute(RomanArabic operand1, RomanArabic operand2) {
            return operand1.subtract(operand2);
        }
    },
    MUL('*'){
        @Override
        public RomanArabic execute(RomanArabic operand1, RomanArabic operand2) {
            return operand1.multiply(operand2);
        }
    },
    DIV('/'){
        @Override
        public RomanArabic execute(RomanArabic operand1, RomanArabic operand2) {
            return operand1.divide(operand2);
        }
    };

    public final char operator;
    BinaryOperation(char operator){
        this.operator = operator;
    }
    public abstract RomanArabic execute(RomanArabic operand1, RomanArabic operand2);
}
