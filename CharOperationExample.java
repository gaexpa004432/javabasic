public class CharOperationExample {
    public static void main(String[] agrs) {
        int v1 = 5, v2 = 2, result = v1 / v2;
        double result1 = (double) v1 / v2;
        result = minus(5, 4);
        System.out.println(result);
        System.out.println(result1);
        result1 = div(v1, v2);

        System.out.println(result1);
    }

    public static int sum(int a1, int a2) {
        int result = a1 + a2;
        return result;
    }

    public static int minus(int a1, int a2) {
        int result = a1 - a2;
        return result;
    }

    public static double div(int a1, int a2) {
        return (double) a1 / a2;
    }
}