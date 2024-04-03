package com.arquitecturahexadecimal.demoarquitect.domain.models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Task {
    private long id;
    private String title;
    private String description;
    private LocalDateTime creationDate;
    private boolean completed;
    }

