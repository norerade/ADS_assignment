//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int task1(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
    // O(n), because we have only 1 loop and check an array one time

    public static void main(String[] args) {
        int[] arr1 = {10, 1, 32, 3, 45};
        System.out.println(task1(arr1, arr1.length));
    }
}