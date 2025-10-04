
public interface Operation {
    String symbol();
    double apply(double prev, double curr);
}