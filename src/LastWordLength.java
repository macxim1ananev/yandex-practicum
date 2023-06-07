public class LastWordLength {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello world"));
    }

    public static int lengthOfLastWord(String s) {
        String [] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}
