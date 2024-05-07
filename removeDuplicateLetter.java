import java.util.LinkedHashSet;

public class removeDuplicateLetter {
    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello world";
        String result = removeDuplicates(input);
        System.out.println("Original string: " + input);
        System.out.println("String after removing duplicates: " + result);
    }
}
