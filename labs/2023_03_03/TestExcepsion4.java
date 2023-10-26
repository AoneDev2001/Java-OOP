public class TestExcepsion4 {
    public static void main(String[] args) {
        int s[] = new int[2];

        try {
            for (int i = 0; i < 3; i++){
                s[i] = i;
                System.out.println(s[i]);}

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Program has some problem with " + e);
        }
        System.out.println("End");
    }
}
