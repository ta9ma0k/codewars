package is_a_number_prime;

public class Prime {
    public static boolean isPrime(int num) {
        return isOverOne(num) ? existDivisibleNumber(num) : false;
    }

    private static boolean isOverOne(int num) {
        return num > 1;
    }

    private static boolean existDivisibleNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num%i == 0) return false;
        }
        return true;
    }
}
