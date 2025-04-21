// Task.java
public class Task {
    private String name;
    private String dueDate;

    // Constructor
    public Task(String name, String dueDate) {
        this.name = name;
        this.dueDate = dueDate;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getDueDate() {
        return dueDate;
    }

    // ToString method for displaying task details
    @Override
    public String toString() {
        return "Task Name: " + name + ", Due Date: " + dueDate;
    }
}
