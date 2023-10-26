import java.io.*;

public class FileReaderAndFileWriter {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try {
            if (args.length != 2)
                System.out.println("Run program with: java FileReaderAndFileWriter inFile outFile");
            in = new FileReader(args[0]);
            out = new FileWriter(args[1]);
            char buf[] = new char[64];
            int countRead = in.read(buf);
            while (countRead != -1) {
                out.write(buf, 0, countRead);
                countRead = in.read(buf);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please input filename...");
        } finally {
            try {
                if (in != null)
                    in.close();
                if (out != null)
                    out.close();
            } catch (Exception e) {
                System.out.println("Cannot close FileReader and FileWriter");
            }
        }
    }
}