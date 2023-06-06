public class FindFirstIndex {
    public static void main(String[] args) {
        System.out.println(strStr("ssss", "aaa"));
    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
