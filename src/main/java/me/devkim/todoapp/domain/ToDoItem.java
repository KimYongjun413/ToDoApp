package me.devkim.todoapp.domain;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ToDoItem {
    private String id;
    private String title;
    private boolean done;
}
