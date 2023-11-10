public class Anagrams {

    public static void main(String[] args) {
        String str1 = "Desperation";
        String str2 = "A Rope Ends It";

        if (areAnagrams(str1, str2)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }

    private static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toUpperCase();
        str2 = str2.replaceAll("\\s", "").toUpperCase();

        return str1.length() == str2.length();
    }
}
