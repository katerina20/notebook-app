package com.note.notebookapp.controller;

import com.note.notebookapp.model.Note;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    @GetMapping
    public List<Note> getAllNotes() {
        return new ArrayList<>();
    }

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return new Note();
    }

    @PutMapping("/{id}")
    public Note updateNote(@PathVariable String id, @RequestBody Note note) {
        return new Note();
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable String id) {
    }

    @PostMapping("/{id}/like")
    public void addLike(@PathVariable String id) {
    }

    @PostMapping("/{id}/unlike")
    public void removeLike(@PathVariable String id) {
    }
}
