import java.util.Scanner;
public class MenentukanBilanganPrima {

    private static boolean primeNumber(int num){
        boolean prime = true;
        int limit = (int) Math.sqrt(num);

        for(int i=2; i<=limit; i++){
            if(num%i == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static void main (String[] args){
        System.out.println(primeNumber(11)); // true
        System.out.println(primeNumber(13)); // true
        System.out.println(primeNumber(17)); // true
        System.out.println(primeNumber(20)); // false
        System.out.println(primeNumber(35)); // false
    }
}