import java.util.Scanner;

public class Kalkulator {

    private int getPenjumlahan(int angka1, int angka2){
        return angka1 + angka2 ;
    }
    public int getPengurangan(int angka3, int angka4){
        return angka3 - angka4 ;
    }
    public int getPembagian(int angka5, int angka6){
        return angka5 / angka6 ;
    }
    public int getPerkalian(int angka7, int angka8){
        return angka7 * angka8 ;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Kalkulator hitung = new Kalkulator();

        int angka1, angka2, angka3, angka4, angka5, angka6, angka7, angka8 ;

        System.out.print("Masukkan Angka Pertama Penjumlahan : ");
        angka1 = s.nextInt();
        System.out.print("Masukkan Angka Kedua Penjumlahan : ");
        angka2 = s.nextInt();
        System.out.print("Masukkan Angka Pertama Pengurangan : ");
        angka3 = s.nextInt();
        System.out.print("Masukkan Angka Kedua Pengurangan : ");
        angka4 = s.nextInt();
        System.out.print("Masukkan Angka Pertama Perkalian : ");
        angka5 = s.nextInt();
        System.out.print("Masukkan Angka Kedua Perkalian : ");
        angka6 = s.nextInt();
        System.out.print("Masukkan Angka Pertama Pembagian : ");
        angka7 = s.nextInt();
        System.out.print("Masukkan Angka Kedua Pembagian : ");
        angka8 = s.nextInt();

        System.out.println("\nHasil Perhitungan ");
        System.out.println("Penjumlahan : " + hitung.getPenjumlahan(angka1, angka2));
        System.out.println("Penjumlahan : " + hitung.getPengurangan(angka3, angka4));
        System.out.println("Penjumlahan : " + hitung.getPerkalian(angka5, angka6));
        System.out.println("Penjumlahan : " + hitung.getPembagian(angka7, angka8));

    }

}
