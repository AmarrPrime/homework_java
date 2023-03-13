/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и
 удаляет его, first() - возвращает первый элемент из очереди, не удаляя.*/


public class task2 
{
    public static void main(String[] args)
    {
       MyQueue queue = new MyQueue();

       int a = 8;
       for (int i = 0; i < a; i++) 
       {
           queue.enqueue(i);
       }
       System.out.println(queue);
       System.out.println(queue.first());
       System.out.println(queue.dequeue());
       System.out.println(queue);

    }
}
