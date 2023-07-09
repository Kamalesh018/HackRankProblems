import java.util.Objects;
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orginal = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(orginal);
        String reverse = sb.reverse().toString();
        if(Objects.equals(orginal, reverse)){
            System.out.println("Yes");
        }else System.out.println("No");

    }
}
