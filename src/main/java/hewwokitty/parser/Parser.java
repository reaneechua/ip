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
        this.userInput = this.scanner.nextLine();
        String userString = this.userInput.toLowerCase();
        switch (userString.split(" ", 2)[0]) {
            case "bye":
                return false;
            case "list":
                System.out.print(taskList);
                break;
            case "mark":
                int markTaskNum = Integer.parseInt(userString.split(" ")[1]);
                taskList.markDone(markTaskNum);
                Storage.writeToFile(taskList);
                break;
            case "unmark":
                int unmarkTaskNum = Integer.parseInt(userString.split(" ")[1]);
                taskList.unmarkDone(unmarkTaskNum);
                Storage.writeToFile(taskList);
                break;
            case "todo":
            case "deadline":
            case "event":
                try {
                    taskList.addTask(userString);
                    Storage.writeToFile(taskList);
                } catch (IllegalArgumentException e) {
                    Ui.printInvalidDate();
                }
                break;
            case "delete":
                int deleteTaskNum = Integer.parseInt(userString.split(" ")[1]);
                taskList.removeTask(deleteTaskNum);
                Storage.writeToFile(taskList);
                break;
            default:
                Ui.printInvalidCommand();
                break;
        }
        return true;
    }
}
