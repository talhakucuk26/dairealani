package org.example;

    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r,pi =3.14, alan, cevre;

        Scanner input =  new Scanner(System.in);
        System.out.print("Yarıçapı Giriniz : ");
        r = input.nextDouble();

        double merkezAci, daireAlani;

        System.out.print("Merkez Açı Ölçüsü : ");
        merkezAci = input.nextDouble();


        daireAlani = (pi * (r * r) * merkezAci) /360;
        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Alan : " + alan);
        System.out.println("Çevre : " + cevre);
        System.out.println("Daire Diliminin Ölçüsü : " + daireAlani);
    }
}