import java.util.Scanner;
//застежка молния
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = Integer.parseInt(String.valueOf(scanner.nextLine()));
        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");
        for (int i = 0; i <len; i++) {
            System.out.print(arr1[i]+" ");
            System.out.print(arr2[i]+" ");
        }
    }
}