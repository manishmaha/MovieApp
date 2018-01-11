package com.example.crazziee.tablayoutexample2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Crazziee on 12/5/2017.
 */

public interface MovieApiService {

    @GET("3/movie/popular?api_key=3d9f6ef05faa3072ee2caf7fb6870964&page=1")
    Call<MovieResponse> getPopularMovies(@Query("api_key") String apiKey);

    @GET("3/movie/now_playing?api_key=3d9f6ef05faa3072ee2caf7fb6870964&page=1")
    Call<MovieResponse> getNowPlayingMovies(@Query("api_key") String apiKey );

    @GET("3/movie/upcoming?api_key=3d9f6ef05faa3072ee2caf7fb6870964&page=1")
    Call<MovieResponse> getUpComingMovies(@Query("api_key") String apiKey );
}