import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int ns; //năm sinh
        int t; //tuổi
        Scanner scanner=new Scanner(System.in);
        System.out.println("Năm sinh:");
        ns=scanner.nextInt();
        t=2018-ns;
        System.out.println("Tuổi:"+t);
    }
}
