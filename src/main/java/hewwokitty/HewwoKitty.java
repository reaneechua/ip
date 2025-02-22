package hewwokitty;

import hewwokitty.task.TaskList;
import hewwokitty.parser.Parser;
import hewwokitty.ui.Ui;

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
