import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        String expression = sc.nextLine();
        while (!"exit".equals(expression)) {
            double result = calc.calculate(expression);
            System.out.println(result);

            expression = sc.nextLine();
        }

        sc.close();
    }
}