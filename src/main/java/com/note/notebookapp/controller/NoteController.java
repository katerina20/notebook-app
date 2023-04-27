package com.note.notebookapp.controller;

import com.note.notebookapp.model.Note;
import com.note.notebookapp.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    @Autowired
    NoteService noteService;

    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteService.createNote(note);
    }

    @PutMapping("/{id}")
    public Note updateNote(@PathVariable String id, @RequestBody Note note) {
        note.setId(id);
        return noteService.updateNote(note);
    }

    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable String id) {
        noteService.deleteNote(id);
    }

    @PostMapping("/{id}/like")
    public void addLike(@PathVariable String id) {
        noteService.addLike(id);
    }

    @PostMapping("/{id}/unlike")
    public void removeLike(@PathVariable String id) {
        noteService.removeLike(id);
    }
}
