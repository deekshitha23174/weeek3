public class prime {
    public static void main(String[] args) {
        int num = 50; // Replace with any number to check
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false; // Numbers <= 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) { // Check divisors up to √n
            if (n % i == 0) return false; // If divisible, not prime
        }
        return true;
    }
}
