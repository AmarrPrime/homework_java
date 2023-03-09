import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Реализовать алгоритм сортировки слиянием

public class task1 {
    public static void main(String[] args) {
        List<Integer> list = initList();
        
        System.out.println(list);
        list = mergeSort(list);
        System.out.println(list);

    }


    private static List<Integer> initList(){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(1, 20));
        }
        return list;

    }

    private static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() > 1) {
            List<Integer> list1 = list.subList(0, list.size() / 2);
            List<Integer> list2 = list.subList(list.size() / 2, list.size());
            list1 = mergeSort(list1);
            list2 = mergeSort(list2);

            return merge(list1, list2);

        } else {
            return list;
        }
    }

    private static List<Integer> merge(List<Integer> lis1, List<Integer> lis2) {
        List<Integer> list1 = new ArrayList<>(lis1);
        List<Integer> list2 = new ArrayList<>(lis2);
        List<Integer> sorted = new ArrayList<>();
        while (list1.size() > 0 || list2.size() > 0) {
            if (list1.size() == 0) {
                sorted.add(list2.get(0));
                list2.remove(0);
            } else if (list2.size() == 0) {
                sorted.add(list1.get(0));
                list1.remove(0);
            } else {
                int a = list1.get(0);
                int b = list2.get(0);
                if (a <= b) {
                    sorted.add(a);
                    list1.remove(0);
                } else {
                    sorted.add(b);
                    list2.remove(0);
                }
            }
        }
        return sorted;
    }
}