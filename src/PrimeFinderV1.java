import java.util.*;

public class PrimeFinderV1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long start = System.nanoTime();

        System.out.println("Enter the range of the search: ");
        int Range = input.nextInt();

        boolean isPrime;

        for (int  i = 2; i <= Range; i++) {
            isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("Prime number: " + i);
            }
        }
        long end = System.nanoTime();
        long executionTime = end - start;
        System.out.println("Execution time: " + executionTime);
        input.close();
    }
}
