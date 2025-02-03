public class Event extends Task {
    private String fromDate;
    private String toDate;

    public Event(String message) {
        super(message.split("/")[0]);
        this.fromDate = message.split("/")[1].split(" ", 2)[1];
        this.toDate = message.split("/")[2].split(" ", 2)[1];
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + "(from: " + this.fromDate + "to: " + this.toDate + ")";
    }
}
