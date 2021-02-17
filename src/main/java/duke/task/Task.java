package duke.task;

public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "[X] " : "[ ] ");
    }

    public String getDescription() {
        return description;
    }

    public void setDone() {
        isDone = true;
    }

    public boolean isDone() {
        return isDone;
    }

    @Override
    public String toString() {
        return getStatusIcon() + getDescription();
    }
}