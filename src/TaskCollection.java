import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class TaskCollection extends Task{

    private ArrayList<Object> myTasks = new ArrayList<>();

    public TaskCollection(String title, String description, int priority) {
        super(title, description, priority);
    }

    public void addToClass(ArrayList a) {
        for (int i = 0; i<a.size(); i++) {
            myTasks.add(a.get(i));
        }
    }

    public void displayList() {
        for (Object myTask : myTasks) {
            System.out.println(myTask);
        }
    }


}