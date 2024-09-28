import java.util.Scanner;

public class Combination {
    private static int totalCount = 0;

    public static void printArr(int n, int k) {
        int[] combination = new int[k];
        generateCombination(n, k, 1, 0, combination);
    }

    public static void generateCombination(int n, int k, int start, int index, int[] combination) {
        if (index == k) {
            for (int j = 0; j < k; j++) {
                System.out.print(combination[j] + " ");
            }
            System.out.println();
            totalCount++;
            return;
        } else {
            for (int i = start; i <= n; i++) {
                combination[index] = i;
                generateCombination(n, k, i + 1, index + 1, combination);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        printArr(n, k);
        System.out.println("Tong cong co " + totalCount + " to hop");
    }
}
