
import java.util.Scanner;

public class Innerevenandoddelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        int even = 0, odd = 0;

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();

                if (a[i][j] % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }

        System.out.println("Even elements count = " + even);
        System.out.println("Odd elements count = " + odd);
    }
}
