package com.arquitecturahexadecimal.demoarquitect.application.usecases;

import com.arquitecturahexadecimal.demoarquitect.domain.models.Task;
import com.arquitecturahexadecimal.demoarquitect.domain.ports.in.CreateTaskUseCase;
import com.arquitecturahexadecimal.demoarquitect.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase{
private final TaskRepositoryPort taskRepositoryPort;

public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
    this.taskRepositoryPort = taskRepositoryPort;
}

@Override
public Task createTask(Task task){
    return taskRepositoryPort.save(task);
}
}
