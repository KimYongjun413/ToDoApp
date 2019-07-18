package me.devkim.todoapp.controller;

import me.devkim.todoapp.domain.ToDoItem;
import me.devkim.todoapp.domain.ToDoItemAdapter;
import me.devkim.todoapp.domain.ToDoItemResponse;
import me.devkim.todoapp.services.ToDoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoItemController {

    @Autowired
    private ToDoItemService toDoItemService;

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public @ResponseBody
    ToDoItemResponse get(@PathVariable(value = "id") String id) {
        List<String> errors = new ArrayList<>();
        ToDoItem toDoItem = null;
        try {
            toDoItem = toDoItemService.get(id);
        } catch (final Exception e) {
            errors.add(e.getMessage());
        }
        return ToDoItemAdapter.toToDoItemResponse(toDoItem, errors);
    }

}