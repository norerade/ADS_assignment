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

    public static double task2(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) sum += arr[i];
        return (double) sum / n;
    }
    // O(n), because we have only 1 loop and check an array one time

    public static String task3(int n, int i) {
        if (n <= 1) return "Composite";
        if (n == 2) return "Prime";
        if (n % i == 0) return "Composite";
        if (i * i > n) return "Prime";
        return task3(n, i + 1);
    }
    // O(sqrt(n)), because we check dividers until sqrt(n)

    public static long task4(int n) {
        if (n <= 1) return 1;
        return n * task4(n - 1);
    }
    // O(n), because it is linear depth of the recursion

    public static int task5(int n) {
        if (n <= 1) return n;
        return task5(n - 1) + task5(n - 2);
    }
    // O(2^n), because Fibonacci is the exponential function. We are calling each function at least 2 times for each step in the sequence

    public static long task6(int a, int n) {
        if (n == 0) return 1;
        return a * task6(a, n - 1);
    }
    // O(n), because it is linear depth of the recursion

    public static void task7(int n, int[] arr) {
        reverse(arr, n - 1);
        System.out.println();
    }
    private static void reverse(int[] arr, int idx) {
        if (idx < 0) return;
        System.out.print(arr[idx] + " ");
        reverse(arr, idx - 1);
    }
    // O(n), because each element is used only one time

    public static String task8(String s, int i) {
        if (i == s.length()) return "Yes";
        if (!Character.isDigit(s.charAt(i))) return "No";
        return task8(s, i + 1);
        // Time: O(n)
    }
    // O(n), because we check each character only one time

    public static int task9(int n, int k) {
        if (k == 0 || k == n) return 1;
        return task9(n - 1, k - 1) + task9(n - 1, k);
    }
    // O(2^n), because recursion and we call function 2 times for each step

    public static int task10(int a, int b) {
        if (b == 0) return a;
        return task10(b, a % b);
    }
    // O(log n), because each recursive call reduces the size of the second argument b


    public static void main(String[] args) {
        // int[] arr1 = {10, 1, 32, 3, 45};
        // System.out.println(task1(arr1, arr1.length));

        // int[] arr2 = {3, 2, 4, 1};
        // System.out.println(task2(arr2, arr2.length));

        // System.out.println(task3(7, 2));
        // System.out.println(task3(10, 2));

        // System.out.println(task4(5));

        // System.out.println(task5(5));
        // System.out.println(task5(17));

        // System.out.println(task6(2, 10));

        // int[] arr3 = {1, 4, 6, 2};
        // task7(arr3.length, arr3);

        // System.out.println(task8("123456", 0));
        // System.out.println(task8("123a12", 0));

        // System.out.println(task9(2, 1));
        // System.out.println(task9(7, 3));

        System.out.println(task10(32, 48));
        System.out.println(task10(10, 7));
    }
}
