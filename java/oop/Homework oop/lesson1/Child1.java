public class Child1 extends Parent {

    Parent parent;

    public Child1(String name, int age, String sex, double height,Parent parent) {
        super(name, age, sex, height);
        this.parent = parent;
        parent.addChild(this);
    }



    public void say() {
        System.out.println("Hi Parent!");
    }

}
