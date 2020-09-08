package Lesson1;

public class Task3 {
    public static void main(String[] args) {
        double result = evaluateExpression(2, 1, 2, 0);
        double result1 = evaluateExpression(2, 1,2, 3);
        double result2 = evaluateExpression(2, 1,2,-1);

        System.out.println(result2);
    }
    private static double evaluateExpression(int a, int b, int c, int d) {
        double result = a * (b + ((double)c / d));
        return result;

    }
}
