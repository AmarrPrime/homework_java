import java.util.ArrayList;
import java.util.List;

public class Parent implements InterfaceHuman {
    String name;
    int age;
    String sex;
    Double height;
    List<Child1> children;

    public Parent(String name, int age, String sex, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.children = new ArrayList<>();
    }

    public void addChild(Child1 child) {
        children.add(child);
    }

    public void showTree() {
        showTree(0);
    }

    protected void showTree(int bias) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bias; i++) {
            sb.append("\t");
        }
        String tab = sb.toString();
        System.out.println(tab + display());
        System.out.println(tab + "children are: [");
        for (Child1 child1 : children) {
            child1.showTree(bias + 1);
        }
        System.out.println(tab + "]");
    }

    public String display() {
        return "Human{" +
                "name = '" + name + '\'' +
                ", age = " + age + '\'' +
                ", sex = " + sex +
                ", height = " + height +
                '}';

    }

    @Override
    public void speak() {
        System.out.println("Arrgghh");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzzzz");
    }

    @Override
    public void cook(InterfaceFood food) {
        food.getCooked();
        System.out.println(food.getName()+" smells nice!");
    }

    @Override
    public void eat(InterfaceFood food) {
        System.out.println(food.getName()+" delicious!");
    }

    @Override
    public void dance() {
        System.out.println("Funky town!");
    }
}
