import java.util.ArrayList;
import java.util.Scanner;

public class HewwoKitty {
    public static void main(String[] args) {
        printStart();

        boolean run = true;
        TaskList taskList = new TaskList();
        while (run) {
            Scanner userInput = new Scanner(System.in);
            String userString = userInput.nextLine();
            if (userString.equals("bye")) {
                run = false;
                printBye();
            } else {
                if (userString.equals("list")) {
                    System.out.print(taskList);
                } else if (userString.split(" ")[0].equals("mark")){
                    int taskNum = Integer.parseInt(userString.split(" ")[1]);
                    taskList.markDone(taskNum);
                } else if (userString.split(" ")[0].equals("unmark")) {
                    int taskNum = Integer.parseInt(userString.split(" ")[1]);
                    taskList.unmarkDone(taskNum);
                } else if (userString.contains("todo") || userString.contains("deadline") || userString.contains("event")) { // add tasks
                    taskList.addTask(userString);
                } else if (userString.contains("delete")) {
                    int i = Integer.parseInt(userString.split(" ")[1]);
                    taskList.removeTask(i);
                } else {
                    System.out.println("*************************************************");
                    System.out.println("i hawve no ideaw what youwe twying to say :( twy again <3");
                    System.out.println("*************************************************");
                }
            }
        }
    }

    public static void printStart() {
        String logo = "⠀⠀⠀⠀⢀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⣠⠾⠛⠶⣄⢀⣠⣤⠴⢦⡀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⢠⡿⠉⠉⠉⠛⠶⠶⠖⠒⠒⣾⠋⠀⢀⣀⣙⣯⡁⠀⠀⠀⣿⠀⠀⠀⠀\n" +
                "⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⢸⡏⠀⠀⢯⣼⠋⠉⠙⢶⠞⠛⠻⣆⠀⠀⠀\n" +
                "⠀⠀⠀⢸⣧⠆⠀⠀⠀⠀⠀⠀⠀⠀⠻⣦⣤⡤⢿⡀⠀⢀⣼⣷⠀⠀⣽⠀⠀⠀\n" +
                "⠀⠀⠀⣼⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠙⢏⡉⠁⣠⡾⣇⠀⠀⠀\n" +
                "⠀⠀⢰⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠋⠉⠀⢻⡀⠀⠀\n" +
                "⣀⣠⣼⣧⣤⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠐⠖⢻⡟⠓⠒\n" +
                "⠀⠀⠈⣷⣀⡀⠀⠘⠿⠇⠀⠀⠀⢀⣀⣀⠀⠀⠀⠀⠿⠟⠀⠀⠀⠲⣾⠦⢤⠀\n" +
                "⠀⠀⠋⠙⣧⣀⡀⠀⠀⠀⠀⠀⠀⠘⠦⠼⠃⠀⠀⠀⠀⠀⠀⠀⢤⣼⣏⠀⠀⠀\n" +
                "⠀⠀⢀⠴⠚⠻⢧⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⠞⠉⠉⠓⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠛⠶⠶⠶⣶⣤⣴⡶⠶⠶⠟⠛⠉⠀⠀⠀⠀⠀⠀⠀";
        System.out.println(logo);
        System.out.println("*************************************************");
        System.out.println("hewwo! i'm hewwo kitty!");
        System.out.println("i'm just a chatbot uwuwuuwuwuwuwuwuw");
        System.out.println("*************************************************");
    }

    public static void printBye() {
        System.out.println("*************************************************");
        System.out.println("goodbwye! uwu");
        System.out.println("*************************************************");
    }
}
