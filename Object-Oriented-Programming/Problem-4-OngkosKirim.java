import java.util.Scanner;

public class Barang
{
    float panjang;
    float lebar;
    float tinggi;
    float berat;

    public Barang(float panjang, float lebar, float tinggi, float berat){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public int setHarga(){
        float dimensi = panjang * lebar * tinggi;

        int hargaD = 0, hargaB = 0, harga;

        while(dimensi != 0){
            if(dimensi < 50){
                hargaD += 5000;
                dimensi = dimensi - dimensi;
            }
            else{
                hargaD += 5000;
                dimensi = dimensi - 50;
            }
        }

        while(berat != 0){
            if(berat < 1){
                hargaB += 5000;
                berat = berat - berat;
            }
            else{
                hargaB += 5000;
                berat = berat - 1;
            }
        }

        if(hargaB >= hargaD)
            harga = hargaB;
        else
            harga = hargaD;

        return harga;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float p, l, t, b;

        System.out.print("Panjang : ");
        p = s.nextFloat();
        System.out.print("Lebar : ");
        l = s.nextFloat();
        System.out.print("Tinggi : ");
        t = s.nextFloat();
        System.out.print("Berat : ");
        b = s.nextFloat();

        Barang barang1 = new Barang(p, l, t, b);
        System.out.println("\nHarga : Rp " + barang1.setHarga());

    }
}
