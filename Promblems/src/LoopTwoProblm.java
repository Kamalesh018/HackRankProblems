import java.util.Scanner;

public class LoopTwoProblm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();      // get a input for where we want to stop.
        for (int i = 0; i < x; i++) {
            int a = sc.nextInt();   // 0
            int b = sc.nextInt();  // 2
            int n = sc.nextInt();  // 10
            int res = a;
            for (int j = 0; j < n; j++) {
                res += Math.pow(2, j) * b;
                System.out.print(res + " ");
            }
            System.out.println();
        }
    }
}
