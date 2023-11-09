import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter length of the interval: ");
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int step = 0;
        String path = "";

        do {
            path += arr[step];
            step = (step + m - 1) % n;
        } while (step != 0);

        System.out.print("Path: " + path);
    }
}