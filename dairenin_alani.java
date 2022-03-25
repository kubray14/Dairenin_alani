import java.util.Scanner;

public class dairenin_alani {
    public static void main(String[] args) {
        
        Scanner scan =  new Scanner(System.in);
        double pi = 3.14;
        int r , a;

        System.out.println("Dairenin yarı çapını giriniz = ");
        r = scan.nextInt();
        System.out.println("Dilimin merkez açısını giriniz = ");
        a = scan.nextInt();

        double alan = ((pi*r*r*a)/360);
        System.out.println("Dairenin çevresi = "+ (2*pi*r));
        System.out.println("Dairenin alanı = "+ (pi*r*r));
        System.out.println("Daire diliminin alanı = "+ alan);

        
    }
}
