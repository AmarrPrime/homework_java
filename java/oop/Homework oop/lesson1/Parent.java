import java.util.ArrayList;
import java.util.List;

public class Parent {
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
}
