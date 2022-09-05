package com.example.listapelisconGET

import com.example.listapelisconGET.modelodatos.FilmResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    suspend fun getFilms(@Url url:String): Response<FilmResponse>
}
