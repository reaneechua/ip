package hewwokitty.task;

import java.util.ArrayList;
import hewwokitty.ui.Ui;

public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<Task>();
    }

    public void markDone(int i) {
        this.tasks.get(i-1).markAsDone();
    }

    public void unmarkDone(int i) {
        this.tasks.get(i-1).unmarkAsDone();
    }

    public void addTask(String userString) {
        Task t = null;
        String message;
        String command = userString.split(" ")[0];
        String temp;

        switch (command) {
            case "todo":
                temp = userString.split(" ",2)[1];
                if (!temp.equals("")) {
                    t = new Todo(temp);
                } else {
                    Ui.printInvalidDescription();
                }
                break;
            case "deadline":
                temp = userString.split(" ",2)[1];
                message = temp.split("/")[0];
                String date = temp.split("/")[1].split(" ",2)[1];
                t = new Deadline(message, date);
                break;
            case "event":
                temp = userString.split(" ",2)[1];
                message = temp.split("/")[0];
                String fromDate = temp.split("/")[1].split(" ",2)[1];
                String toDate = temp.split("/")[2].split(" ",2)[1];
                t = new Event(message, fromDate, toDate);
                break;
        }
        if (t != null) {
            this.tasks.add(t);
            System.out.println("*************************************************");
            System.out.println("i've added youw new task: \n" + t);
            System.out.println("you now hawve " + this.tasks.size() + " tasks, ganbatte");
            System.out.println("*************************************************");
        }
    }

    public void removeTask(int i) {
        System.out.println("*************************************************");
        System.out.println("i've wemoved youw task: \n" + this.tasks.get(i-1).toString());
        this.tasks.remove(i-1);
        System.out.println("you now hawve " + this.tasks.size() + " tasks, ganbatte");
        System.out.println("*************************************************");
    }

    public void addTaskFromFile(Task task) {
        this.tasks.add(task);
    }

    public String writeToFile() {
        String s = "";
        for (Task t : tasks) {
            s = s + t.writeToFile();
        }
        return s;
    }

    @Override
    public String toString() {
        String border = "*************************************************\n";
        String s = "";
        for (int i = 0; i < this.tasks.size(); i++) {
            int currTask = i+1;
            s +=  currTask + ". " + this.tasks.get(i).toString() + "\n";
        }
        return border + s + border;
    }
}
