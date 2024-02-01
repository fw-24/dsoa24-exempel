import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileUtils {


    public static Object loadObject(String fileName) {
        Object returnObj = null;

        try {

            ObjectInputStream objInputStream = new ObjectInputStream(new FileInputStream(fileName));
            returnObj = objInputStream.readObject();

            objInputStream.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        return returnObj;

    }

    public static void saveObject(Object object, String fileName) {
        try {
            FileOutputStream outputStream = new FileOutputStream(fileName);
            ObjectOutputStream objStream = new ObjectOutputStream(outputStream);

            objStream.writeObject(object);
            objStream.close();
            outputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

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
