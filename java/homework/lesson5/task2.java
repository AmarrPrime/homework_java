import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу,
 которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности. */

public class task2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        String[] options = { "Иван", "Кеша", "Гогги", "Васисуалий", "Амвросий", "Кристобаль" };
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(options.length);
            names.add(options[num]);
        }

        System.out.println(names);

        HashMap<String, Integer> counts = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (counts.containsKey(name)) {
                int count = counts.get(name);
                counts.put(name, count + 1);
            } else {
                counts.put(name, 1);
            }
        }

        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(counts.entrySet());
        entries.sort(Map.Entry.comparingByValue());
        Collections.reverse(entries);

        System.out.println(entries);
    }
}
