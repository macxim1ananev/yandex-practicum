import java.util.Arrays;
import java.util.Scanner;

//Две фишки
public class TwoChips {
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] chips = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(findNumbers(n, chips, number));


    }

    private static String findNumbers(int n, int[] chips, int number) {
        outt:
        for (int i = 0; i < chips.length; i++) {
            for (int j = i + 1; j < chips.length; j++) {
                if (chips[i] + chips[j] == number) {
                    return chips[i] + " " + chips[j];
                }
            }
        }
        return "None";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] chips = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(scanner.nextLine());
        Arrays.sort(chips);
        System.out.println(findNumbers2(n,chips,number));
    }

    private static String findNumbers2(int n, int[] chips, int number){
        int left = 0;
        int right = chips.length-1;
        while (left<right){
            int currentSum = chips[left] + chips[right];
            if (currentSum==number){
                return chips[left] + " " + chips[right];
            } else if (currentSum < number) {
                left+=1;
            } else {
                right -=1;
            }
        }
        return "None";
    }
}
