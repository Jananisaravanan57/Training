import java.io.*;

public class FileOperations {

	public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            writer.write("Hello World");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.close();
            System.out.println("file upadated\n ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream inputStream = new FileInputStream("MyFile.txt");
            InputStreamReader reader = new InputStreamReader(inputStream);
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
            
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        
 
    }

}
