package com.note.notebookapp.model;

import lombok.Data;

@Data
public class Note {
    private String id;
    private String content;
    private int likes;
}
