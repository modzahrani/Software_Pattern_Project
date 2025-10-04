// File: DivOperation.java
public class DivOperation implements Operation {
    @Override 
    public String symbol() { return "÷"; }
    
    @Override 
    public double apply(double prev, double curr) {
        if (curr == 0.0) throw new ArithmeticException("Division by zero");
        return prev / curr;
    }
}