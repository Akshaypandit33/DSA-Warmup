public class PowerOf4 {
    public static void main(String[] args) {
        System.out.println(isPowerOf4(16));
    }
    public static boolean isPowerOf4(int n) {
        return ((n & n - 1) == 0) && ((n - 1) % 3 == 0);
    }
}
