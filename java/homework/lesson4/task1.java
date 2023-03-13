import java.util.Collections;
import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        int a = 14;
        for (int i = 0; i < a; i++) {
            list.add(i);
        }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}