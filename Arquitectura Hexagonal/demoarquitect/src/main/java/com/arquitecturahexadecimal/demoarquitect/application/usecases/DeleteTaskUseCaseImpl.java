package com.arquitecturahexadecimal.demoarquitect.application.usecases;

import com.arquitecturahexadecimal.demoarquitect.domain.ports.in.DeleteTaskUseCase;
import com.arquitecturahexadecimal.demoarquitect.domain.ports.out.TaskRepositoryPort;

public class DeleteTaskUseCaseImpl implements DeleteTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public DeleteTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort){
        this.taskRepositoryPort = taskRepositoryPort;
    }
    @Override
    public boolean deleteTask(Long id){
        return taskRepositoryPort.deleteById(id);
    }

}
