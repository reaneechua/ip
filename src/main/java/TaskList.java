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
        Task t;
        if (userString.contains("todo")) {
            t = new Todo(userString.split(" ", 2)[1]);
        } else if (userString.contains("deadline")) {
            t = new Deadline(userString.split(" ", 2)[1]);
        } else {
            t = new Event(userString.split(" ", 2)[1]);
        }
        this.tasks.add(t);
        System.out.println("*************************************************");
        System.out.println("i've added youw new task: \n" + t);
        System.out.println("you now hawve " + this.tasks.size() + " tasks, ganbatte");
        System.out.println("*************************************************");
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.tasks.size(); i++) {
            int currTask = i+1;
            s +=  currTask + ". " + this.tasks.get(i).toString() + "\n";
        }
        return s;
    }
}
