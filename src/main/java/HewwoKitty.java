import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HewwoKitty {
    public static void main(String[] args) {
        boolean isRunning = true;
        TaskList taskList = new TaskList();
        Parser parser = new Parser();

        Ui.printStart();
        while (isRunning) {
            isRunning = parser.parseCommands(taskList);
        }
        Ui.printBye();
    }
}
