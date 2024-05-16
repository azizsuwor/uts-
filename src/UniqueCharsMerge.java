import java.util.HashSet;
import java.util.Set;

public class UniqueCharsMerge {
    public static String mergeStrings(String s1, String s2) {
        // Menggabungkan kedua string menjadi satu string
        String mergedString = s1 + s2;
        
        // Menggunakan set untuk menyimpan karakter unik dari string gabungan
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : mergedString.toCharArray()) {
            uniqueChars.add(c);
        }
        
        // Membangun kembali string hasil dengan karakter-karakter unik
        StringBuilder result = new StringBuilder();
        for (char c : uniqueChars) {
            result.append(c);
        }
        
        // Mengembalikan string hasil
        return result.toString();
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        String s1 = "abcde";
        String s2 = "fghijklmnopqrstuvwxyz";
        System.out.println(mergeStrings(s1, s2)); // Output: abcdefghijklmnopqrstuvwxyz
    }
}
