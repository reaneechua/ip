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

    public void addTask(String message) {
        this.tasks.add(new Task(message));
        System.out.println("*************************************************");
        System.out.println("added: " + message);
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
