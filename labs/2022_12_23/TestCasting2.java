public class TestCasting2 {
    public static void main(String[] args) {
        int a = 1, b = 2, result_int = 0;
        long c = 3L, d = 4L, result_long = 0L;
        float e = 5.0F, f = 6.0F, result_float = 0.0F;
        double g = 7.0, h = 8.0, result_double = 0.0;

        result_long = (long) g;
        System.out.println("(long) g = " + result_long);
        result_float = (float) (g * h);
        System.out.println("(float) (g * h) = " + result_float);
        result_double = f + f * e;
        System.out.println("(double) f + f * e = " + result_double);
        result_int = (int) (a + b + c + d + e + f + g + h);
        System.out.println("(int) (a + b + c + l2 + e + f + g + h) = " + result_int);
        result_float = d / b * e % c + (float) g - b;
        System.out.println("d / b * e % c + (float) g - b = " + result_float);
    }
}
