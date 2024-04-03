package com.arquitecturahexadecimal.demoarquitect.domain.ports.in;

import com.arquitecturahexadecimal.demoarquitect.domain.models.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
