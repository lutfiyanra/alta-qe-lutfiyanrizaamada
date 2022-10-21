import java.util.Scanner;

public class HitungRuang
{
    public float getLuasPersegi(float sisi){
        return sisi * sisi;
    }

    public float getKelilingPersegi(float sisi){
        return sisi * 4;
    }

    public float getLuasSegitiga(float alas, float tinggi){
        return (1.0f / 2.0f) * alas * tinggi;
    }

    public float getKelilingSegitiga(float alas, float tinggi){
        return alas + tinggi + tinggi;
    }

    public float getLuasPersegiPanjang(float panjang, float lebar){
        return panjang * lebar;
    }

    public float getKelilingPersegiPanjang(float panjang, float lebar){
        return (panjang * 2) + (lebar * 2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HitungRuang hitung = new HitungRuang();

        float sisi, panjang, lebar, alas, tinggi ;

        System.out.print("Masukkan panjang sisi Persegi : ");
        sisi = s.nextFloat();
        System.out.print("Masukkan panjang alas Segitiga : ");
        alas = s.nextFloat();
        System.out.print("Masukkan tinggi Segitiga : ");
        tinggi = s.nextFloat();
        System.out.print("Masukkan panjang Persegi Panjang : ");
        panjang = s.nextFloat();
        System.out.print("Masukkan lebar Persegi Panjang : ");
        lebar = s.nextFloat();

        System.out.println("\nLuas");
        System.out.println("Persegi : " + hitung.getLuasPersegi(sisi));
        System.out.println("Segitiga : " + hitung.getLuasSegitiga(alas, tinggi));
        System.out.println("Persegi Panjang : " + hitung.getLuasPersegiPanjang(panjang, lebar));

        System.out.println("\nKeliling");
        System.out.println("Persegi : " + hitung.getKelilingPersegi(sisi));
        System.out.println("Segitiga : " + hitung.getKelilingSegitiga(alas, tinggi));
        System.out.println("Persegi Panjang : " + hitung.getKelilingPersegiPanjang(panjang, lebar));
    }
}
