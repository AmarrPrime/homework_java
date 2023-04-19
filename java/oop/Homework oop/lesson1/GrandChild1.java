public class GrandChild1 extends Child1 {

    public GrandChild1(String name, int age, String sex, Double height, Child1 child) {
        super(name, age, sex, height, child);

    }

    public void say() {
        System.out.println("Hi Child!");
    }
    
    @Override
    public void dance() {
        System.out.println("Rockabilly!");
    }

    
    @Override
    public void eat(InterfaceFood food) {
        food.fry();
        System.out.println(food.getName()+" delicious!");
    }
    @Override
    public void read() {
        System.out.println("Longread time.");
    }



    @Override
    public void searchBook() {
        System.out.println("Better google it..");
    }

}
