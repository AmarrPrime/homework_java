/*  Реализовать, с учетом ооп подхода, генеалогическое дерево Человек.
Идея: описать некоторое количество компонент, например:
модель человека
компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д.
компонент для проведения исследований
дополнительные компоненты по желанию, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение отдельных моделей человека
Под “проведением исследования” можно понимать получение всех детей выбранного человека. */




public class Main {
    public static void main(String[] args) {

        Parent primalParent = new Parent("Hesus",33,"male",210);

        Child1 child1 = new Child1("Isaak", 77, "male", 143, primalParent);
        Child1 child2 = new Child1("Brunhild", 19, "female", 194, primalParent);
        GrandChild1 grand1 = new GrandChild1("Oglaf", 15, "male", 123.0, child2);
        GrandChild1 grand2 = new GrandChild1("Helga", 19, "female", 177.0, child2);
        primalParent.showTree();
        child2.showTree();

    }

}
