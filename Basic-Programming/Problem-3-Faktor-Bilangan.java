import java.util.Scanner;
public class FaktorBilangan {
    public static void main(String[] args) {
        int bilangan ;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka yang akan dicari faktornya : ");
        bilangan = input.nextInt();
        System.out.println(" Faktor dari " + bilangan + "adalah sebagai berikut : ");

        for (int i = 1; i<=bilangan; i++){
            if (bilangan%i == 0){
                System.out.println(i + " ");
            }
        }
    }
}
