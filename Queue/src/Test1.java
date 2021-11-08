import java.util.LinkedList;
import java.util.Locale;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));

    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();
        String lowerCase = string.toLowerCase(Locale.ROOT);

        for (char c : lowerCase.toCharArray()){
            if (c>='a' && c<='z') {
                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty()){
            if (!stack.pop().equals(queue.removeFirst())){
                return false;
            }
        }
        return true;
    }
}
