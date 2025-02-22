package hewwokitty.parser;

import java.util.Scanner;
import hewwokitty.task.TaskList;
import hewwokitty.storage.Storage;
import hewwokitty.ui.Ui;

public class Parser {
    private Scanner scanner;
    private String userInput = "";

    public Parser() {
        this.scanner = new Scanner(System.in);
    }

    public boolean parseCommands(TaskList taskList) {
        this.userInput = this.scanner.nextLine(); //if input isn't valid, return false
        String userString = this.userInput;
        if (userString.equals("bye")) {
            return false;
        } else {
            if (userString.equals("list")) {
                System.out.print(taskList);
            } else if (userString.split(" ")[0].equals("mark")){
                int taskNum = Integer.parseInt(userString.split(" ")[1]);
                taskList.markDone(taskNum);
                Storage.writeToFile(taskList);
            } else if (userString.split(" ")[0].equals("unmark")) {
                int taskNum = Integer.parseInt(userString.split(" ")[1]);
                taskList.unmarkDone(taskNum);
                Storage.writeToFile(taskList);
            } else if (userString.contains("todo") || userString.contains("deadline") || userString.contains("event")) { // add tasks
                taskList.addTask(userString);
                Storage.writeToFile(taskList);
            } else if (userString.contains("delete")) {
                int i = Integer.parseInt(userString.split(" ")[1]);
                taskList.removeTask(i);
                Storage.writeToFile(taskList);
            } else {
                Ui.printInvalidCommand();
            }
        }
        return true;
    }
}
