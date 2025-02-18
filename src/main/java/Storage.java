import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Storage {
    public static void writeToFile(TaskList tasks) {
        File file = new File("./data/hewwoTasks.txt");
        file.getParentFile().mkdirs();

        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(tasks.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
