public class Primzahlen {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("Primzahlen zwischen 50 und 100");
        for (int i = 50; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}