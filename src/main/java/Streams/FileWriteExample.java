package Streams;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWriteExample {

    public static void main(String args[]) {
        String data = "Hello";

        try {
            OutputStream out = new FileOutputStream("output.txt");

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            out.write(dataBytes);
            System.out.println("Data is written to the file.");

            // Closes the output stream
            out.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}