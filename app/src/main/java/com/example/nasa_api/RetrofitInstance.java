package com.example.nasa_api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit;

    public static REtrofitInterface getApiInerface(){

        if (retrofit==null)
        {

            retrofit= new Retrofit.Builder().baseUrl(REtrofitInterface.BASEURL).
                    addConverterFactory(GsonConverterFactory.create()).
                    build();
        }

        return retrofit.create(REtrofitInterface.class);
    }
}
//