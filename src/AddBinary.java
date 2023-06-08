public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "101"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int degree = 0;
        int aNum = 0;
        int bNum = 0;
        int stop = Math.max(a.length(), b.length());
        for (int i = 0; i <= stop; i++) {
            if (a.length() > i) {
                aNum = Integer.parseInt(String.valueOf(a.charAt(a.length() - 1 - i)));
            } else {
                aNum = 0;
            }
            if (b.length() > i) {
                bNum = Integer.parseInt(String.valueOf(b.charAt(b.length() - 1 - i)));
            } else {
                bNum = 0;
            }
            switch (aNum + bNum + degree) {
                case 0:
                    result.insert(0,"0");
                    degree = 0;
                    break;
                case 1:
                    result.insert(0, "1");
                    degree = 0;
                    break;
                case 2:
                    result.insert(0,"0");
                    degree = 1;
                    break;
                case 3:
                    result.insert(0,"1");
                    degree = 1;
                    break;
            }
        }
        if (result.charAt(0)=='0'){
            return result.substring(1);
        }
        return result.toString();
    }
}
