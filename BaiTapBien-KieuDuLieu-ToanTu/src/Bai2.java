import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int c,f;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Độ 0C:");
        c=scanner.nextInt();
        f=(9*c)/5 +32;
        System.out.println("Độ 0F:"+f);

    }
}
