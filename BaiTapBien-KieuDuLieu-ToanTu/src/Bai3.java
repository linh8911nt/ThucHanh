import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        double r; //bán kính
        double c; //chu vi
        double s; //diện tích
        final double PI=3.14; //số pi
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bán kính:");
        r=scanner.nextDouble();
        c=2*PI*r;
        s=PI*r*r;
        System.out.println("Chu vi:"+c);
        System.out.println("Diện tích:"+s);

    }
}
