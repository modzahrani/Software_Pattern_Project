public class Calculator {
    private String currentOperand;
    private String previousOperand;
    private String operation;

    public void compute() {
        float computation;
        float curr = Float.parseFloat(this.currentOperand);
        float prev = Float.parseFloat(this.previousOperand);

        switch (this.operation) {
            case "+" -> computation = prev + curr;
            case "-" -> computation = prev - curr;
            case "×" -> computation = prev * curr;
            case "÷" -> computation = prev / curr;
            default -> { return; }
        }
        this.currentOperand = Float.toString(computation);
        this.previousOperand = "";
        this.operation = "";
    }
}
