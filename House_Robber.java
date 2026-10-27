import java.util.*;

public class House_Robber {

    public static int maxIndex(int arr[]) {
        int max = arr[0], index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int arr[] = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int even = 0, odd = 0, maxTheft = 0;
        int n = arr.length;
        for (int i = 0; i < n; i += 2) {
            even += arr[i];
        }
        for (int i = 1; i < n; i += 2) {
            odd += arr[i];
        }
        int index = maxIndex(arr);
        while (arr[index] != 0) {
            maxTheft += arr[index];
            if (index != 0) arr[index - 1] = 0;
            if (index != n - 1) arr[index + 1] = 0;
            arr[index] = 0;
            index = maxIndex(arr);
        }
        System.out.println(Math.max(maxTheft, Math.max(even, odd)));
    }
}