import java.util.Arrays;
import java.util.Comparator;

public class Order {
    public static String order(String words) {
        if (words == null || words.isEmpty()) {
            return "";
        }
        
        String[] wordArr = words.split(" ");
        
        Arrays.sort(wordArr, Comparator.comparing(Order::getNumber));
        
        return String.join(" ", wordArr);
    }
    
    private static int getNumber(String word) {
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                return Character.getNumericValue(c);
            }
        }
        // If no number found, return a large number to push it to the end
        return Integer.MAX_VALUE;
    }
    
    public static void main(String[] args) {
        String input1 = "is2 Thi1s T4est 3a";
        System.out.println(order(input1)); // Output: Thi1s is2 3a T4est
        
        String input2 = "4of Fo1r pe6ople g3ood th5e the2";
        System.out.println(order(input2)); // Output: Fo1r the2 g3ood 4of th5e pe6ople
        
        String input3 = "";
        System.out.println(order(input3)); // Output: 
    }
}
