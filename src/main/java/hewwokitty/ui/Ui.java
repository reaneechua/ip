package hewwokitty.ui;

public class Ui {
    public static void printStart() {
        String logo =
                ".__                                  __   .__  __    __          \n" +
                "|  |__   ______  _  ____  _  ______ |  | _|__|/  |__/  |_ ___.__.\n" +
                "|  |  \\_/ __ \\ \\/ \\/ /\\ \\/ \\/ /  _ \\|  |/ /  \\   __\\   __<   |  |\n" +
                "|   Y  \\  ___/\\     /  \\     (  <_> )    <|  ||  |  |  |  \\___  |\n" +
                "|___|  /\\___  >\\/\\_/    \\/\\_/ \\____/|__|_ \\__||__|  |__|  / ____|\n" +
                "     \\/     \\/                           \\/               \\/     \n";

        System.out.println(logo);
        System.out.println("*************************************************");
        System.out.println("hewwo! i'm hewwo kitty!");
        System.out.println("i'm just a chatbot uwuwuuwuwuwuwuwuwuwuwuwuuwuwuw");
        System.out.println("*************************************************");
    }

    public static void printBye() {
        System.out.println("*************************************************");
        System.out.println("goodbwye! uwu");
        System.out.println("*************************************************");
    }

    public static void printInvalidCommand() {
        System.out.println("*************************************************");
        System.out.println("i hawve no ideaw what youwe twying to say :( twy again <3");
        System.out.println("*************************************************");
    }

    public static void printInvalidDescription() {
        System.out.println("*************************************************");
        System.out.println("descwiptwion of a todo cawn't be empty! twy again :3");
        System.out.println("*************************************************");
    }

    public static void printInvalidDate() {
        System.out.println("*************************************************");
        System.out.println("date and time entewed shouwd be in yyyy-MM-dd </3");
        System.out.println("*************************************************");
    }
}
