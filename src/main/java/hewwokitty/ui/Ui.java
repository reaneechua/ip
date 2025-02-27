package hewwokitty.ui;

/**
 * Consists of all the interface text displayed to the user
 */
public class Ui {
    /**
     * Displays the starting message upon launching the chatbot
     */
    public static void printStart() {
        String logo =
                ".__                                  __   .__  __    __          \n"
                        + "|  |__   ______  _  ____  _  ______ |  | _|__|/  |__/  |_ ___.__.\n"
                        + "|  |  \\_/ __ \\ \\/ \\/ /\\ \\/ \\/ /  _ \\|  |/ /  \\   __\\   __<   |  |\n"
                        + "|   Y  \\  ___/\\     /  \\     (  <_> )    <|  ||  |  |  |  \\___  |\n"
                        + "|___|  /\\___  >\\/\\_/    \\/\\_/ \\____/|__|_ \\__||__|  |__|  / ____|\n"
                        + "     \\/     \\/                           \\/               \\/     \n";

        System.out.println(logo);
        System.out.println("*************************************************");
        System.out.println("hewwo! i'm hewwo kitty!");
        System.out.println("i'm just a chatbot uwuwuuwuwuwuwuwuwuwuwuwuuwuwuw");
        System.out.println("*************************************************");
    }

    /**
     * Displays the closing message when user ends the chatbot
     */
    public static void printBye() {
        System.out.println("*************************************************");
        System.out.println("goodbwye! uwu");
        System.out.println("*************************************************");
    }

    /**
     * Displays a message to the user when their command is not recognised
     */
    public static void printInvalidCommand() {
        System.out.println("*************************************************");
        System.out.println("i hawve no ideaw what youwe twying to say :( twy again <3");
        System.out.println("*************************************************");
    }

    /**
     * Displays a message to the user telling them that they have entered an invalid
     * description for a Todo object
     */
    public static void printInvalidDescription() {
        System.out.println("*************************************************");
        System.out.println("descwiptwion of a todo cawn't be empty! twy again :3");
        System.out.println("*************************************************");
    }

    /**
     * Displays a message to the user telling them that they have entered a date
     * in an invalid format for a Deadline object
     */
    public static void printInvalidDate() {
        System.out.println("*************************************************");
        System.out.println("date and time entewed shouwd be in yyyy-MM-dd </3");
        System.out.println("*************************************************");
    }
}
