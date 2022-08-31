package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().addTask("To Do");
        board.getInProgressList().addTask("In Progress");
        board.getDoneList().addTask("Tasks done");

        //When
        String toDo = board.getToDoList().getTasks().get(0);
        String inProgress = board.getInProgressList().getTasks().get(0);
        String doneList = board.getDoneList().getTasks().get(0);

        //Then
        assertEquals("To Do", toDo);
        assertEquals("In Progress", inProgress);
        assertEquals("Tasks done", doneList);

    }
}
