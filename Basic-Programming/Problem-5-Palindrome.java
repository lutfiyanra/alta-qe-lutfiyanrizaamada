import static java.awt.SystemColor.text;
public class CheckPalindrome {
    private static boolean isPalindrome(String text){
        String reverse = reverse(text);
        if(text.equals(reverse)){
            return true;}
        return false;}
    public static String reverse(String input){
        if(input == null || input.isEmpty()){
            return input;}
        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length()-1));}
    public static void main(String[] args){
        System.out.println(isPalindrome("civic"));
        System.out.println(isPalindrome("katak"));
        System.out.println(isPalindrome("kasur rusak"));
        System.out.println(isPalindrome("kupu-kupu"));
        System.out.println(isPalindrome("lion"));}
}
