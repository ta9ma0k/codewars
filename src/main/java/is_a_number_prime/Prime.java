package is_a_number_prime;

public class Prime {
    public static boolean isPrime(int num) {
        return isOverOne(num) && existDivisibleNumber(num);
    }

    private static boolean isOverOne(int num) {
        return num > 1;
    }

    private static boolean existDivisibleNumber(int num) {
        double ans = Math.sqrt(num);
        double max = Math.ceil(ans);
        if (ans == max) return false;

        for (int i = 2; i < max; i++) {
            if (num%i == 0) return false;
        }
        return true;
    }
}
