import java.util.ArrayList;
import java.util.Scanner;

public class HewwoKitty {
    public static void main(String[] args) {
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

        boolean run = true;
        ArrayList<String> items = new ArrayList<>();
        while (run) {
            Scanner userInput = new Scanner(System.in);
            String userString = userInput.nextLine();
            if (userString.equals("bye")) {
                run = false;
                System.out.println("*************************************************");
                System.out.println("goodbwye! uwu");
                System.out.println("*************************************************");
            } else {
                if (userString.equals("list")) {
                    System.out.println("*************************************************");
                    for (int i = 1; i < items.size() + 1; i++) {
                        System.out.println(i + ". " + items.get(i-1) + "\n");
                    }
                    System.out.println("*************************************************");
                } else {
                    System.out.println("*************************************************");
                    System.out.println("added: " + userString);
                    System.out.println("*************************************************");
                    items.add(userString);
                }
            }

        }
    }
}
