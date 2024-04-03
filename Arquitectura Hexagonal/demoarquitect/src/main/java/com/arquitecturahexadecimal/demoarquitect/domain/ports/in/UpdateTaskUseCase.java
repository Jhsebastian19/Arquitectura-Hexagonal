package com.arquitecturahexadecimal.demoarquitect.domain.ports.in;

import java.util.Optional;

import com.arquitecturahexadecimal.demoarquitect.domain.models.Task;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id,Task updateTask);
}
