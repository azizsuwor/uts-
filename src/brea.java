/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class brea {
    public class CamelCaseBreaker {
    public static String breakCamelCase(String input) {
        StringBuilder result = new StringBuilder();
        
        // Iterasi melalui setiap karakter dalam string input
        for (char c : input.toCharArray()) {
            // Jika karakter adalah huruf besar, tambahkan spasi sebelumnya
            if (Character.isUpperCase(c)) {
                result.append(" ");
            }
            // Tambahkan karakter ke hasil
            result.append(c);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        // Contoh penggunaan
        System.out.println(breakCamelCase("camelCasing")); // Output: "camel Casing"
        System.out.println(breakCamelCase("anotherExample")); // Output: "another Example"
    }
}

}
