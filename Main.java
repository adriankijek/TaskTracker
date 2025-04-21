// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Task Tracker ====");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter due date (e.g., 2025-05-01): ");
                    String dueDate = scanner.nextLine();
                    manager.addTask(new Task(name, dueDate));
                    System.out.println("Task added.");
                    break;
                case "2":
                    manager.listTasks();
                    break;
                case "3":
                    System.out.print("Enter task number to remove: ");
                    try {
                        int index = Integer.parseInt(scanner.nextLine()) - 1;
                        manager.removeTask(index);
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;
                case "4":
                    System.out.println("Exiting. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

