package com.plcoding.noteappkmm.data.note

import com.plcoding.noteappkmm.database.NoteDatabase
import com.plcoding.noteappkmm.domain.note.Note
import com.plcoding.noteappkmm.domain.note.NoteDataSource
import com.plcoding.noteappkmm.domain.time.DateTimeUtil

class SqlDelightNoteDataSource(db: NoteDatabase) : NoteDataSource{

    private val queries = db.noteQueries
    override suspend fun insertNote(note: Note) {
        queries.insertNote(
            note.id,
            note.title,
            note.content,
            note.colorHex,
            DateTimeUtil.toEpochMillis(note.created)
        )
    }

    override suspend fun getNoteById(id: Long): Note? {
        TODO("Not yet implemented")
    }

    override suspend fun getaAllNotes(): List<Note> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNoteById(id: Long) {
        TODO("Not yet implemented")
    }
}