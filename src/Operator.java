public enum Operator {
    PLUS('+'),
    MINUS('-'),
    TIMES('*'),
    OBELUS('/');

    public final char value;
    Operator(char value){
        this.value = value;
    }
}
