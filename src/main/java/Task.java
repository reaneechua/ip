public class Task {
    private boolean isDone;
    private String message;

    public Task(String message) {
        this.message = message;
        this.isDone = false;
    }

    public void markAsDone() {
        this.isDone = true;
        System.out.println("*************************************************");
        System.out.println("hewwo kitty is so pwoud of youw fow compweting this task!");
        System.out.println("[X]" + this.message);
        System.out.println("*************************************************");
    }

    public void unmarkAsDone() {
        this.isDone = false;
        System.out.println("*************************************************");
        System.out.println("this task has been mawked as not done :(");
        System.out.println("[ ]" + this.message);
        System.out.println("*************************************************");
    }

    private String printStatus() {
        if (this.isDone) {
            return "[X]";
        }
        return "[ ]";
    }

    @Override
    public String toString() {
        return this.printStatus() + this.message;
    }
}
