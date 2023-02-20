import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/*Реализуйте алгоритм сортировки пузырьком числового массива,
 результат после каждой итерации запишите в лог-файл.*/

public class task2 {

    private static Logger logger = Logger.getLogger(task2.class.getName());

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 7, 8, 0, 2, 4, 52, 77 };
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }

    private static void bubbleSort(int[] array) {
        for (int cell = array.length; cell >= 0; cell--) {
            for (int i = 0; i < cell && i + 1 < cell; i++)
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    logger.log(Level.INFO,
                            String.format("%d<->%d, %s", array[i], array[i + 1], Arrays.toString(array)));
                }
        }

    }

}
