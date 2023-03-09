import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.

public class task3 {
    public static void main(String[] args) {
        List<Integer> list = initList();
        System.out.println(list);
        System.out.println("Max: " + max(list));
        System.out.println("Min: " + min(list));
        System.out.println("Average: " + average(list));
    }

    private static List<Integer> initList() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(random.nextInt(1, 20));
        }
        return list;
    }

    private static Integer max(List<Integer> list) {
        if (list.size() == 0) {
            return null;
        }
        int a = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (a < list.get(i)) {
                a = list.get(i);
            }

        }
        return a;
    }

    private static Integer min(List<Integer> list) {
        if (list.size() == 0) {
            return null;
        }
        int a = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (a > list.get(i)) {
                a = list.get(i);
            }

        }
        return a;
    }

    private static Double average(List<Integer> list) {
        if (list.size() == 0) {
            return null;
        }
        double a = 0;
        for (int i = 0; i < list.size(); i++) {
            a += list.get(i);
        }
        return a / (double) list.size();
    }
}
