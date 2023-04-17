public class GrandChild1 extends Child1 {

    public GrandChild1(String name, int age, String sex, Double height, Child1 child) {
        super(name, age, sex, height, child);

    }

    public void say() {
        System.out.println("Hi Child!");
    }

}
