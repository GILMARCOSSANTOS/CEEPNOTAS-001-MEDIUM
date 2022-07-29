package com.example.ceep10_mediumcom

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.note_item_view.view.*

/* O Adapter encapsula as notas. */
class NoteListAdapter(private val context: Context, private val notes: MutableList<Note>) :
    RecyclerView.Adapter<NoteListAdapter.NoteViewHolder>() {

    inner class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        /* Essa Classe apenas declara as variáveis do Layout */
        val descriptionNote = itemView.note_item_description
        val titleNote = itemView.note_item_title
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val myLayout = LayoutInflater.from(context).inflate(R.layout.note_item_view, parent, false)
        val holder = NoteViewHolder(myLayout)
        return holder
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val notas = notes[position]
        holder.titleNote.text = notas.title
        holder.descriptionNote.text = notas.description
    }

    override fun getItemCount(): Int {
        return notes.size
    }
}

