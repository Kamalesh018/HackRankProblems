import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = " ";
        if(n >= -100 && n <= 100){
            str = String.valueOf(n);
            System.out.println("Good job");
        }else{
            System.out.println(" Wrong answer");
        }
    }
}
