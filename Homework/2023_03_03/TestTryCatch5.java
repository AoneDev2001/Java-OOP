import java.io.*;
public class TestTryCatch5 {
    private static int num;
    public static void main(String[] args) {
    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(ir);

    try {
        System.out.print("plese input number : ");
        num = Integer.parseInt(in.readLine());
    } catch (Exception e){
        System.out.println("program has some error with " + e);
    }
    
    System.out.println("Your number is : " + num);
}
}
