
public class isogram {
 
    public static boolean isIsogram(String str) {
        // Konversi string ke huruf kecil agar tidak memperhatikan perbedaan huruf besar-kecil
        str = str.toLowerCase();
        
        // Iterasi melalui setiap karakter dalam string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Jika karakter adalah huruf, periksa apakah terdapat duplikat dalam sisa string
            if (Character.isLetter(currentChar)) {
                for (int j = i + 1; j < str.length(); j++) {
                    char nextChar = str.charAt(j);
                    if (currentChar == nextChar) {
                        return false; // Jika ditemukan duplikat, bukan isogram
                    }
                }
            }
        }
        // Jika tidak ada huruf yang berulang, itu adalah isogram
        return true;
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        System.out.println(isIsogram("Dermatoglyphics")); // true
        System.out.println(isIsogram("isogram")); // true
        System.out.println(isIsogram("moose")); // false
        System.out.println(isIsogram("isIsogram")); // false
        System.out.println(isIsogram("aba")); // false
        System.out.println(isIsogram("moOse")); // false
        System.out.println(isIsogram("thumbscrewjapingly")); // true
        System.out.println(isIsogram("")); // true
    }
}





