import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s1 = str.trim();
        if(s1.isEmpty()) {
            System.out.println("0");
            return;
        }
        String[] strArray = str.split("[ !,?._'@]+");
        System.out.println(strArray.length);
        for (String s : strArray) {
            System.out.println(s);
        }
    }
}
