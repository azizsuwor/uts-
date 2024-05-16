public class multi {
    public class JumlahKelipatan {
    public static int solusi(int angka) {
        int jumlah = 0;
        
        // Iterasi melalui angka-angka di bawah angka yang diberikan
        for (int i = 0; i < angka; i++) {
            // Periksa apakah angka saat ini adalah kelipatan dari 3 atau 5
            if (i % 3 == 0 || i % 5 == 0) {
                // Tambahkan angka saat ini ke dalam jumlah
                jumlah += i;
            }
        }
        
        return jumlah;
    }

    public static void main(String[] args) {
        // Kasus uji
        System.out.println(solusi(23)); // Output harusnya 23
        System.out.println(solusi(78)); // Output harusnya 78
    }
}

}
