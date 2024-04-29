import java.util.ArrayList;
import java.util.Scanner;
public class Task implements Comparable<Task> {

    private String title = "";
    private String description = "";
    private int priority = 0;

    public Task(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Task other) {

        if (this.priority == other.priority) {
            return this.title.compareTo(other.title)*-1;
        } else {
            return String.valueOf(priority).compareTo(String.valueOf(other.priority));
        }
    }

}