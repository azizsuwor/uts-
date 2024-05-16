public class IsogramChecker {  
    import java.util.HashSet;

    public static boolean isIsogram(String str) {
        // Konversi string ke huruf kecil untuk mengabaikan kasus huruf
        str = str.toLowerCase();
        
        // Set untuk menyimpan huruf-huruf unik
        HashSet <Character> uniqueLetters = new HashSet<>();
        
        // Iterasi melalui setiap huruf dalam string
        for (char ch : str.toCharArray()) {
            // Jika karakter saat ini sudah ada dalam set, itu bukan isogram
            if (uniqueLetters.contains(ch)) {
                return false;
            }
            // Tambahkan karakter ke set
            uniqueLetters.add(ch);
        }
        
        // Jika semua huruf adalah unik, itu adalah isogram
        return true;
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        System.out.println(isIsogram("Dermatoglyphics")); // true
        System.out.println(isIsogram("aba"));            // false
        System.out.println(isIsogram("moOse"));          // false
        System.out.println(isIsogram(""));               // true
    }
}

}
