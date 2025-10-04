// File: AddOperation.java
public class AddOperation implements Operation {
    @Override 
    public String symbol() { return "+"; }
    
    @Override 
    public double apply(double prev, double curr) { return prev + curr; }
}