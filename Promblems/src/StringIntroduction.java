import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int length = A.length() + B.length();
        System.out.println(length);
        if (A.compareTo(B) > 0){
            System.out.println("Yes");
        }else System.out.println("No");
        System.out.printf("%.1S%s %.1S%s" , A,A.substring(1),B,B.substring(1));

    }
}
