public class Palindromo {
    public static boolean palavraEhPalindromo(String palavra) {
        String palindromo = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palindromo += palavra.charAt(i);
        }
        if (palindromo.equals(palavra)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean fraseEhPalindromo(String palavra){
       palavra= palavra.replace(" ","");
        String palindromo = "";
        for(int i = palavra.length() -1; i >= 0; i--){
            palindromo += palavra.charAt(i);
        }
        if (palindromo.equalsIgnoreCase(palavra)) {
            return true;
        } else {
            return false;
        }
    }
}
