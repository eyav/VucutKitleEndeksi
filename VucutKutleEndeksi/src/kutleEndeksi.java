import java.util.Scanner;


public class kutleEndeksi {
    public static void main(String[] args) {
        double kilo, boy,VKI;

        Scanner input= new Scanner(System.in);
        System.out.println("Kilonuzu kilogram cinsinden giriniz:");
        kilo= input.nextDouble();

        System.out.println("Boyunuzu metre cinsinden giriniz:");
        boy=input.nextDouble();
        VKI= kilo/(boy*boy);
        System.out.println("Vucut Kitle Endeksiniz="+ VKI);


    }
}
