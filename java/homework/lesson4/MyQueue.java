import java.util.LinkedList;

public class MyQueue {
    LinkedList<Integer> list = new LinkedList<>();

    public void enqueue(int a) {
        list.addLast(a);
    }

    public int dequeue() {
        int a = list.getFirst();
        list.removeFirst();
        return a;
    }

    public int first() {
        return list.getFirst();
    }

    public String toString() {
        return list.toString();
    }
}
