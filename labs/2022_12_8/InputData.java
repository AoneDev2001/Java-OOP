import java.io.*;
public class InputData {
    public static void main(String[] args) {
        String s;
        // Input
        InputStreamReader iR = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(iR);
        System.out.print("Enter your text here: ");
        // T-C
        try {
            s = in.readLine();
            System.out.println("Your text is: " + s);
        }
        catch(IOException e){
            System.out.println("Read input keyboard error!");
        }
    }
}