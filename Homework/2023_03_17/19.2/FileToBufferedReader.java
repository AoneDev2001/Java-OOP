import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;



public class FileToBufferedReader {
    static BufferedReader in = null;
    public static void main(String[] args) {
        try {
            in = new BufferedReader(new FileReader(args [0]));
            String s1;
            String s2 = new String();
            while ((s1 = in.readLine()) != null) {
                s2 += s1 + "\n";
            }
            System.out.println(s2);
        } catch (EOFException e1) {
            System.out.println("End of stream");
        } catch (IOException e2) {
            System.out.println(e2.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please input filename");
        } finally {
            try {
                if (in != null) in.close();
            } catch (IOException e3) {
                System.out.println("Cannot close BufferedReader");
            }
        }
    }
}