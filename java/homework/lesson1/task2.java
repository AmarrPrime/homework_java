import java.util.ArrayList;
import java.util.List;

// Вывести все простые числа от 1 до 1000


public class task2 {
    public static void main(String[] args) {
        
        List<Integer> primes = new ArrayList<>();        
        for (int i = 2; i < 1001; i++) {
            boolean isPrime = true;
            for (Integer prime : primes) {
                if(i%prime == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primes.add(i);
            }
        }
        System.out.println(primes);
    }
    
}