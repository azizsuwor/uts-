public class DRoot {
    public static int digital_root(int n) {
        while (n >= 10) {
            n = sumDigits(n);
        }
        return n;
    }

    private static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(digital_root(16));     // Output: 7
        System.out.println(digital_root(942));    // Output: 6
        System.out.println(digital_root(132189)); // Output: 6
        System.out.println(digital_root(493193)); // Output: 2
    }
}
