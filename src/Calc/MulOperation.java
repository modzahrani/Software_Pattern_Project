// File: MulOperation.java
public class MulOperation implements Operation {
    @Override 
    public String symbol() { return "×"; }
    
    @Override 
    public double apply(double prev, double curr) { return prev * curr; }
}