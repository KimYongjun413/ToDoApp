package me.devkim.todoapp.domain;

import lombok.*;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
public abstract class ApiResponse<T> {
    @NonNull private T data;
    private List<String> errors;
}