package com.example.nasa_api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface REtrofitInterface {

   String BASEURL ="https://backend-omega-seven.vercel.app/api/";

    @GET("getjoke")
    Call<List<NASA_api>> getposts();



}

