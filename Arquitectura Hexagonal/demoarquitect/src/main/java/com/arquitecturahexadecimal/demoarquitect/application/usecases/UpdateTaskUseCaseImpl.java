package com.arquitecturahexadecimal.demoarquitect.application.usecases;

import java.util.Optional;

import com.arquitecturahexadecimal.demoarquitect.domain.models.Task;
import com.arquitecturahexadecimal.demoarquitect.domain.ports.in.UpdateTaskUseCase;
import com.arquitecturahexadecimal.demoarquitect.domain.ports.out.TaskRepositoryPort;

public class UpdateTaskUseCaseImpl implements UpdateTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }

    
    

}
