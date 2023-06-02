import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Brackets {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        Deque<Character> queue = new LinkedList<>();
        for (Character character : s.toCharArray()) {
            if (character.equals('(') || character.equals('[') || character.equals('{')) {
                queue.add(character);
            } else {
                if (queue.isEmpty()) {
                    return false;
                }
                Character top = queue.peekLast();
                if (top.equals('(') && !character.equals(')')) {
                    return false;
                } else if (top.equals('[') && !character.equals(']')) {
                    return false;
                } else if (top.equals('{') && !character.equals('}')) {
                    return false;
                } else {
                    queue.pollLast();
                }
            }
        }
        return queue.isEmpty();
    }
}
