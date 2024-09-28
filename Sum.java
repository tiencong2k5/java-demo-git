import java.util.Scanner;

public class Sum {

    public static long sumOfN(long n) {

        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            long N = scanner.nextLong();

            System.out.println(sumOfN(N));
        }

        scanner.close();
    }
}