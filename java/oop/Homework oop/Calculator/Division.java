public class Division implements MathAction {

    @Override
    public double calculate(double a, double b) {
        return a / b;
    }

    @Override
    public String getSymbol() {
        return "/";
    }
}
