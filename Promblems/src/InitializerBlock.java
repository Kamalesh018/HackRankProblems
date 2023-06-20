import java.util.Scanner;

public class InitializerBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        int res = b*h;
        try{
            if(b>0 && h>0){
                System.out.println(res);
            }else throw new Exception("Breadth and height must be positive");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
