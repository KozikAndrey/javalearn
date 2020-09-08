package Lesson1;


public class Task4 {
    public static void main(String[] args) {
        System.out.println(test(8, 2));
        System.out.println(test(1, 3));
        System.out.println(test(3, 10));
        System.out.println(test(4, 16));
        System.out.println(test(7, 19));

    }
    public static boolean test (int a, int b){
        if ((a + b) >= 10 && (a + b) <=20) return true;
        else return false;

    }
}
