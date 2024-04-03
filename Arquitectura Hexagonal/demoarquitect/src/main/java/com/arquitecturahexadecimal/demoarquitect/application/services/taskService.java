package com.arquitecturahexadecimal.demoarquitect.application.services;

import java.util.List;
import java.util.Optional;

import com.arquitecturahexadecimal.demoarquitect.domain.models.AdditionalTaskinfo;
import com.arquitecturahexadecimal.demoarquitect.domain.models.Task;
import com.arquitecturahexadecimal.demoarquitect.domain.ports.in.CreateTaskUseCase;
import com.arquitecturahexadecimal.demoarquitect.domain.ports.in.DeleteTaskUseCase;
import com.arquitecturahexadecimal.demoarquitect.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.arquitecturahexadecimal.demoarquitect.domain.ports.in.RetrieveTaskUseCase;
import com.arquitecturahexadecimal.demoarquitect.domain.ports.in.UpdateTaskUseCase;

public class taskService implements CreateTaskUseCase,RetrieveTaskUseCase,UpdateTaskUseCase,DeleteTaskUseCase,GetAdditionalTaskInfoUseCase {

    private final CreateTaskUseCase createTaskUseCase;
    private final RetrieveTaskUseCase retrieveTaskUseCase;
    private final UpdateTaskUseCase updateTaskUseCase;
    private final DeleteTaskUseCase deleteTaskUseCase;
    private final GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase;

    
    public taskService(CreateTaskUseCase createTaskUseCase, RetrieveTaskUseCase retrieveTaskUseCase,
            UpdateTaskUseCase updateTaskUseCase, DeleteTaskUseCase deleteTaskUseCase,
            GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        this.createTaskUseCase = createTaskUseCase;
        this.retrieveTaskUseCase = retrieveTaskUseCase;
        this.updateTaskUseCase = updateTaskUseCase;
        this.deleteTaskUseCase = deleteTaskUseCase;
        this.getAdditionalTaskInfoUseCase = getAdditionalTaskInfoUseCase;
    }

    @Override
    public Task createTask(Task task) {
        return createTaskUseCase.createTask(task);
    }

    @Override
    public AdditionalTaskinfo getAdditionalTaskInfo(Long id) {
        return getAdditionalTaskInfoUseCase.getAdditionalTaskInfo(id);
    }


    @Override
    public Optional<Task> getTask(Long  id) {
        return retrieveTaskUseCase.getTask(id) ;
    }

    @Override
    public List<Task> getAllTasks() {
        return retrieveTaskUseCase.getAllTasks();
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return updateTaskUseCase.updateTask(id, updateTask);
    }

    @Override
    public boolean deleteTask(Long id) {
        return deleteTaskUseCase.deleteTask(id);
    }
}
