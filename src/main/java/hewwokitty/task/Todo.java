package hewwokitty.task;

public class Todo extends Task {
    public Todo(String message) {
        super(message);
    }

    @Override
    public String writeToFile() {
        return "T|" + super.writeToFile() + "\n";
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

}
