package com.plcoding.noteappkmm.domain.note

interface NoteDataSource {
    suspend fun insertNote(note: Note)
    suspend fun getNoteById(id: Long): Note?
    suspend fun getaAllNotes(): List<Note>
    suspend fun deleteNoteById(id: Long)
}