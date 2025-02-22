package hewwokitty.task;

public abstract class Task {
    private boolean isDone;
    private String description;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public void markAsDone() {
        this.isDone = true;
        System.out.println("*************************************************");
        System.out.println("hewwo kitty is so pwoud of youw fow compweting this task!");
        System.out.println("[X]" + this.description);
        System.out.println("*************************************************");
    }

    public void unmarkAsDone() {
        this.isDone = false;
        System.out.println("*************************************************");
        System.out.println("this task has been mawked as not done :(");
        System.out.println("[ ]" + this.description);
        System.out.println("*************************************************");
    }

    private String printIsDone() {
        if (this.isDone) {
            return "[X] ";
        }
        return "[ ] ";
    }

    @Override
    public String toString() {
        return this.printIsDone() + this.description;
    }
}
