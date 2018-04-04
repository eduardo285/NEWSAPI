package com.example.edu.newsapi.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Edu on 22/03/2018.
 */

public class RetrofitClient {
    private static Retrofit retrofit=null;
    public static Retrofit getClient(String baseUrl)
    {
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
