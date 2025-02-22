package hewwokitty.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import hewwokitty.ui.Ui;

public class Deadline extends Task {
    private LocalDate deadline;

    public Deadline(String message) {
        super(message.split("/")[0]);
        String dateEntered = message.split("/")[1].split(" ",2)[1];
        this.deadline = LocalDate.parse(dateEntered);
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + "(by: " + this.printDeadline() + ")";
    }

    private String printDeadline() {
        return this.deadline.format(DateTimeFormatter.ofPattern("MMM d yyyy"));
    }

}
