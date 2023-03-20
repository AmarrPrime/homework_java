import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

Создать множество ноутбуков.

Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
 Критерии фильтрации можно хранить в Map. Например:

“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/

public class task {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(8, 4, 250, "Win10", "Black", 3.50);
        Notebook notebook2 = new Notebook(4, 4, 500, "Win10", "White", 4.0);
        Notebook notebook3 = new Notebook(16, 8, 750, "Unix", "Red", 3.50);
        Notebook notebook4 = new Notebook(32, 12, 500, "Win7", "Pink", 99.2);
        Notebook notebook5 = new Notebook(8, 6, 1024, "Win7", "Black", 37.7);

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);

        filter(notebooks);
        minFilter(notebooks);
    }

    public static void filter(Set<Notebook> notebooks) {
        System.out.println(
                "Введите цифру, соответствующую необходимому критерию: \n1 - ОЗУ\n2 - число ядер процессора\n3 - объем жесткого диска\n4 - ОС\n5 - цвет"
                        +
                        "\n6 - цена\nВведите exit чтобы закончить ввод параметров");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<Integer, String> filters = new HashMap<>();
        while (!line.equals("exit")) {
            int criterion = Integer.parseInt(line);
            String value = scanner.nextLine();
            filters.put(criterion, value);
            line = scanner.nextLine();
        }

        for (Notebook notebook : notebooks) {
            boolean doesFit = true;
            for (Map.Entry<Integer, String> entry : filters.entrySet()) {
                switch (entry.getKey()) {
                    case 1:
                        int ram = Integer.parseInt(entry.getValue());
                        doesFit = doesFit && (notebook.getRam() == ram);

                        break;
                    case 2:
                        int cpu = Integer.parseInt(entry.getValue());
                        doesFit = doesFit && (notebook.getCpu() == cpu);

                        break;
                    case 3:
                        int hdd = Integer.parseInt(entry.getValue());
                        doesFit = doesFit && (notebook.getHdd() == hdd);

                        break;
                    case 4:
                        String os = entry.getValue();
                        doesFit = doesFit && (notebook.getOs().equals(os));

                        break;
                    case 5:
                        String colour = entry.getValue();
                        doesFit = doesFit && (notebook.getColour().equals(colour));

                        break;
                    case 6:
                        double price = Double.parseDouble(entry.getValue());
                        doesFit = doesFit && (notebook.getPrice() == price);

                        break;
                }
            }
            if (doesFit) {
                System.out.println(notebook);
            }
        }
    }

    public static void minFilter(Set<Notebook> notebooks) {
        System.out.println(
                "Введите цифру, соответствующую необходимому критерию: \n1 - ОЗУ\n2 - число ядер процессора\n3 - объем жесткого диска"
                        +
                        "\n4 - цена\nВведите exit чтобы закончить ввод параметров");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<Integer, String> filters = new HashMap<>();
        while (!line.equals("exit")) {
            int criterion = Integer.parseInt(line);
            String value = scanner.nextLine();
            filters.put(criterion, value);
            line = scanner.nextLine();
        }

        for (Notebook notebook : notebooks) {
            boolean doesFit = true;
            for (Map.Entry<Integer, String> entry : filters.entrySet()) {
                switch (entry.getKey()) {
                    case 1:
                        int ram = Integer.parseInt(entry.getValue());
                        doesFit = doesFit && (notebook.getRam() >= ram);

                        break;
                    case 2:
                        int cpu = Integer.parseInt(entry.getValue());
                        doesFit = doesFit && (notebook.getCpu() >= cpu);

                        break;
                    case 3:
                        int hdd = Integer.parseInt(entry.getValue());
                        doesFit = doesFit && (notebook.getHdd() >= hdd);

                        break;

                    case 4:
                        double price = Double.parseDouble(entry.getValue());
                        doesFit = doesFit && (notebook.getPrice() >= price);

                        break;
                }
            }
            if (doesFit) {
                System.out.println(notebook);
            }
        }
    }

}
