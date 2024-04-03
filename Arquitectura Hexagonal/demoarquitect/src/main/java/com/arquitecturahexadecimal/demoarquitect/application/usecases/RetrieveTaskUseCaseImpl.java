package com.arquitecturahexadecimal.demoarquitect.application.usecases;

import java.util.List;
import java.util.Optional;

import com.arquitecturahexadecimal.demoarquitect.domain.models.Task;
import com.arquitecturahexadecimal.demoarquitect.domain.ports.in.RetrieveTaskUseCase;
import com.arquitecturahexadecimal.demoarquitect.domain.ports.out.TaskRepositoryPort;

public class RetrieveTaskUseCaseImpl implements RetrieveTaskUseCase{

    private final TaskRepositoryPort taskRepositoryPort;

    public RetrieveTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;

    
    }
    @Override
    public Optional<Task> getTask(Long id) {
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Task> getAllTasks() {
        return taskRepositoryPort.findAll();
    }


    
}
