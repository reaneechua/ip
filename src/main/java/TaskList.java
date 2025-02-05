import java.util.ArrayList;

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
        if (userString.contains("todo")) {
            String temp = userString.replaceFirst("todo", "");
            if (!temp.equals("")) {
                t = new Todo(userString.split(" ", 2)[1]);
            } else {
                System.out.println("*************************************************");
                System.out.println("descwiptwion of a todo cawn't be empty! twy again :3");
                System.out.println("*************************************************");
            }
        } else if (userString.contains("deadline")) {
            t = new Deadline(userString.split(" ", 2)[1]);
        } else {
            t = new Event(userString.split(" ", 2)[1]);
        }
        if (!(t == null)) { //if not null, add to list
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
