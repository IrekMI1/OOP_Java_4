package Tasks;

public abstract class BaseTask<T> implements ITask {
    protected T id;
    protected String creationDate;
    protected String deadLine;
    protected String author;
    protected String description;

    public enum priorityEnum {
        low,
        medium,
        high,
        urgent
    }

    protected priorityEnum priority;

    public BaseTask(T id, String creationDate, String deadLine, String author, String description, priorityEnum priority) {
        this.id = id;
        this.creationDate = creationDate;
        this.deadLine = deadLine;
        this.author = author;
        this.description = description;
        this.priority = priority;

    }

    public T getId() {
        return id;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public priorityEnum getPriority() {
        return priority;
    }

    public void setId(T id) {
        this.id = id;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(priorityEnum priority) {
        this.priority = priority;
    }
}
