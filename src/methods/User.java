package methods;

public class User {

    String userName;
    private TaskList taskList;

    public User(String userName) {
        this.userName = userName;
        this.taskList = new TaskList();
    }

    public String getUserName() {
        return userName;
    }

    public void addTask(Task task) {
        taskList.addTask(task);
    }

    public void markTaskCompleted(String taskDescription) {
        taskList.markTaskCompleted(taskDescription);
    }

    public void displayTasks() {
        System.out.println(userName + "'s Tasks: ");
        taskList.displayTasks();
    }

}
