import java.io.FileWriter;
import java.io.IOException;

public class AppendTextToTheFile {
        public static void main(String[] args){
        String message = "Hello";
        String fileName = "t.txt";
        write(message, fileName);
    }

    public static void write(String message, String fileName){
        try(FileWriter writer = new FileWriter(fileName, true)){
            writer.write(message + System.lineSeparator());
        }catch(IOException e){
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}