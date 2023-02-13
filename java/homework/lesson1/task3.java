import java.util.Scanner;

// Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4


public class task3 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите число: ");
    int a = Integer.parseInt(sc.nextLine());

    System.out.println("Введите операцию: ");
    int op = Integer.parseInt(sc.nextLine());

    System.out.println("Введите число: ");
    int b = Integer.parseInt(sc.nextLine());
    sc.close();


    switch (op) {
        case 1:
        System.out.println(a+b);
        break;
        case 2:
        System.out.println(a-b);
        break;
        case 3:
        System.out.println(a*b);
        break;
        case 4:
        System.out.println(a/b);
        break;
    }


   }
}