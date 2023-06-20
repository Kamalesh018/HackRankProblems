import java.util.Scanner;

public class DataTypePromblm {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < x; i++){
            String str = sc.nextLine();
            try{
                long n = Long.parseLong(str);
                System.out.println(n + " can be fitted in:");
                if(n >= -128 && n <=127) System.out.println("* byte");
                if(n >= -32768  && n <= 32767) System.out.println("* short");
                if(n >= -2147483648 && n <=2147483647) System.out.println("* int");
                if(n>=Long.MIN_VALUE && n<=Long.MAX_VALUE) System.out.println("* long");
            }catch(Exception e){
                System.out.println(str + " can't be fitted anywhere.");
            }

        }
    }
}
