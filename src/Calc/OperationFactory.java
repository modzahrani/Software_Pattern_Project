import java.util.HashMap;
import java.util.Map;

public class OperationFactory {
    private Map<String, Operation> registry = new HashMap<>();

    public OperationFactory() {

        register(new AddOperation());
        register(new SubOperation());
        register(new MulOperation());
        register(new DivOperation());
    }

    public void register(Operation op) {
        registry.put(op.symbol(), op);
    }

    public Operation get(String symbol) {
        return registry.get(symbol);
    }
}
