import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task21();
        task22();
        task23();
        task31();
        task32();
        task33();
        task4();
    }

    public static void task1() {
        int[] arr = new int[]{1, 2, 3};
        double[] m = new double[]{1.57, 7.654, 9.986};
        int[] n = {3, 7, 10};
    }

    public static void task21() {
        int[] arr = new int[]{1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
    }

    public static void task22() {
        double[] m = new double[]{1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(m));

    }

    public static void task23() {
        int[] n = {3, 7, 10};
        for (int i = 0; i < n.length; i++) {
            if (i == n.length - 1) {
                System.out.print(n[i]);
                break;
            }
            System.out.print(n[i] + ", ");
        }
        System.out.println();
    }

    public static void task31() {
        int[] arr = new int[]{1, 2, 3};
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
    }

    public static void task32() {
        double[] m = new double[]{1.57, 7.645, 9.986};
        for (int i = m.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(m[i]);
                break;
            }
            System.out.print(m[i] + ", ");

        }
    }
    public static void task33 () {
        int[] n = {3, 7, 10};
        for (int i = n.length -1; i >=0; i--) {
            if (i == 0) {
                System.out.print(n[i]);
                break;
            }
            System.out.print(n[i] + ", ");
        }
        System.out.println();
    }
    public static void task4() {
        int[] arr = new int[]{1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

