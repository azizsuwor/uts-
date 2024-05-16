import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class TwoToOne {
    public static void main(String[] args) {
        String s1 = "afgk";
        String s2 = "bcd";
        String result = longest("aretheyhere", "yestheyarehere");
        System.out.println(result); // Output: abcdfgk
    }

    public static String longest(String s1, String s2) {
        String combined = s1 + s2;
        char[] chars = combined.toCharArray();
        Arrays.sort(chars);
        
        Set<Character> set = new LinkedHashSet<>();
        for (char c : chars) {
            set.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : set) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}

