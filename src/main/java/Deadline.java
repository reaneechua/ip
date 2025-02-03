public class Deadline extends Task {
    private String deadline;

    public Deadline(String message) {
        super(message.split("/")[0]);
        this.deadline = message.split("/")[1].split(" ",2)[1];
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + "(by: " + deadline + ")";
    }

}
