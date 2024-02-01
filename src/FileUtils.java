import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileUtils {


    public static String readTextFile(String fileName) {
        StringBuilder returnString = new StringBuilder();

        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                returnString.append(line);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return returnString.toString();
    }


    public static void writeTextFile(String content, String fileName) {

        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            OutputStreamWriter writer = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(content);
            bufferedWriter.close();

        } catch (FileNotFoundException e) {
            //System.out.println("Filen kunde inte skrivas!");
            e.printStackTrace(); // Skriver ut hela errorn

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
