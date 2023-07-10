import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        boolean res = isAnagram(a,b);
        System.out.println((res) ? "Anagrams" : "Not Anagrams");
    }


    public static boolean isAnagram(String a, String b) {
        char[] ch1 = a.toUpperCase().toCharArray();
        char[] ch2 = b.toUpperCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (a.length() != b.length()) return false;
        a = new String(ch1);
        b = new String(ch2);
        boolean res = (a.equals(b)) ? true : false;
        return res;
    }
}

