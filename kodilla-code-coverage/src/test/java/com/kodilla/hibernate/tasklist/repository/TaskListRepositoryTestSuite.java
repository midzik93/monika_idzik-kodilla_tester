package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    @Test
    void testFindByListName() {
        // Given
        TaskList taskList = new TaskList("ToDo", "List for tasks to be done");
        taskListRepository.save(taskList);

        // When
        List<TaskList> foundLists = taskListRepository.findByListName("ToDo");

        // Then
        Assertions.assertEquals(1, foundLists.size());
        Assertions.assertEquals("ToDo", foundLists.get(0).getListName());

        // CleanUp
        taskListRepository.deleteById(foundLists.get(0).getId());
    }
}