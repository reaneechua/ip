package hewwokitty.task;

public class Event extends Task {
    private String fromDate;
    private String toDate;

    public Event(String message, String fromDate, String toDate) {
        super(message);
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    @Override
    public String writeToFile() {
        return "E|" + super.writeToFile() + "|" + this.fromDate + "|" + this.toDate + "\n";
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + "(from: " + this.fromDate + "to: " + this.toDate + ")";
    }
}
