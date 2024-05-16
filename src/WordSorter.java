import java.util.Arrays;
import java.util.Comparator;

public class WordSorter {
    
    // Metode untuk mengurutkan string input
    public static String sortString(String input) {
        if (input.isEmpty()) {
            return ""; // Mengembalikan string kosong jika input kosong
        }
        
        // Memecah string input menjadi array kata-kata
        String[] words = input.split(" ");
        
        // Mengurutkan array kata-kata berdasarkan nomor yang ada di setiap kata
        Arrays.sort(words, Comparator.comparingInt(WordSorter::extractNumber));
        
        // Menggabungkan array kata-kata yang telah diurutkan kembali menjadi satu string
        return String.join(" ", words);
    }
    
    // Metode untuk mengekstrak nomor dari sebuah kata
    private static int extractNumber(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                return Character.getNumericValue(word.charAt(i));
            }
        }
        return -1; // Mengembalikan -1 jika tidak ditemukan nomor dalam kata tersebut
    }

    // Metode main untuk menjalankan contoh penggunaan
    public static void main(String[] args) {
        String input1 = "is2 Thi1s T4est 3a";
        System.out.println(sortString(input1)); // Output: Thi1s is2 3a T4est
        
        String input2 = "4of Fo1r pe6ople g3ood th5e the2";
        System.out.println(sortString(input2)); // Output: Fo1r the2 g3ood 4of th5e pe6ople
        
        String input3 = "";
        System.out.println(sortString(input3)); // Output: 
    }
}
