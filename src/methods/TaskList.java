package methods;

public class TaskList {
    private TaskNode head;

    private class TaskNode {
        Task task;
        TaskNode next;

        public TaskNode(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;

            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void markTaskCompleted(String taskDescription) {
        TaskNode current = head;

        while (current != null) {
            if (current.task.getTaskDescription().equals(taskDescription)) {
                current.task.markTaskComplete();
                return;
            }

            current = current.next;
        }
    }

    public void displayTasks() {
        TaskNode current = head;

        while (current != null) {
            current.task.displayTaskInfo();
            current = current.next;
        }
    }

}