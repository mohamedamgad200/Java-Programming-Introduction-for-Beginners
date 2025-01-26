package collection.arraylist.arraylistwithobjectclass;

public class TodoItem {
    private String title;
    private int priority;
    public TodoItem(String title,int priority){
        this.priority=priority;
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public int getPriority()
    {
        return priority;
    }
}
