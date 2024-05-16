public class CamelCaseSplitte {
     public static String splitCamelCase(String input) {
        // Gunakan ekspresi reguler untuk memecah casing unta dan menambahkan spasi
        return input.replaceAll("(?=[A-Z])", " ");
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        System.out.println(splitCamelCase("Dermatoglyphics")); // Dermatoglyphics
        System.out.println(splitCamelCase("isogram")); // isogram
        System.out.println(splitCamelCase("moose")); // moose
        System.out.println(splitCamelCase("isIsogram")); // is Isogram
        System.out.println(splitCamelCase("thumbscrewjapingly")); // thumbscrewjapingly
    }
}




