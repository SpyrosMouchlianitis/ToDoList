package org.spyrosmouchlianitis.todolist;

public class Task implements TaskInterface{
    private String task;
    private static final boolean CHECKED = true;
    private static final boolean UNCHECKED = false;
    private boolean status; //checked or unchecked

    public void setTask(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void checkTask(){
        status = CHECKED;
    }

    public void uncheckTask(){
        status = UNCHECKED;
    }

    public void removeTask(){
        //TODO
    }
}
