import java.util.Scanner;

public class LoopTwoProblm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int res = a;
            for (int j = 0; j < n; j++) {
                res += Math.pow(2, j) * b;
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }
}
