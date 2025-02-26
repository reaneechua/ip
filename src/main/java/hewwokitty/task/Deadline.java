package hewwokitty.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import hewwokitty.ui.Ui;

public class Deadline extends Task {
    private LocalDate deadline;

    public Deadline(String description, String dateEntered) {
        super(description);
        try {
            this.deadline = LocalDate.parse(dateEntered);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("");
        }
    }

    @Override
    public String writeToFile() {
        return "D|" + super.writeToFile() + "|" + this.deadline + "\n";
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + "(by: " + this.printDeadline() + ")";
    }

    private String printDeadline() {
        return this.deadline.format(DateTimeFormatter.ofPattern("MMM d yyyy"));
    }
}
