package com.note.notebookapp.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Document("notes")
public class Note {
    @Id
    private String id;

    @NonNull
    private String content;

    private int likes;

    @CreatedDate
    private LocalDateTime createdAt;
}
