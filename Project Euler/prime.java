import java.util.*;

public class prime {
    public static void main(String[] args) {
        // trying curr
        // 2 24
        // 2 12
        // prime factors of 24 are same as [2, prime factors of 12]
        // [2, 2, prime factors of 6]
        // [2, 2, 2, primfactors of 3]
        ArrayList<Long> primes = new ArrayList<>();
        long trying = 2;
        long curr = 600851475143L;
        while (true) {
            // try 2 to see if it's factor with %
            // if so, divide curr = curr /= 2
            // is curr == 1? we're done
            // otherwise increment trying and go again
            while (curr % trying == 0) {

                curr /= trying;
            }
            if (curr == 1) {
                primes.add(trying);
                break;
            }
            trying++;
        }
        // for (long i = 1; i < 9999L; i++) {
        // if (9999L % i == 0) {
        // primes.add(i);
        // }
        // }
        for (long element : primes) {
            System.out.println(element);
        }
    }
}
