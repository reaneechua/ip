package hewwokitty;

import hewwokitty.parser.Parser;
import hewwokitty.storage.Storage;
import hewwokitty.task.TaskList;
import hewwokitty.ui.Ui;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * JavaFX GUI for HewwoKitty chatbot.
 */
@SuppressWarnings("checkstyle:AbbreviationAsWordInName")
public class HewwoKittyGUI extends Application {
    private TaskList taskList;
    private Parser parser;
    private TextArea chatArea;
    private TextField userInput;
    private ByteArrayOutputStream outputStream;

    /**
     * Function for the initial creation of the GUI
     * @param primaryStage A Stage
     */
    @Override
    public void start(Stage primaryStage) {
        taskList = Storage.readFromFile();
        parser = new Parser();

        primaryStage.setTitle("HewwoKitty Chatbot");

        chatArea = new TextArea();
        chatArea.setEditable(false);
        chatArea.setWrapText(true);

        ScrollPane scrollPane = new ScrollPane(chatArea);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        userInput = new TextField();
        userInput.setPromptText("Type your message...");

        Button sendButton = new Button("Send");
        sendButton.setOnAction(e -> handleUserInput());

        VBox layout = new VBox(10, scrollPane, userInput, sendButton);
        layout.setPadding(new Insets(10));

        primaryStage.setScene(new Scene(layout, 400, 500));
        primaryStage.show();

        captureSystemOutput();
        Ui.printStart();
        appendCapturedOutput();
    }

    private void handleUserInput() {
        String input = userInput.getText().trim();
        if (!input.isEmpty()) {
            appendToChat("You: " + input);

            boolean isRunning = parser.processUserCommands(input, taskList);
            appendCapturedOutput();
            userInput.clear();

            if (!isRunning) {
                appendToChat("hewwo kitty is cwosing uwu~");
                System.exit(0);
            }
        }
    }

    private void appendToChat(String message) {
        chatArea.appendText(message + "\n");
    }

    private void captureSystemOutput() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    private void appendCapturedOutput() {
        String output = outputStream.toString().trim();
        if (!output.isEmpty()) {
            appendToChat(output);
            outputStream.reset();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
