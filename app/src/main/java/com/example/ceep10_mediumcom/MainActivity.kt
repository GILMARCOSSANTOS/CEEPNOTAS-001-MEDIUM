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

    private var listNotes: MutableList<Note>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /*  functions() */
        hideActionBar()
        actionBarTitleCenter()
        settingRecyclerView()
        instanciarClasseNotas()
    }

    private fun settingRecyclerView(){
        val context: Context
        note_list_recyclerView.setHasFixedSize(true)
        note_list_recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun instanciarClasseNotas(){
        listNotes = mutableListOf()
        val adapterNotas = NoteListAdapter(this, listNotes!!)
        note_list_recyclerView.adapter = adapterNotas

        val nota01 = Note(
            title = "Meu título 001",
            description = "Minha descrição 002"
        )
        listNotes!!.add(nota01)

    }

    private fun hideActionBar(){
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        actionBar?.hide()
    }

    private fun actionBarTitleCenter(){
        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar?.setCustomView(R.layout.actionbar_title_center)
    }
}