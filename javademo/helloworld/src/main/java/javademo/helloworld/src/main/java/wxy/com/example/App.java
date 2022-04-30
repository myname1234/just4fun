package javademo.helloworld.src.main.java.wxy.com.example;

import java.util.Arrays;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] arr = new int[] { 1, 3, 4, 10, 5, 4, 2, 3 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // 冒泡排序
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
