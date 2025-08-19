package com.example.notes.feature_note.presentation.notes

import com.example.notes.feature_note.domain.model.Note

data class NoteState(
    val notes : List<Note> = emptyList(),
)
