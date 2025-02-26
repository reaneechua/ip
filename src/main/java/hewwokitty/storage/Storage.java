package hewwokitty.storage;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import hewwokitty.task.TaskList;
import hewwokitty.task.Task;
import hewwokitty.task.Todo;
import hewwokitty.task.Event;
import hewwokitty.task.Deadline;

public class Storage {
    public static void writeToFile(TaskList tasks) {
        File file = new File("./data/hewwoTasks.txt");
        file.getParentFile().mkdirs();

        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(tasks.writeToFile());
            writer.close();
        } catch (IOException e) {
            System.out.println("an ewwow occuwwed whiwe wwiting to the fiwe: " + e.getMessage());
        }
    }

    public static TaskList readFromFile() {
        File file = new File("./data/hewwoTasks.txt");
        TaskList taskList = new TaskList();
        if (!file.exists()) {
            return taskList;
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Task t = null;
                String marked;
                String command;
                String temp;
                boolean isMarked = false;
                String message;
                try {
                    command = line.split("\\|")[0];
                    temp = line.split("\\|", 2)[1];
                } catch (Exception e) {
                    return taskList;
                }

                switch (command) {
                    case "T":
                        marked = temp.split("\\|")[0];
                        isMarked = checkMarked(marked);
                        message = temp.split("\\|", 2)[1];
                        t = new Todo(message);
                        if (isMarked) {
                            t.markAsDoneFile();
                        }
                        break;
                    case "D":
                        marked = temp.split("\\|")[0];
                        isMarked = checkMarked(marked);
                        message = temp.split("\\|")[1];
                        String byDate = temp.split("\\|")[2];
                        t = new Deadline(message, byDate);
                        if (isMarked) {
                            t.markAsDoneFile();
                        }
                        break;
                    case "E":
                        marked = temp.split("\\|")[0];
                        isMarked = checkMarked(marked);
                        message = temp.split("\\|")[1];
                        String fromDate = temp.split("\\|")[2];
                        String toDate = temp.split("\\|")[3];
                        t = new Event(message, fromDate, toDate);
                        if (isMarked) {
                            t.markAsDoneFile();
                        }
                        break;
                    default:
                        break;
                }
                if (t != null) {
                    taskList.addTaskFromFile(t);
                }
            }
        } catch (FileNotFoundException e) {
            return taskList;
        }
        return taskList;
    }

    private static boolean checkMarked(String s) {
        if (s.equals("1")) {
            return true;
        }
        return false;
    }
}
