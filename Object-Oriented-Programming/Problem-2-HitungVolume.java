import java.util.Scanner;
public class HitungVolume {
    public float getVolumeKubus(float sisi){
        return sisi * sisi * sisi ;
    }
    public float getVolumeBalok(float panjang, float lebar, float tinggi){
        return panjang * lebar * tinggi ;
    }
    public float getVolumeTabung(float jarijari, float tinggi){
        return ((22 * jarijari * jarijari * tinggi)/7) ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HitungVolume hitung = new HitungVolume();

        float sisi, panjang, lebar, tinggi, jarijari ;

        System.out.print("Masukkan panjang sisi Kubus : ");
        sisi = s.nextFloat();
        System.out.print("Masukkan panjang Balok : ");
        panjang = s.nextFloat();
        System.out.print("Masukkan lebar Balok : ");
        lebar = s.nextFloat();
        System.out.print("Masukkan tinggi Balok : ");
        tinggi = s.nextFloat();
        System.out.print("Masukkan jari-jari Tabung : ");
        jarijari = s.nextFloat();
        System.out.print("Masukkan tinggi Tabung : ");
        tinggi = s.nextFloat();

        System.out.println("\nVolume");
        System.out.println("Kubus : " + hitung.getVolumeKubus(sisi));
        System.out.println("Balok : " + hitung.getVolumeBalok(panjang, lebar, tinggi));
        System.out.println("Tabung : " + hitung.getVolumeTabung(jarijari, tinggi));
    }


}