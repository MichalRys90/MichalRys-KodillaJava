package com.kodilla.patterns2.observer.homework;


public class Mentor implements Notification {
    private final String name;
    private int count;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Task task) {
        System.out.println(name + " new task from user " + task.getName() + "\ntotal tasks: "
                + task.getTasks().size());
        count++;
    }

    public int getCount() {
        return count;
    }
}
