public class TestSignificant {
    public static void main(String[] args) {
        float a = 1.0F, b = 2.5F;
        int c;
        double d;
        d = a + b;
        System.out.println("d = " + d);
        c = (int) (a + b);
        System.out.println("c = " + c);
    }
}
