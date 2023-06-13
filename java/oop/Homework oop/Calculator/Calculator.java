import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<String, MathAction> actions;

    public Calculator() {
        this.actions = new HashMap<>();
        MathAction action = new Minus();
        this.actions.put(action.getSymbol(), action);
        action = new Plus();
        this.actions.put(action.getSymbol(), action);
        action = new Multiplication();
        this.actions.put(action.getSymbol(), action);
        action = new Division();
        this.actions.put(action.getSymbol(), action);
    }

    public double calculate(String expression) {
        for (String symbol : this.actions.keySet()) {
            if (expression.contains(symbol)) {
                MathAction action = actions.get(symbol);
                String[] arguments = expression.split("\\" + symbol);
                double a = Double.parseDouble(arguments[0].trim());
                double b = Double.parseDouble(arguments[1].trim());

                return action.calculate(a, b);
            }
        }

        return 0.0;
    }
}
