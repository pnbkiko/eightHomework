public class Task {

    TaskPriority taskPriority; // добавьте переменную priority с приоритетом задачи
    private String description;

    public Task(TaskPriority taskPriority, String description) {
        this.taskPriority = taskPriority;
        this.description = description;
    }


    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

// добавьте конструктор класса

            // добавьте метод get для приоритета

    public String getDescription() {
        return description;
    }
}