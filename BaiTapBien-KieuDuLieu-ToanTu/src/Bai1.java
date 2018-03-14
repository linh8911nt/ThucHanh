import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        float vl,hh,sh;
        float diemtb,tongdiem;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Điểm Vật Lý:");
        vl=scanner.nextFloat();
        System.out.println("Điểm Hóa Học:");
        hh=scanner.nextFloat();
        System.out.println("Điểm Sinh Học:");
        sh=scanner.nextFloat();
        tongdiem=vl+hh+sh;
        diemtb=tongdiem/3;
        System.out.println("Tổng điểm:"+tongdiem);
        System.out.println("Điểm trung bình:"+diemtb);

    }
}
