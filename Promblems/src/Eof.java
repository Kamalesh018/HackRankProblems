import java.util.Scanner;

public class Eof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(i + " " + str);
            i++;
        }
    }
}
