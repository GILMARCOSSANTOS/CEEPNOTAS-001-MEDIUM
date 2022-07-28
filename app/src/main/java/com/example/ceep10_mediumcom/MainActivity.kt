package com.example.ceep10_mediumcom

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /* Global Declare Variables: */
    private var listNotes: MutableList<Note>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*  Functions(): */
        hideActionBar()
        actionBarTitleCenter()
        settingRecyclerView()
        instanciarClasseNotas()
    }

    private fun settingRecyclerView() {
        note_list_recyclerView.setHasFixedSize(true)
        note_list_recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun instanciarClasseNotas() {
        listNotes = mutableListOf()
        val adapterNotas = NoteListAdapter(this, listNotes!!)
        note_list_recyclerView.adapter = adapterNotas

        val nota01 = Note(
            title = "Meu título 001",
            description = "Minha descrição 001"
        )
        listNotes!!.add(nota01)

        val nota02 = Note(
            title = "Meu título 002",
            description = "Minha descrição 002"
        )
        listNotes!!.add(nota02)

        val nota03 = Note(
            title = "Meu título 003",
            description = "Minha descrição 003"
        )
        listNotes!!.add(nota03)

        val nota04 = Note(
            title = "Meu título 004",
            description = "Minha descrição 004"
        )
        listNotes!!.add(nota04)

        val nota05 = Note(
            title = "Meu título 005",
            description = "Minha descrição 005"
        )
        listNotes!!.add(nota05)

        val nota06= Note(
            title = "Meu título 006",
            description = "Minha descrição 006"
        )
        listNotes!!.add(nota06)

        val nota07 = Note(
            title = "Meu título 007",
            description = "Minha descrição 007"
        )
        listNotes!!.add(nota07)

        val nota08 = Note(
            title = "Meu título 008",
            description = "Minha descrição 008"
        )
        listNotes!!.add(nota08)

        val nota09 = Note(
            title = "Meu título 009",
            description = "Minha descrição 009"
        )
        listNotes!!.add(nota09)

        val nota10 = Note(
            title = "Meu título 010",
            description = "Minha descrição 010"
        )
        listNotes!!.add(nota10)
    }

    private fun hideActionBar() {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
    }

    private fun actionBarTitleCenter() {
        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.actionbar_title_center)
    }
}