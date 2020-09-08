package Lesson2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 1};
        for (int i = 0; i < array.length; i++) {
           array[i] = array[i] == 0 ? 1 : 0;
        }
        System.out.println(Arrays.toString(array));

    }
}

