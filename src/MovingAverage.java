import java.util.Arrays;
import java.util.Scanner;

//Скользящее среднее
public class MovingAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int second, len = Integer.parseInt(scanner.nextLine());
        double[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        int k = scanner.nextInt();
        double currentSum=0f;
        for (int i = 0; i < k; i++) {
            currentSum+=arr[i];
        }
        StringBuilder res = new StringBuilder().append(currentSum / k).append(" ");

        for (int i = 0; i < len - k; i++) {
            currentSum-=arr[i];
            currentSum+=arr[i+k];
            res.append(currentSum/k).append(" ");
        }
        System.out.println(res);
    }
}
