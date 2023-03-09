import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

public class task2 {
    public static void main(String[] args) {
        List<Integer> list = initList();
        System.out.println(list);
        int i = 0;
        while (i < list.size()) {
            int a = list.get(i);
            if (a % 2 == 0) {
                list.remove(i);
            } else
                i++;
        }
        System.out.println(list);

    }

    private static List<Integer> initList() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(random.nextInt(1, 20));
        }
        return list;

    }

}
