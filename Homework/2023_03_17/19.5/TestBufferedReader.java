import java.io.*;
public class TestBufferedReader {
    public static void main(String[] args) throws IOException {
        File inFile = new File("sample4.txt");
        FileReader fReader = new FileReader(inFile);
        BufferedReader bufReader = new BufferedReader(fReader);
        String str;
        while ((str = bufReader.readLine()) != null){
            System.out.println(str);
        }
        bufReader.close();
    }
}
