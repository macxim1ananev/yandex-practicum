import java.util.Arrays;
import java.util.Scanner;

//Две фишки
public class TwoChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] chips = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(findNumbers(n, chips, number));


    }

    private static String findNumbers(int n, int[] chips, int number){
        outt :for (int i = 0; i < chips.length; i++)  {
            for (int j = i + 1; j < chips.length; j++) {
                if (chips[i] + chips[j]==number){
                    return chips[i] + " " + chips[j];
                }
            }
        }
        return "None";
    }
}
