package com.arquitecturahexadecimal.demoarquitect.domain.ports.in;

import java.util.List;
import java.util.Optional;

import com.arquitecturahexadecimal.demoarquitect.domain.models.Task;

public interface RetrieveTaskUseCase {

    Optional<Task>getTask(Long id);
    List<Task>getAllTasks();
}
