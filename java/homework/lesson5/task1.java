import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов. */

public class task1 {
    public static void main(String[] args) {
        HashMap<String, List<String>> yellowPages = new HashMap<>();
        String name = "Тихон";
        yellowPages.put(name, new ArrayList<>());
        yellowPages.get(name).add("9113457796");
        yellowPages.get(name).add("9111459996");
        name = "Пафнутий";
        yellowPages.put(name, new ArrayList<>());
        yellowPages.get(name).add("9313457796");
        name = "Трителефоний";
        yellowPages.put(name, new ArrayList<>());
        yellowPages.get(name).add("9999457796");
        yellowPages.get(name).add("9313457334");
        yellowPages.get(name).add("9317457796");
        System.out.println(yellowPages);

    }
}
