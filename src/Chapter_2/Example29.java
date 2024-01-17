package Chapter_2;

public class Example29 {
    public static void main(String[] args) {
        int[] arr = { 10, 11, 13, 14, 15 }; // 在Java中，length 是从 1 开始计算的。arr.length = 5
        int score = 12;
        int[] arr2 = new int[arr.length + 1]; // 数组名 = new 数据类型[长度]; arr2.length = 6

        for (int i = 0; i < 3; i++) {
            arr2[i] = arr[i]; // arr2[] = {10,11,13}
        }

        // System.out.println(arr2.length);
        // for (int i = 0; i < arr2.length; i++) {
        // System.out.println(arr2[i]);
        // }

        arr2[2] = score; // arr2[] = {10,11,12}
        for (int i = 3; i < arr2.length; i++) { // i < 6
            arr2[i] = arr[i - 1];
        }

        System.out.println("Before app new element arr:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ",");
        }
        System.out.println("");
        System.out.println("New arr:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + ",");
        }

    }
}
