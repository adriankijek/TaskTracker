// TaskManager.java
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    // Add a task to the list
    public void addTask(Task task) {
        tasks.add(task);
    }

    // List all tasks
    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    // Remove a task from the list by index
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task removed = tasks.remove(index);
            System.out.println("Removed: " + removed.getName());
        } else {
            System.out.println("Invalid task number.");
        }
    }
}

