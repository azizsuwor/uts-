import java.util.Arrays;
import java.util.Comparator;

public class Order {
    public static String order(String words) {
        if (words == null || words.isEmpty()) {
            return "";
        }
        
        // Memisahkan kata-kata berdasarkan spasi dan menyimpannya dalam array
        String[] wordArr = words.split(" ");
        
        // Mengurutkan array kata-kata berdasarkan nomor urutan yang ada di dalamnya
        Arrays.sort(wordArr, Comparator.comparing(Order::getNumber));
        
        // Menggabungkan kembali array kata-kata yang telah diurutkan menjadi sebuah string
        return String.join(" ", wordArr);
    }
    
    // Metode untuk mendapatkan nomor urutan dari sebuah kata
    private static int getNumber(String word) {
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                return Character.getNumericValue(c);
            }
        }
        // Jika tidak ada angka ditemukan, mengembalikan nilai besar untuk menempatkannya di akhir urutan
        return Integer.MAX_VALUE;
    }
    
    public static void main(String[] args) {
        // Contoh penggunaan
        String input1 = "is2 Thi1s T4est 3a";
        System.out.println(order(input1)); // Output: Thi1s is2 3a T4est
        
        String input2 = "4of Fo1r pe6ople g3ood th5e the2";
        System.out.println(order(input2)); // Output: Fo1r the2 g3ood 4of th5e pe6ople
        
        String input3 = "";
        System.out.println(order(input3)); // Output: 
    }
}
