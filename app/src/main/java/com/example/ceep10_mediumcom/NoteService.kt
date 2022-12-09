package com.example.ceep10_mediumcom

import retrofit2.http.GET

interface NoteService {
    @GET("notes")
    fun list()
}