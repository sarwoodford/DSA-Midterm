import java.util.Scanner;

import methods.User;
import methods.Task;

public class Main {

    public static void main(String[] args) {

        User[] users = new User[5];
        Scanner scanner = new Scanner(System.in);

        users[0] = new User("Sara");
        users[1] = new User("Abby");
        users[2] = new User("Kate");

        users[0].addTask(new Task("Finish homework", false));
        users[0].addTask(new Task("Buy groceries", false));
        users[1].addTask(new Task("Laundry", false));
        users[2].addTask(new Task("Cook dinner", false));

        for (User user : users) {
            if (user != null) {
                user.displayTasks();
            }
        }

        System.out.println("\nMark a task as completed:");
        System.out.print("Enter the users name: ");
        String userName = scanner.nextLine();
        System.out.print("Enter the task description: ");
        String taskDescription = scanner.nextLine();

        for (User user : users) {
            if (user != null && user.getUserName().equalsIgnoreCase(userName)) {
                user.markTaskCompleted(taskDescription);
                System.out.println("Task marked as completed.");
                break;
            }
        }

        System.out.println("\nUpdated tasks:");
        for (User user : users) {
            if (user != null) {
                user.displayTasks();
            }
        }

        scanner.close();
    }
}
