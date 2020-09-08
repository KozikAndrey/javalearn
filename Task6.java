package Lesson1;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(isNegative (-7));
        System.out.println(isNegative (6));
        System.out.println(isNegative (-1));
    }

    private static boolean isNegative(int chislo){
        return chislo < 0;
    }
}
