package hewwokitty.task;

import java.util.ArrayList;

import hewwokitty.storage.Storage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskListTest {
    @Test
    public void testAddTask() {
        TaskList taskList = new TaskList();
        taskList.addTask("todo cry");
        assertEquals(taskList.getSize(), 1);
    }
}
