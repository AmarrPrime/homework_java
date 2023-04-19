public class Child1 extends Parent implements InterfaceReader {

    Parent parent;

    public Child1(String name, int age, String sex, double height,Parent parent) {
        super(name, age, sex, height);
        this.parent = parent;
        parent.addChild(this);
    }



    public void say() {
        System.out.println("Hi Parent!");
    }

    
    @Override
    public void dance() {
        System.out.println("Lindy hop!");
    }

    @Override
    public void sleep() {
        System.out.println("Snores");
    }


    @Override
    public void eat(InterfaceFood food) {
        food.boil();
        System.out.println(food.getName()+" delicious!");
    }



    @Override
    public void read() {
        System.out.println("Words,many...");
    }



    @Override
    public void searchBook() {
        System.out.println("Where is it?");
    }



    @Override
    public void remember() {
        System.out.println("What was that book>?");
    }

    
}
