package methods;

public class Task {
    private String taskDescription;
    private boolean taskStatus;

    public Task(String taskDescription, boolean taskStatus) {
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public boolean getTaskStatus() {
        return taskStatus;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setTaskStatus(boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

    public void markTaskComplete() {
        this.taskStatus = true;
    }

    public void displayTaskInfo() {
        String status = taskStatus ? "Complete" : "Not Completed";

        System.out.println("Task Description: " + taskDescription + " - Status: " + status);
    }
}
