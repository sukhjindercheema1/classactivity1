package com.example.classactivity1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Getdataservice {

    @GET("Vy2abloQD")
    Call<List<Pokemon>> getPokemons();

}
