import java.io.*;

public class SecurityExample {

    public void writeToFile(String filename, String content) throws IOException {
        FileWriter writer = new FileWriter(filename); // セキュリティリスクの可能性
        writer.write(content);
        writer.close();
    }
}
