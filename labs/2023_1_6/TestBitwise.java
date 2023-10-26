class TestBitwise {
    public static void main(String[] args) {
        int bit1 = 66; // 66 = 0000 0000 0000 0000 0000 0000 0100 0010
        int bit2 = 30; // 30 = 0000 0000 0000 0000 0000 0000 0001 1110
        int bit3 = -30; // -30 = 1111 1111 1111 1111 1111 1111 1110 0010
        System.out.println(bit1 & bit2);
        System.out.println(bit1 | bit2);
        System.out.println(bit1 ^ bit2);
        System.out.println(~bit1);
        System.out.println(~bit2);
        System.out.println(bit1 >> 3);
        System.out.println(bit3 >> 3);
        System.out.println(bit1 >>>36);
        System.out.println(bit3 >>> 3);
        System.out.println(bit2 << 6);
    }
}