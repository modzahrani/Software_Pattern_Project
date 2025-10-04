public class CalculatorEngine {
    private static CalculatorEngine instance;
    private String current = "";
    private String previous = "";
    private String opSymbol = "";
    private OperationFactory factory;

    private CalculatorEngine() {
      
        factory = new OperationFactory();
    }


    public static synchronized CalculatorEngine getInstance() {
        if (instance == null) {
            instance = new CalculatorEngine();
        }
        return instance;
    }

    public void appendNumber(String n) {
        current += n;
    }

    public void chooseOperation(String symbol) {
        if (!current.isEmpty()) {
            if (!previous.isEmpty()) compute();
            opSymbol = symbol;
            previous = current;
            current = "";
        }
    }

    public void compute() {
        if (previous.isEmpty() || current.isEmpty() || opSymbol.isEmpty()) return;

        Operation op = factory.get(opSymbol);
        if (op != null) {
            double prevVal = Double.parseDouble(previous);
            double currVal = Double.parseDouble(current);
            double result = op.apply(prevVal, currVal);
            current = String.valueOf(result);
            previous = "";
            opSymbol = "";
        }
    }

    public void clear() {
        current = "";
        previous = "";
        opSymbol = "";
    }

    public String getCurrent() { return current; }
    public String getPrevious() { return previous; }
    public String getOpSymbol() { return opSymbol; }
}
