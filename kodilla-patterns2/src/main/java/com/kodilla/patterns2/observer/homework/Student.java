package com.kodilla.patterns2.observer.homework;

public interface Student {
    void addMentor(Mentor mentor);
    void notifyMentor();
    void removeMentor(Mentor mentor);
}
