package com.note.notebookapp.service;

import com.note.notebookapp.exception.NoteNotFoundException;
import com.note.notebookapp.model.Note;
import com.note.notebookapp.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAllByOrderByCreatedAtDesc();
    }

    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    public Note updateNote(Note note) {
        return noteRepository.save(note);
    }

    public void deleteNote(String id) {
        noteRepository.deleteById(id);
    }

    public void addLike(String id) {
        Note note = noteRepository.findById(id)
                                  .orElseThrow(() -> new NoteNotFoundException(id));
        note.setLikes(note.getLikes() + 1);
        noteRepository.save(note);
    }

    public void removeLike(String id) {
        Note note = noteRepository.findById(id)
                                  .orElseThrow(() -> new NoteNotFoundException(id));
        note.setLikes(note.getLikes() - 1);
        noteRepository.save(note);
    }
}
