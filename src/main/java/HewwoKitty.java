import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HewwoKitty {
    public static void main(String[] args) {
        printStart();
        boolean isRunning = true;
        TaskList taskList = new TaskList();
        Scanner userInput = new Scanner(System.in);
        while (isRunning) {
            String userString = userInput.nextLine();
            if (userString.equals("bye")) {
                isRunning = false;
                printBye();
            } else {
                if (userString.equals("list")) {
                    System.out.print(taskList);
                } else if (userString.split(" ")[0].equals("mark")){
                    int taskNum = Integer.parseInt(userString.split(" ")[1]);
                    taskList.markDone(taskNum);
                    writeToFile(taskList);
                } else if (userString.split(" ")[0].equals("unmark")) {
                    int taskNum = Integer.parseInt(userString.split(" ")[1]);
                    taskList.unmarkDone(taskNum);
                    writeToFile(taskList);
                } else if (userString.contains("todo") || userString.contains("deadline") || userString.contains("event")) { // add tasks
                    taskList.addTask(userString);
                    writeToFile(taskList);
                } else if (userString.contains("delete")) {
                    int i = Integer.parseInt(userString.split(" ")[1]);
                    taskList.removeTask(i);
                    writeToFile(taskList);
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

    public static void writeToFile(TaskList tasks) {
        File file = new File("./data/hewwoTasks.txt");
        file.getParentFile().mkdirs();

        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(tasks.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
