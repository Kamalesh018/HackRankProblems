import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SubStringComparisionsLexicographical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        getLargestAndSmallest(s,k);
    }

//    public static void getLargestAndSmallest(String s, int k){
//        int n = s.length() - k + 1; // to find the length of the string
//        String[] arr = new String[n];
//        for (int i = 0; i<n; i++) {
//            arr[i] = s.substring(i,i+k); // to find substring(0,0+3)
//        }
//        String min = arr[0];
//        String max = arr[n - 1];
//        System.out.println(min);
//        System.out.println(max);
//
//    }

    public static void getLargestAndSmallest(String s, int k){
        int n  = s.length() - k + 1;
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0;i < n; i++){
            al.add(s.substring(i,i+k));
        }
        Collections.sort(al);
        String min = al.get(0);
        String max = al.get(n-1);
        System.out.println(max);
        System.out.println(min);
    }


}
