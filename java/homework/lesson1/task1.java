// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

// N * (N + 1) / 2

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int summ = 0;

        System.out.println("Enter N: ");
        Scanner sc = new Scanner(System.in);
        int j = Integer.parseInt(sc.nextLine());
        sc.close();
        summ = j * (j + 1) / 2;
        System.out.println("n-ое треугольное число: " + summ);
        System.out.println("n! = " + factorial(j));
    }

    public static int factorial(int n) {
        int result = 1;
                for (int i = 1; i <= n; i++) {
            result = result*i;       
            }
            return result;
               
    }

}

