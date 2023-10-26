public class TestCasting {
    public static void main(String[] args) {
        // byte num1 = 160; //
        byte num1 = (byte) 160;
        System.out.println("num1 = " + num1);
        // short a = 1; short num2 = a + 5;
        short a = 1; int num2 = a + 5; // swap comment here
        System.out.println("num2 = " + num2);
        // int b = 3; int num3 = (float) b / 3;
        int b = 3; float num3 = (float) b / 3; // swap comment here
        System.out.println("num3 = " + num3);
        // int x long y; y = 10L; x = y;
        int x; long y; x = 20; y = x; // swap comment here
        System.out.println("x = " + x + " , y = " + y);
        // short xx = 1, yy = 2, z; zz = xx + yy;
        short xx = 1, yy = 2, zz; zz = (short) (xx + yy); // swap comment here
        System.out.println("zz = " + zz);
        // float yyy = 3.0;
        double xxx  = 2.5F; // swap comment here
        System.out.println("xxx = " + xxx);
    }
}
